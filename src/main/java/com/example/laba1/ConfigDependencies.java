package com.example.laba1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigDependencies {

    @Bean
    public Cat catBeen(){
        return new Cat();
    }

    @Bean
    public Home homeBeen(){
        return new Home();
    }
}
