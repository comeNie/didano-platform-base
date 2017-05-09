package cn.didano.video.controller;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.didano.base.exception.ServiceException;
import cn.didano.base.model.Wx_official_account;
import cn.didano.base.model.Wx_org_official_account;
import cn.didano.base.model.Wx_template;
import cn.didano.base.service.WeiXinService;
import cn.didano.video.constant.BackType;
import cn.didano.video.json.In_Template_Add;
import cn.didano.video.json.In_WeiChat_Account_Add;
import cn.didano.video.json.Out;
import cn.didano.video.json.OutList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;

@Api(value = "微信公众号模块", tags = "微信公众号模块")
@RestController
@RequestMapping(value = "/video/weichat/post/")
public class WeiChatController {

	static Logger logger = Logger.getLogger(InteractiveModelWritingController.class);
	@Autowired
	private WeiXinService weixinService;

	/**
	 * 新增编辑微信公众信息
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "新增编辑微信公众信息", notes = "新增微信公众信息")
	@PostMapping(value = "wx_official_account_add")
	@ResponseBody
	public Out<String> Wx_account_add(
			@ApiParam(value = "新增编辑微信公众信息", required = true) @RequestBody In_WeiChat_Account_Add account) {
		logger.info("访问  WeiChatController:Teacher_add,In_WeiChat_Account_Add=" + account);

		Out<String> back = new Out<String>();
		Wx_official_account wx_official_account = new Wx_official_account();
		Wx_org_official_account wx_org_official_account=new Wx_org_official_account();
		try {
			BeanUtils.copyProperties(wx_official_account, account);
			if (wx_official_account.getId() == null) {// 新增
				String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
						+ account.getAppid() + "&secret=" + account.getAppsecrect();
				// 设置链接
				URL urlGet = new URL(url);
				// 启动链接
				HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
				// 设置链接参数与要求
				http.setRequestMethod("GET"); // 必须是get方式请求
				http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				http.setDoOutput(true);
				http.setDoInput(true);
				System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30�?
				System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30�?
				// 链接
				http.connect();
				// 获取返回值json字节流
				InputStream is = http.getInputStream();
				int size = is.available();
				byte[] jsonBytes = new byte[size];
				is.read(jsonBytes);
				// 转化成字符串
				String message = new String(jsonBytes, "UTF-8");
				// 转化成json对象然后返回accessToken属性的值
				JSONObject demoJson = JSONObject.fromObject(message);
				String accessToken = demoJson.getString("access_token");
				System.out.println(accessToken);
				is.close();

				wx_official_account.setCreated(new Date());
				wx_official_account.setToken(accessToken);

				int row = weixinService.insertAccountSelective(wx_official_account);

				wx_org_official_account.setOfficialAccountId(wx_official_account.getId());
				wx_org_official_account.setCreated(new Date());
				wx_org_official_account.setOrgId(account.getOrgId());
				weixinService.insertOrg_accountSelective(wx_org_official_account);
				if (row > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + wx_official_account.getId());

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
				}
			} else {// 编辑

				int row = weixinService.updateAccount(wx_official_account);

				if (row > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + wx_official_account.getId());

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
				}
			}

		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}

		return back;
	}

	/**
	 * 查找所有微信公众号信息
	 */
	@PostMapping(value = "findAllAccount")
	@ApiOperation(value = "查找所有微信公众号信息", notes = "查找所有微信公众号信息")
	@ResponseBody
	public Out<OutList<Wx_official_account>> findAllAccount() {
		logger.info("访问   WeiChatController :findAllAccount");
		List<Wx_official_account> accounts = null;
		OutList<Wx_official_account> outList = null;
		Out<OutList<Wx_official_account>> back = new Out<OutList<Wx_official_account>>();
		try {
			accounts = weixinService.findAllAccount();
			if (accounts.size() > 0) {

				outList = new OutList<Wx_official_account>(accounts.size(), accounts);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
			} else {

				back.setBackTypeWithLog(outList, BackType.FAIL_SEARCH_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

	/**
	 * 删除微信公众信息
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "删除微信公众信息", notes = "删除微信公众信息")
	@PostMapping(value = "wx_official_account_delete/{id}")
	@ResponseBody
	public Out<String> Wx_account_delete(@PathVariable("id") Integer id) {
		logger.info("访问  WeiChatController:Teacher_add,id=" + id);

		Out<String> back = new Out<String>();

		try {
			int row = weixinService.deleteAccount(id);
             weixinService.deleteOrg_account(id);
			if (row > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=");

			} else {
				// 更新有问题
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
			}

		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}

		return back;
	}

	/**
	 * 新增编辑模板信息
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "新增编辑模板信息", notes = "新增编辑模板信息")
	@PostMapping(value = "template_add")
	@ResponseBody
	public Out<String> template_add(
			@ApiParam(value = "新增编辑微信公众信息", required = true) @RequestBody In_Template_Add template) {
		logger.info("访问  WeiChatController:template_add,In_Template_Add=" + template);

		Out<String> back = new Out<String>();
		Wx_template wx_template = new Wx_template();

		try {
			BeanUtils.copyProperties(wx_template, template);
			if (wx_template.getId() == null) {// 新增

				wx_template.setCreated(new Date());

				int row = weixinService.insertTemplateSelective(wx_template);

				if (row > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + wx_template.getId());

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
				}
			} else {// 编辑

				int row = weixinService.updateTemplayte(wx_template);

				if (row > 0) {
					back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=" + wx_template.getId());

				} else {
					// 更新有问题
					back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
				}
			}

		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}

		return back;
	}
	
	/**
	 * 删除模板
	 * 
	 * @param c_channel
	 * @return
	 */
	@ApiOperation(value = "删除模板", notes = "删除模板")
	@PostMapping(value = "template_delete/{id}")
	@ResponseBody
	public Out<String> template_delete(@PathVariable("id") Integer id) {
		logger.info("访问  WeiChatController:template_add,id=" + id);

		Out<String> back = new Out<String>();

		try {
			int row = weixinService.deleteTemplate(id);

			if (row > 0) {
				back.setBackTypeWithLog(BackType.SUCCESS_INSERT, "Id=");

			} else {
				// 更新有问题
				back.setBackTypeWithLog(BackType.FAIL_UPDATE_AFTER_INSERT, "rowNum=" + row);
			}

		} catch (Exception ex) {
			back.setBackTypeWithLog(BackType.FAIL_INSERT_NORMAL, ex.getMessage());
		}

		return back;
	}
	/**
	 * 查找所有模板
	 */
	@PostMapping(value = "findAllTemplate")
	@ApiOperation(value = "查找所有模板", notes = "查找所有模板")
	@ResponseBody
	public Out<OutList<Wx_template>> findAllTemplate() {
		logger.info("访问   WeiChatController :findAllTemplate");
		List<Wx_template> templates = null;
		OutList<Wx_template> outList = null;
		Out<OutList<Wx_template>> back = new Out<OutList<Wx_template>>();
		try {
			templates = weixinService.findAllTemplate();
			if (templates.size() > 0) {

				outList = new OutList<Wx_template>(templates.size(), templates);
				back.setBackTypeWithLog(outList, BackType.SUCCESS_SEARCH_NORMAL);
			} else {

				back.setBackTypeWithLog(outList, BackType.FAIL_SEARCH_NORMAL);
			}
		} catch (ServiceException e) {
			logger.warn(e.getMessage());
			back.setServiceExceptionWithLog(e.getExceptionEnums());
		}
		return back;
	}

}
