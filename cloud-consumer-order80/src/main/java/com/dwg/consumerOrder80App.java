package com.dwg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class consumerOrder80App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(consumerOrder80App.class, args);

        Object restTemplate = run.getBean("restTemplate");
        System.out.println(restTemplate);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
