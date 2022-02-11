package com.itechart.learning.bean.initialization.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "simpleBean")
public class SimpleBean {
	@PostConstruct
	public void init() {
		System.out.println("I'm init() method from SimpleBean");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("I'm destroy method from SimpleBean");
	}
}
