package cn.didano.base.exception;

/**
 * 数据层错误
 * 反馈信息是一个体系，包括
 * 1，数据库错误反馈信息
 * 2，平台信息
 * 3，接口反馈信息
 * 4，模块反馈信息
 * 
 * -1以下是数据库错误，0-100平台信息 100-200内部接口信息
 * 201-300 websocket
 * 301以上1000以下预留给模块，应用反馈信息，视频应用，1000-2000 视频成功信息 2000-3000视频错误信息
 * @author stephen
 * Created on 2016年12月26日 上午9:50:49 
 */
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 4388213633132522938L;
	
	private ExceptionEnums exceptionEnums;

	public ServiceException(ExceptionEnums exceptionEnums) {
		this.exceptionEnums = exceptionEnums;
	}

	public ExceptionEnums getExceptionEnums() {
		return exceptionEnums;
	}
}