package com.stanroy.javaspringdemo;

import com.stanroy.javaspringdemo.configuration.BlogProperties;
import com.stanroy.javaspringdemo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties.class)
public class JavaSpringDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaSpringDemoApplication.class, args);

        User us = new User();

    }

}
