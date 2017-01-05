package com.injection.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		RequestProcessor processor = (RequestProcessor) context.getBean("requestProcessor");
		processor.handleRequest("1212");
		System.out.println("------------------------");
		processor.handleRequest("1213");
	}
}
