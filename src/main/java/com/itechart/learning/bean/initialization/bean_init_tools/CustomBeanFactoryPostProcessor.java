package com.itechart.learning.bean.initialization.bean_init_tools;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		System.out.println(configurableListableBeanFactory.getBeanDefinition("simpleBean") + "I'm here in postProcessBeanFactory");
	}
}
