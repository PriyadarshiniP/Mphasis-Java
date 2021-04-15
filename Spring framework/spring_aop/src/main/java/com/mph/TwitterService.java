package com.mph;

public class TwitterService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println(msg + " sent to " + rec);
        return true;
    }
}
