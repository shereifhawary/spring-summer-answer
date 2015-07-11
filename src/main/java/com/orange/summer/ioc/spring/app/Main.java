package com.orange.summer.ioc.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orange.summer.ioc.spring.reader.Reader;

public class Main {

	public static void main(String... args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("App-Context.xml");
		
		Reader reader = (Reader) context.getBean("reader");
		
		reader.readData();

		String str = (String) context.getBean("springObject");

		System.out.println(str);
	}
}
