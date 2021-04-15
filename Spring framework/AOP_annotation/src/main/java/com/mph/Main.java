package com.mph;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mph/Beans.xml");
        MessageService messageService = (MessageService) context.getBean("emailBean");
        messageService.sendMessage("from email", "priya@abc.com");
        messageService = (MessageService) context.getBean("tweetBean");
        messageService.sendMessage("from tweet", "xyz");
    }
}