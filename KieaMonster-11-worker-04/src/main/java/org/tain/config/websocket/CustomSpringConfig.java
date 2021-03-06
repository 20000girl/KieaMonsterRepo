package org.tain.config.websocket;

import javax.websocket.server.ServerEndpointConfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomSpringConfig extends ServerEndpointConfig.Configurator implements ApplicationContextAware {

	private static volatile BeanFactory content;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CustomSpringConfig.content = applicationContext;
	}
	
	public <T> T getEndpointInstance(Class<T> clazz) throws InstantiationException {
		return CustomSpringConfig.content.getBean(clazz);
	}
}
