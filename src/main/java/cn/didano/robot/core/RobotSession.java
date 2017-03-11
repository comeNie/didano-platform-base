package cn.didano.robot.core;

import javax.servlet.http.HttpSession;

/**
 * websocket事物信息
 * @author stephen.wang 2017-03-02 
 */
public class RobotSession {
	private String httpSessionId;
	private HttpSession httpSession;
	private String service_no;
	private RobotWebsocketServer robotWebsocketServer;
	public String getHttpSessionId() {
		return httpSessionId;
	}
	public void setHttpSessionId(String httpSessionId) {
		this.httpSessionId = httpSessionId;
	}
	public HttpSession getHttpSession() {
		return httpSession;
	}
	public void setHttpSession(HttpSession httpSession) {
		this.httpSession = httpSession;
	}
	public String getService_no() {
		return service_no;
	}
	public void setService_no(String service_no) {
		this.service_no = service_no;
	}
	public RobotWebsocketServer getRobotWebsocketServer() {
		return robotWebsocketServer;
	}
	public void setRobotWebsocketServer(RobotWebsocketServer robotWebsocketServer) {
		this.robotWebsocketServer = robotWebsocketServer;
	}
}
