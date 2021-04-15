package com.mph;

public class EmailService implements MessageService {

    EmailService() {
        System.out.println("email constructor");
    }

    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println(msg + " sent to " + rec);
        //Integer.parseInt("b23");
        return true;
    }
}


