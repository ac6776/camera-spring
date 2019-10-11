package ru.testspring.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

//        Camera camera = new Camera();
//        camera.setCameraRoll(new ColorCameraRoll());
//        camera.doPhotograph();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = applicationContext.getBean("camera", Camera.class);
        camera.doPhotograph();
        camera.setCameraRoll(applicationContext.getBean("colorCameraRoll", ColorCameraRoll.class));
        camera.doPhotograph();

    }
}
