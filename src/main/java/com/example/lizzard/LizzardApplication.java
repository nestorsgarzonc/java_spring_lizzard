package com.example.lizzard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class LizzardApplication {

    public static void main(String[] args) {
        SpringApplication.run(LizzardApplication.class, args);
    }

}
