package cn.didano.video.constant;

import cn.didano.base.exception.DBExceptionEnums;

/**
 * 上层业务操作返回信息，
 * 本层信息在数据库反馈信息之上，这样的设计有助于将模块分开，
 * 负数以下是底层数据库错误，查看DBException
 * 
 * 反馈信息是一个体系，包括
 * 1，数据库错误反馈信息
 * 2，平台信息
 * 3，接口反馈信息
 * 4，模块反馈信息
 * 
 * -1以下是数据库错误，0-100平台信息 100-200接口信息 201以上1000以下预留给模块，应用反馈信息，视频应用，1000-2000 视频成功信息 2000-3000视频错误信息
 * @author stephen Created on 2016年12月20日 下午1:14:35
 * {@link} DBExcetionEnum
 */
public enum BackType {
	//负数以下是底层数据库错误，查看DBException
	SUCCESS("成功", 1000),
	SUCCESS_INSERT("新建成功", 1001),
	SUCCESS_UPDATE("更新成功", 1002),
	SUCCESS_DELETE("删除成功", 1003),
	SUCCESS_SET("设置成功", 1004),
	SUCCESS_SEARCH_NORMAL("查询成功",1007),
	SUCCESS_CREATE_OSS("创建OSS频道成功", 1011),
	SUCCESS_OPER_SWITCH("设置视频频道开关成功", 1030),
	SUCCESS_WEBSOCKET_SEND("成功发送websocket协议消息", 1040),
	
	// fail 2000-3000  
	// 数据库操作异常信息不能直接暴露给前端，采用FAIL_DB翻译
	FAIL_DOWN_LINE("异常范围底值", 2000),
	FAIL_DB("数据库操作异常", 2101),
	FAIL_INSERT_NORMAL("插入异常", 2112),
	FAIL_INSERT_NO_USE("没有开关值", 2113),
	FAIL_INSERT_NO_INSERT("没有插入数据", 2114),
	// fail oper 2161-2170  
	FAIL_OPER_SWITCH("设置视频频道开关失败", 2121),
	FAIL_OPER_NO_MATCH_CARD("请输入正确的编号", 2122),
	FAIL_OPER_NO_PARENT_CARD("请输入正确的家长ic卡编号", 2123),
	FAIL_OPER_NO_STUDENT_CARD("请输入正确的学生ic卡编号", 2124),
	FAIL_OPER_NO_STAFF_CARD("请输入正确的教职工ic卡编号", 2125),
	FAIL_OPER_NO_BOUNDSTATE_CARD("卡号", 2126),
	// fail update 2161-2180  
	FAIL_UPDATE_NORMAL("更新异常", 2161),
	FAIL_UPDATE_NO_KEY("没有主键", 2162),
	FAIL_UPDATE_NO_USE("没有开关值", 2163),
	FAIL_UPDATE_NO_UPDATE("没有更新到任何数据", 2168),
	FAIL_UPDATE_UPDATEMORE("更新超过一条数据", 2169),
	FAIL_UPDATE_AFTER_INSERT("新建后更新本条数据异常", 2170),
	// fail search delete 2181-2190  
	FAIL_SEARCH_NORMAL("查询失败", 2181),
	FAIL_DELETE_NORMAL("删除数据异常", 2182),
	FAIL_DELETE_NO_DELETE("无效删除", 2183)
	;
	private String message;
	private int code;

	private BackType(String message, int code) {
		this.message = message;
		this.code = code;
	}
	
	private BackType(DBExceptionEnums dBExceptionEnums){
		this.message= dBExceptionEnums.getMessage();
		this.code = dBExceptionEnums.getCode();
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
	
	
}
