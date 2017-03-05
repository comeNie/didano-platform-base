package cn.didano.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * @author stephen.wang
 * 通过如下方式获取service
 * ContextUtil.act.getBean(UserService.class);
 */
@Component
public class ContextUtil implements ApplicationContextAware {

	public static ApplicationContext act=null;

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
	    //FindBug会提示这里，可能会有错，主要是在非静态方法里面去改变静态变量，这样子在多线程时，可能会出错，
		//所以给出警告。
		act=arg0;
	}

}

