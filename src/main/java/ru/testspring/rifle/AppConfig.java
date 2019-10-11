package ru.testspring.rifle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "ammo")
    public Ammo ammo(){
        return new Ammo();
    }

    @Bean(name = "rifle")
    public Rifle rifle(){
        Rifle rifle = new Rifle();
        rifle.add(ammo());
        return rifle;
    }
}
