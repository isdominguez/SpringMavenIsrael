package com.auribox.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribox.model.Message;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		Message message = new Message();
		message.setHeader("Main Header");
		message.setPayload("Main Payload");
		*/
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-ctx.xml");
		Message message = (Message)ctx.getBean("message");
		
		System.out.println(message);
		
		message.setHeader("modified");
		Message message2 = (Message)ctx.getBean("message2");
		
		System.out.println(message2);
		
		Message message3 = (Message)ctx.getBean("message3");
		System.out.println(message3);
		
//		ctx.close();
	}

}
