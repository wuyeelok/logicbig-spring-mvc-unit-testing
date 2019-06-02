package com.logicbig.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyWebConfig {

    @Bean
    public MyMvcController myMvcController() {
        return new MyMvcController();
    }
}