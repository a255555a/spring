package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author LY
 */
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        //springboot 启动器
        //test Git
        //test Git again!
        SpringApplication.run(SpringbootApplication.class,args);
    }
}
