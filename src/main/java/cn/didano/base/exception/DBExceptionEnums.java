package cn.didano.base.exception;

/**
 * 反馈信息是一个体系，包括
 * 1，数据库错误反馈信息
 * 2，平台信息
 * 3，接口反馈信息
 * 4，模块反馈信息
 * 
 * @author stephen
 * Created on 2016年12月26日 上午11:24:32 
 */
public enum DBExceptionEnums implements ExceptionEnums {
	ERROR_DB_SELECT("查询错误",-1),
	ERROR_DB_UPDATE("更新错误",-2),
	ERROR_DB_INSERT("插入错误",-3),
	ERROR_DB_DELETE("删除错误",-4),
	ERROR_DB_COUNT("求和错误",-5),
	
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
