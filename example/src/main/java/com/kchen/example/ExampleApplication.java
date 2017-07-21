package com.kchen.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ExampleApplication.class)
                .web(true)
                .run(args);
    }
}
