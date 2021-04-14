package com.mph.springboot.beans;


public class TweetBean implements MessageService {
    @Override
    public boolean sendMessage(String message) {
        System.out.println("Tweet");
        return false;
    }
}
