package com.mph.p2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mph/p2/Beans.xml");
        TextEditor txt = (TextEditor) context.getBean("textEditor");
        txt.spellCheck();
    }
}
