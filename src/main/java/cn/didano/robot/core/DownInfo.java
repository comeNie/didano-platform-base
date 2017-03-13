package cn.didano.robot.core;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * robot websocket 下行信息
 * @author stephen.wang 2017-03-02 
 */
public class DownInfo {
	private String methodName;
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
}
