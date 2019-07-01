package com.qf.stu_service_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class StuServiceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuServiceWebApplication.class, args);
    }

}
