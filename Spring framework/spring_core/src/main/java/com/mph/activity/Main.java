package com.mph.activity;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mph/activity/Beans.xml");
                Profile profile = (Profile) context.getBean("profile");
                profile.printAge();
                profile.printName();
            }
        }

