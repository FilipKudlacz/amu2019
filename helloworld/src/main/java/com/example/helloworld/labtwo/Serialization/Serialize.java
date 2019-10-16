package com.example.helloworld.labtwo.Serialization;

import com.example.helloworld.protosingle.ScopesShowcase;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;

@Component
public class Serialize {

    private final static Logger logger = LoggerFactory.getLogger(ScopesShowcase.class);


    private ObjectMapper mapper = new ObjectMapper();
    private Human human = new Human(21, "Will", "Smith");
    private Human readHuman;

    @PreDestroy
    public void main() throws IOException {
        mapper.writeValue(new File("target/human.json"), human);

        readHuman =  mapper.readValue(new File("target/human.json"), Human.class);

        logger.info("Original human object:" + human);
        logger.info("Serialized human object" + readHuman);
    }

}
