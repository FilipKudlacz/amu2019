package com.example.helloworld.toolbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Profile("plumber")
@Qualifier("FavoriteTool")
@Order(1)
public class Screwdriver implements ITool {

    private final static Logger logger = LoggerFactory.getLogger(Hammer.class);


    @Override
    public void use() {
        logger.info("Screwdriver is being used.");
    }
}
