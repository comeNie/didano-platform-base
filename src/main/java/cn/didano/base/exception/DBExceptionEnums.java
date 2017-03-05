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
	ERROR_DB_SELECT(-1,"查询错误"),
	ERROR_DB_UPDATE(-2,"更新错误"),
	ERROR_DB_INSERT(-3,"插入错误"),
	ERROR_DB_DELETE(-4,"删除错误"),
	ERROR_DB_COUNT(-5,"求和错误"),
	
	ERROR_DB_LESS_1(-10,"id参数小于1"),
	ERROR_DB_ID(-11,"ID非法"),
	ERROR_DB_CONTENT_NULL(-13,"内容为空"),
	ERROR_DB_OTHER(-14,"其他错误"),
	
	
	ERROR_MONGODB_SELECT(-21,"mongodb查询错误"),
	ERROR_MONGODB_UPDATE(-22,"mongodb更新错误"),
	ERROR_MONGODB_SAVE(-23,"mongodb保存错误"),
	ERROR_MONGODB_DELETE(-24,"mongodb删除错误"),
	ERROR_MONGODB_COUNT(-25,"mongodb求和错误");
	
	public int code;
	public String message;

	private DBExceptionEnums(int code, String message) {
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
