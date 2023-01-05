package com.atguigu.boot.config;


import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({MyImportSelector.class})
@Configuration
public class MyConfig {

   @Bean
    public User user01() {
        return new User("lizehong",22);
    }

    @Bean("Tom")
    public Pet pet01() {
        return new Pet("tomcat");
    }


}
