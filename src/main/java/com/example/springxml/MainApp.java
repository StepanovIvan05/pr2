package com.example.springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Mechanism mech = ctx.getBean("mechanism", Mechanism.class);
            mech.perform();
        }
    }
}
