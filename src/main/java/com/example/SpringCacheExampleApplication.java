package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication  // is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes:
public class SpringCacheExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheExampleApplication.class, args);
    }
}
