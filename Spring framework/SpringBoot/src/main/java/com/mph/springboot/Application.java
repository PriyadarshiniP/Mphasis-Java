package com.mph.springboot;

import com.mph.springboot.beans.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
//		MessageService messageService =(MessageService) context.getBean("emailBean");
//		messageService.sendMessage("Test");

	}

}
