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
 * -1以下是数据库错误，0-100平台信息 100-200接口信息 201-300诊断平台信息
 * 300以上1000以下预留给模块，
 * 应用反馈信息，视频应用，1000-2000 视频成功信息 2000-3000视频错误信息
 * @author stephen Created on 2016年12月20日 下午1:14:35
 * {@link} DBExcetionEnum
 */
public enum BackType {
	//负数以下是底层数据库错误，查看DBException
	//201-300诊断平台信息
	SUCCESS_DIAGNOSE_WEBSOCKET(201,"成功"),
	SUCCESS_DIAGNOSE_INSERT(202,"保存数据成功"),
	
	FAIL_DIAGNOSE_WRONG(251,"数据格式错误"),
	FAIL_DIAGNOSE_WRONG_FORMAT(252,"数据格式错误"),
	FAIL_DIAGNOSE_WRONG_METHOD(253,"错误方法名"),
	FAIL_DIAGNOSE_CANNOT_EMPTY(254,"不能为空"),
	
	SUCCESS(1000,"成功"),
	SUCCESS_INSERT(1001,"新建成功"),
	SUCCESS_UPDATE(1002,"更新成功"),
	SUCCESS_DELETE(1003,"删除成功"),
	SUCCESS_SET(1004,"设置成功"),
	SUCCESS_SEARCH_NORMAL(1007,"查询成功"),
	SUCCESS_CREATE_OSS(1011,"创建OSS频道成功"),
	SUCCESS_OPER_SWITCH(1030,"设置视频频道开关成功"),
	SUCCESS_WEBSOCKET_SEND(1040,"成功发送websocket协议消息"),
	
	// fail 2000-3000  
	// 数据库操作异常信息不能直接暴露给前端，采用FAIL_DB翻译
	FAIL_DOWN_LINE(2000,"异常范围底值"),
	FAIL_DB(2101,"数据库操作异常"),
	FAIL_INSERT_NORMAL(2112,"插入异常"),
	FAIL_INSERT_NO_USE(2113,"没有开关值"),
	FAIL_INSERT_NO_INSERT(2114,"没有插入数据"),
	// fail oper 2161-2170  
	FAIL_OPER_SWITCH(2121,"设置视频频道开关失败"),
	// fail update 2161-2180  
	FAIL_UPDATE_NORMAL(2161,"更新异常"),
	FAIL_UPDATE_NO_KEY(2162,"没有主键"),
	FAIL_UPDATE_NO_USE(2163,"没有开关值"),
	FAIL_UPDATE_NO_UPDATE(2168,"没有更新到任何数据"),
	FAIL_UPDATE_UPDATEMORE(2169,"更新超过一条数据"),
	FAIL_UPDATE_AFTER_INSERT(2170,"新建后更新本条数据异常"),
	// fail search delete 2181-2190  
	FAIL_SEARCH_NORMAL(2181,"查询失败"),
	FAIL_DELETE_NORMAL(2182,"删除数据异常"),
	FAIL_DELETE_NO_DELETE(2183,"无效删除")
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
