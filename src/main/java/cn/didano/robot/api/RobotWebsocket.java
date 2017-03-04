package cn.didano.robot.api;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.didano.robot.data.RobotVersionInfo;
import cn.didano.video.auth.ws.GetHttpSessionConfigurator;
import cn.didano.video.exception.VideoExceptionEnums;

/**
 * 机器人websocket连接，该连接由http协议建立，然后由tcp协议保持通信
 * 
 * @author stephen Created on 2016年12月23日 下午6:30:26
 * 
 * 
 */
@Component
@ServerEndpoint(value = "/robot/api/ws/{service_no}", configurator = GetHttpSessionConfigurator.class)
public class RobotWebsocket {
	static Logger logger = Logger.getLogger(RobotWebsocket.class);

	// 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static int onlineCount = 0;

	// 与某个客户端的连接websocket Session会话，需要通过它来给客户端发送数据
	private Session session;

	private static ConcurrentHashMap<String, RobotSession> robotInfoMap = new ConcurrentHashMap<String, RobotSession>();


	/**
	 * 连接建立成功调用的方法，应该放到session里面，每个通道不论时间都可由管理员或者园长关闭
	 * 
	 * @Todo
	 * 
	 * @param session
	 *            可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen
	public void onOpen(@PathParam("service_no") String service_no, Session session, EndpointConfig config)
			throws Exception {
		logger.debug("RobotWebsocket连接建立,连接设备号为："+service_no);
		this.session = session;
		// 与某个客户端的连接会话，需要通过它来给客户端发送数据
		HttpSession httpSession = (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
		// 如果正在看视频已经存在，那么将被替换
		RobotSession info = new RobotSession();
		info.setHttpSession(httpSession);
		info.setHttpSessionId(httpSession.getId());
		info.setRobotWebsocket(this);
		info.setService_no(service_no);
		addOnlineCount(); // 在线数加1
		logger.info("当前在线机器人为：" + getOnlineCount());
	}

	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		subOnlineCount(); // 在线数减1
		logger.info("有一连接关闭！当前在线机器人为" + getOnlineCount());
	}

	/**
	 * 收到客户端消息后调用的方法
	 * 
	 * @param message
	 *            客户端发送过来的消息
	 * @param session
	 *            可选的参数
	 */
	@OnMessage
	public void onMessage(String message, Session session) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			logger.info("RobotWebsocket收到消息：" + message);
			ReportInfo report = mapper.readValue(message, ReportInfo.class);
			// 如果不是连接，那么解析之后直接激发方法，并传输数据
			RobotController robotController = new RobotController();
			RobotDelegator delegator = new RobotDelegator();
			delegator.exc(robotController,report);
			logger.info("客户端汇报：" + message);
			System.out.println("i got message  2 ");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

//	/**
//	 * 收到客户端消息后调用的方法
//	 * 
//	 * @param message
//	 *            客户端发送过来的消息
//	 * @param session
//	 *            可选的参数
//	 */
//	@OnMessage
//	public void onMessage(String message, Session session) {
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			logger.info("RobotWebsocket收到消息：" + message);
//			ReportInfo report = mapper.readValue(message, ReportInfo.class);
//			// 如果不是连接，那么解析之后直接激发方法，并传输数据
//			String methodName = report.getMethodName();
//			RobotController  robotController = new RobotController();
//			logger.info("客户端汇报：" + message);
//			switch (methodName) {
//			case "connect":
//				break;
//			case "reportVersion":
//				RobotVersionInfo robotVersionInfo = mapper.readValue(report.getInfo().toString(),RobotVersionInfo.class);
//				robotController.reportVersion(robotVersionInfo);
//				break;
//			case "sacrificed":
//				break;
//			case "die":
//				break;
//			default:
//				break;
//			}
//			System.out.println("i got message  2 ");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		// 客户端不发信息
//		// 同时也不向客户端发送信息
//	}
	
	/**
	 * 发生错误时调用 此方法被自动调用，同时之后会自动调用onClose
	 * 
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session, Throwable error) {
		// 管理器里面如何删除呢?
		logger.debug("robotWebsocket 发生错误" + error.getMessage());
	}

	/**
	 * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
	 * 
	 * @param message
	 * @throws IOException
	 */
	public void sendMessage(String message) {
		try {
			logger.debug("websocket:sendMessage");
			this.session.getBasicRemote().sendText(message);
		} catch (IOException e) {
			logger.debug(VideoExceptionEnums.FAIL_WEBSOCKET_SEND + ":websocket已经关闭sessionid[" + session.getId() + "]"
					+ ":" + e.getMessage());
		} catch (Exception ex) {
			logger.debug(VideoExceptionEnums.FAIL_WEBSOCKET_SEND + ":websocket已经关闭sessionid[" + session.getId() + "]"
					+ ":" + ex.getMessage());
		}
	}

	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		RobotWebsocket.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		RobotWebsocket.onlineCount--;
	}

	/**
	 * 增加连接
	 * 
	 * @param channelId
	 */
	public static synchronized void addRobotInfo(RobotSession robotInfo) {
		robotInfoMap.put(robotInfo.getService_no(), robotInfo);
	}

	/**
	 * 删除连接
	 * 
	 * @param websocketChannel
	 */
	public static synchronized void addChannel(String service_no) {
		robotInfoMap.remove(service_no);
	}
}