package cn.didano.robot.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * robot websocket 上行信息
 * @author stephen.wang 2017-03-02 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY) 
public class UpInfo {
	private String methodName;
	private String deviceNo;
	private JsonNode info;
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public JsonNode getInfo() {
		return info;
	}
	public void setInfo(JsonNode info) {
		this.info = info;
	}
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	
}
