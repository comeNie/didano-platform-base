package cn.didano.robot.api;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * robot websocket 上行信息
 * @author stephen.wang 2017-03-02 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY) 
public class ReportInfo {
	private String methodName;
	private String info;
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
