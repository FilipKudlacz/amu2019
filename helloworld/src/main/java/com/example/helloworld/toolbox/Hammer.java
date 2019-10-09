package com.example.helloworld.toolbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Profile("lumberjack")
@Primary
@Order(2)
public class Hammer implements ITool {

    private final static Logger logger = LoggerFactory.getLogger(Hammer.class);

    @Override
    public void use() {
        logger.info("Hammer is being used.");
    }

}
