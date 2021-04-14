package com.mph.springboot.beans;

import org.springframework.stereotype.Component;

@Component("emailBean")
public class EmailBean implements MessageService {

    @Override
    public boolean sendMessage(String message) {
        System.out.println("Email");
        return false;
    }
}
