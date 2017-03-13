package cn.didano.base.exception;

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
 * -1以下是数据库检测错误，0-1000平台信息内部信息，预留
 * 1000-2000成功信息 2000-错误信息
 * @author stephen Created on 2016年12月20日 下午1:14:35
 * {@link} DBExcetionEnum
 */
public enum BackType {
	//负数以下是底层数据库检测错误

	// 视频反馈信息，视频应用，1000-1100 视频成功信息 1100-1200视频错误信息  
	SUCCESS(1000,"成功"),
	SUCCESS_INSERT(1001,"新建成功"),
	SUCCESS_UPDATE(1002,"更新成功"),
	SUCCESS_DELETE(1003,"删除成功"),
	SUCCESS_SET(1004,"设置成功"),
	SUCCESS_SEARCH_NORMAL(1007,"查询成功"),
	SUCCESS_CREATE_OSS(1011,"创建OSS频道成功"),
	SUCCESS_OPER_SWITCH(1030,"设置视频频道开关成功"),
	SUCCESS_WEBSOCKET_SEND(1040,"成功发送websocket协议消息"),
	
	//1301-1400诊断平台信息
	SUCCESS_DIAGNOSE_WEBSOCKET_CONNECT(1201,"成功"),
	SUCCESS_DIAGNOSE_SAVE(1202,"保存数据成功"),
	SUCCESS_DIAGNOSE_EXCUTE(1203,"执行控制命令成功"),

	// 数据库操作异常信息不能直接暴露给前端，采用FAIL_DB翻译
	FAIL_DOWN_LINE(2000,"异常范围底值"),
	FAIL_DB(2001,"数据库操作异常"),
	FAIL_INSERT_NORMAL(2002,"插入异常"),
	FAIL_INSERT_NO_USE(2003,"没有开关值"),
	FAIL_INSERT_NO_INSERT(2004,"没有插入数据"),
	FAIL_OPER_SWITCH(2021,"设置视频频道开关失败"),
	FAIL_UPDATE_NORMAL(2061,"更新异常"),
	FAIL_UPDATE_NO_KEY(2062,"没有主键"),
	FAIL_UPDATE_NO_USE(2063,"没有开关值"),
	FAIL_UPDATE_NO_UPDATE(2068,"没有更新到任何数据"),
	FAIL_UPDATE_UPDATEMORE(2069,"更新超过一条数据"),
	FAIL_UPDATE_AFTER_INSERT(2070,"新建后更新本条数据异常"),
	FAIL_SEARCH_NORMAL(2081,"查询失败"),
	FAIL_DELETE_NORMAL(2082,"删除数据异常"),
	FAIL_DELETE_NO_DELETE(2083,"无效删除"),
	
	//诊断平台异常 2201-2300  
	FAIL_DIAGNOSE_WRONG(2201,"接口调用异常"),
	FAIL_DIAGNOSE_WRONG_FORMAT(2202,"数据格式错误"),
	FAIL_DIAGNOSE_WRONG_METHOD(2203,"错误方法名"),
	FAIL_DIAGNOSE_CANNOT_EMPTY(2204,"不能为空"),
	FAIL_DIAGNOSE_EXCUTE(2204,"执行控制命令失败"),
	
	FAIL_DIAGNOSE_MONGO_SAVE(2220,"保存数据失败"),
	FAIL_DIAGNOSE_MONGO_UPDATE(2221,"更新数据失败"),
	FAIL_DIAGNOSE_MONGO_FIND(2222,"查询数据失败"),
	FAIL_DIAGNOSE_MONGO_DELETE(2223,"删除数据失败"),
	;
	private String message;
	private int code;

	private BackType(int code,String message) {
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
