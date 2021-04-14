package com.mph.pauto;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/mph/pauto/Beans.xml");
        TextEditor txt = (TextEditor) context.getBean("textEditor");
        txt.spellCheck();
    }
}
