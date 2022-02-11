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
		return SimpleBean.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
