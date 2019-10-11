package ru.testspring.rifle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Rifle rifle = applicationContext.getBean("rifle", Rifle.class);

        rifle.shot();
        rifle.add(applicationContext.getBean("ammo", Ammo.class));
        rifle.shot();
    }
}
