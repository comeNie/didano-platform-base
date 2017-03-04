package cn.didano.robot.api;

import java.lang.reflect.Method;


public class RobotDelegator {
	public RobotDelegator() {
	}

	public void exc(RobotController robot,ReportInfo report) {
		try {
			Object[] o = new Object[] {};
			o[1] = report.getInfo();
			invokeMethod(robot, report.getMethodName(), o);
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {
		Class ownerClass = owner.getClass();
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(owner, args);
	}

}
