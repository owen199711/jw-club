package com.jwclub.subject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  subject 启动类
 */
@SpringBootApplication
@ComponentScan("com.jwclub")
public class SubjectApplication {
    public static void main(String []args){
        SpringApplication.run(SubjectApplication.class);
    }
}
