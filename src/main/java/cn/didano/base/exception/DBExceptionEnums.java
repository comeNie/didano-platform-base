package cn.didano.base.exception;

/**
 * 数据库操作检测错误信息
 * 准备去掉这个
 * 
 * @author stephen
 * Created on 2016年12月26日 上午11:24:32 
 */
public enum DBExceptionEnums implements ExceptionEnums {
	ERROR_DIAGNOSE_DIVICENO_NOT_EXIST("不存在的设备编号",-9),
	ERROR_DB_LESS_1("id参数小于1",-10),
	ERROR_DB_ID("ID非法",-11),
	ERROR_DB_CONTENT_NULL("内容为空",-13),
	ERROR_DB_OTHER("其他错误",-14);
	
	public int code;
	public String message;

	private DBExceptionEnums(String message,int code) {
		this.code = code;
		this.message = message;
	}

	private DBExceptionEnums(int code, String message,Exception e) {
		this.code = code;
		this.message = message;
	}
	
	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
