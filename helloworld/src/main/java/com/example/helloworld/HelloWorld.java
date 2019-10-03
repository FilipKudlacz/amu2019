package com.example.helloworld;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;

@Component
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @PostConstruct
    public static void postConstruct() {
        logger.info("Hello world");
    }

    @PreDestroy
    public static void preDestroy() {
        logger.info("Goodbye");
    }
}
