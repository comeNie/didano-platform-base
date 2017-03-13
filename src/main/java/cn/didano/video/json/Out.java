package cn.didano.video.json;

import org.apache.log4j.Logger;

import cn.didano.base.exception.BackType;
import cn.didano.base.exception.ExceptionEnums;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回json信息
 * 
 * @author stephen Created on 2016年12月26日 上午10:57:00
 */
@ApiModel
public class Out<T> {
	static Logger logger = Logger.getLogger(Out.class);
	@ApiModelProperty(value = "成功或者失败",required=true)
	private boolean success;
	@ApiModelProperty(value = "返回提示信息",required=true)
	private String message;
	@ApiModelProperty(value = "返回编码，1000-2000成功信息,2000-3000错误信息;成功-1000,新建成功-1001,更新成功-1002,删除成功-1003,设置成功-1004,查询成功-1007"
	+"数据库操作异常-2101,插入异常-2112,更新异常-2161,查询失败-2181",required=true,example="1000")
	private int code;
	@ApiModelProperty(value = "实体信息，例如列表或者对象")
	private T data;
	
	public Out(){
	}

	/**
	 * 操作类型接口，返回不需要data数据
	 * @param type
	 */
	public Out(BackType type) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {
			this.success = true;
		} else {
			this.success = false;
		}
		this.code = type.getCode();
		this.message = type.getMessage();
		Object o = new String("");
		this.setData((T)o);
	}
	
	public Out(BackType type,T data) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {
			this.success = true;
		} else {
			this.success = false;
		}
		this.code = type.getCode();
		this.message = type.getMessage();
		this.data = data;
	}

	public Out(BackType type, String message) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {
			this.success = true;
		} else {
			this.success = false;
		}
		this.code = type.getCode();
		this.message = type.getMessage() + ":" + message;
		Object o = new String("");
		this.setData((T)o);
	}
	
	public Out(BackType type, T data,String message) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {
			this.success = true;
		} else {
			this.success = false;
		}
		this.code = type.getCode();
		this.data = data;
		this.message = type.getMessage() + ":" + message;
	}
	
	public void setBackTypeWithLog(BackType type) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {
			this.success = true;
			logger.debug(type.getMessage());
		} else {
			this.success = false;
			logger.error(type.getMessage());
		}
		this.code = type.getCode();
		this.message = type.getMessage();
		Object o = new String("");
		this.setData((T)o);
	}
	
	/**
	 * @param data
	 * @param type
	 */
	public void setBackTypeWithLog(T data,BackType type) {
		setBackTypeWithLog(type);
		this.data = data;
	}
	
	/**
	 * 设置返回信息，返回信息不包含第二参数message，第二参数message只是用来日志
	 * @param type
	 * @param message
	 */
	public void setBackTypeWithLog(BackType type, String message) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {//2000
			this.success = true;
			logger.debug(type.getMessage() + ":" + message);
		} else {
			logger.error(type.getMessage() + ":" + message);
			this.success = false;
		}
		this.code = type.getCode();
		this.message = type.getMessage();
		Object o = new String("");
		this.setData((T)o);
	}

	/**
	 * 设置返回信息，返回信息不包含第二参数message，第二参数message只是用来日志
	 * @param type
	 * @param message
	 */
	public void setBackTypeWithLog(BackType type,T data, String message) {
		if (type.getCode() < BackType.FAIL_DOWN_LINE.getCode()) {//2000
			this.success = true;
			logger.debug(type.getMessage() + ":" + message);
		} else {
			logger.error(type.getMessage() + ":" + message);
			this.success = false;
		}
		this.code = type.getCode();
		this.message = type.getMessage();
		this.data = data;
	}

	public void setServiceExceptionWithLog(ExceptionEnums exceptionEnums) {
		logger.error(exceptionEnums.getMessage());
		this.success = false;
		this.code = BackType.FAIL_DB.getCode();
		this.message = BackType.FAIL_DB.getMessage();
		Object o = new String("");
		this.setData((T)o);
	}

	/**
	 * 设置返回信息，封装来自于数据层的错误
	 * 返回信息不包含第二参数message，第二参数message只是用来日志
	 * @param exceptionEnums
	 * @param message
	 */
	public void setServiceExceptionWithLog(ExceptionEnums exceptionEnums, String message) {
		logger.error(exceptionEnums.getMessage() + ":" + message);
		this.success = false;
		this.code = BackType.FAIL_DB.getCode();
		this.message = BackType.FAIL_DB.getMessage();
		Object o = new String("");
		this.setData((T)o);
	}
	

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	/**
	 * 不要直接调用这个方法，data由构造器带入
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Out [success=" + success + ", message=" + message + ", code=" + code + ", data=" + data + "]";
	}
	
}
