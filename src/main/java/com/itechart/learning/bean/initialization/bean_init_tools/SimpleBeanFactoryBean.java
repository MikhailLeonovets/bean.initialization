package com.itechart.learning.bean.initialization.bean_init_tools;

import com.itechart.learning.bean.initialization.bean.SimpleBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanFactoryBean implements FactoryBean<SimpleBean> {

	public SimpleBeanFactoryBean() {
		System.out.println("I'm in SimpleBeanFactoryBean constructor");
	}

	@Override
	public SimpleBean getObject() throws Exception {
		System.out.println("I'm in getObject() method in SimpleBeanFactoryBean");
		return new SimpleBean();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("I'm in getObjectType() method in SimpleBeanFactoryBean");
		return SimpleBean.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("I'm in isSingleton() method in SimpleBeanFactoryBean");
		return false;
	}
}
