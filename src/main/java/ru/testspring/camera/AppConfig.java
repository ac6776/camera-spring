package ru.testspring.camera;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="colorCameraRoll")
    public ColorCameraRoll colorCameraRoll(){
        return new ColorCameraRoll();
    }
    @Bean(name="BWCameraRoll")
    public BWCameraRoll BWCameraRoll(){
        return new BWCameraRoll();
    }
    @Bean(name = "camera")
    public Camera camera(){
        Camera camera = new Camera();
        camera.setCameraRoll(BWCameraRoll());
        return camera;
    }

}
