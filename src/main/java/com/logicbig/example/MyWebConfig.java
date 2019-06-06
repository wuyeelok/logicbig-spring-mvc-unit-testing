package com.logicbig.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hk.gov.ogcio.esip.service.ConfigUtilService;

@Configuration
public class MyWebConfig {

    @Bean
    public MyMvcController myMvcController() {
        return new MyMvcController();
    }
    
    @Bean
    public ConfigUtilService configUtilService() {
        return new ConfigUtilService();
    }
}