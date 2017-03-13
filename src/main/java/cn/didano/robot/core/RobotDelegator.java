package cn.didano.robot.core;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.didano.base.exception.BackType;
import cn.didano.robot.controller.RobotUpController;
import cn.didano.video.json.Out;

/**
 * 负责处理方法名称到实际方法调用，以映射方式实现
 * 
 * @author stephen.wang 2017年3月5日
 */
public class RobotDelegator {
	static Logger logger = Logger.getLogger(RobotDelegator.class);

	public RobotDelegator() {
	}

	/**
	 * 处理调用
	 * 
	 * @param robot
	 * @param report
	 */
	public void handle(String service_no, RobotUpController robot, UpInfo upInfo) {
		Object back = null;
		Out<String> out = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			Class<?> para = getParameterType(robot, upInfo.getMethodName());
			if (para != null) {
				String jsonString = mapper.writeValueAsString(upInfo.getInfo());
				Object[] o = new Object[] { mapper.readValue(jsonString, para) };
				back = invokeMethod(robot, upInfo.getMethodName(), o);
			} else {
				// para 参数找不到，说明method没找到
				out = new Out<String>();
				out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_WRONG_METHOD);
			}
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (back == null) {// 说明出现了异常
			out = new Out<String>();
			out.setBackTypeWithLog(BackType.FAIL_DIAGNOSE_WRONG);
		} else {
			out = (Out<String>) back;
		}
		// 有异常，反馈客户端信息
		if (out.isSuccess()) {
			// do nothing 正确无需返回信息
		} else {
			RobotSession session = RobotWebsocketServer.getRobotInfoMap().get(service_no);
			if (session != null) {
				RobotWebsocketServer server = session.getRobotWebsocketServer();
				server.sendMessage(service_no, out);
			}
		}
	}

	/**
	 * 触发control方法
	 * 
	 * @param owner
	 * @param methodName
	 * @param args
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {
		Class ownerClass = owner.getClass();
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(owner, args);
	}

	/**
	 * 获取方法第一个参数，需要确保每个接口方法只有一个
	 * 
	 * @param owner
	 * @param mymethodName
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	private Class<?> getParameterType(Object owner, String mymethodName) {
		Class ownerClass = owner.getClass();
		Method[] methods = ownerClass.getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			while (methodName.equals(mymethodName)) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				return parameterTypes[0];
			}
		}
		return null;
	}

}
