package com.example.resource;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.resource.mapper")
public class ResourceApplication{

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class,args);
    }
}
