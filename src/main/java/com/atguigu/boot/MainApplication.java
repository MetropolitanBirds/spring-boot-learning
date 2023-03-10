package com.atguigu.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }


    }


}
