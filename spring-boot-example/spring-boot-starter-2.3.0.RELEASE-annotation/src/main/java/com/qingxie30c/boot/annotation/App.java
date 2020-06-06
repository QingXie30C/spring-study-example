package com.qingxie30c.boot.annotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    private final String name="test";

     //test
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
