package com.itechart.learning.bean.initialization.bean_init_tools;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("Called postProcessBeforeInitialization() for :" + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("Called postProcessAfterInitialization() for :" + beanName);
		return bean;
	}
}
