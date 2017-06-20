package com.backbase.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.backbase.assignment.resource", "com.backbase.assignment.service",
        "com.backbase.assignment.configuration", "com.backbase.assignment.repo"})
public class BackBaseTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackBaseTestApplication.class, args);
    }

}
