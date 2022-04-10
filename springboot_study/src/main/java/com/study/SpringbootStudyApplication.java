package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.dao")
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringbootStudyApplication.class, args );
    }

}
