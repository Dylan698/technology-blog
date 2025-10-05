package com.paicoding.lite.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.paicoding.lite")
public class QuickLiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickLiteApplication.class, args);
    }
}