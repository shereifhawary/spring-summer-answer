package com.orange.summer.ioc.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.orange.summer.ioc.spring.config.ApplicationConfigurator;
import com.orange.summer.ioc.spring.reader.Reader;

public class ConfiguratorMain {
	
	
	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfigurator.class);

		Reader reader = (Reader) context.getBean("reader");
		reader.readData();
	}
}
