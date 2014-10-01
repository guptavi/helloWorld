package com.spring.Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.setMessage("Singleton Prototype");
		helloWorld.getMessage();
		
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		helloWorld1.getMessage();
	}
}
