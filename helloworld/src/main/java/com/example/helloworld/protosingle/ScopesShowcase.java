package com.example.helloworld.protosingle;

import com.example.helloworld.HelloworldApplication;
import com.example.helloworld.toolbox.Hammer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class ScopesShowcase {

    private final static Logger logger = LoggerFactory.getLogger(ScopesShowcase.class);


    @Autowired
    private SingletonBean singletonBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @PreDestroy
    public void showcase() {
        logger.info(prototypeBean.toString());
        logger.info(singletonBean.toString());

        //Brak wiedzy jak dostać się do kontekstu aplikacji.
        /*ApplicationContext context = SpringApplication.run(HelloworldApplication.class);

        PrototypeBean contextPrototypeBean = context.getBean(PrototypeBean.class);
        SingletonBean contextSingletonBean = context.getBean(SingletonBean.class);

        logger.info(contextSingletonBean.toString());
        logger.info(contextPrototypeBean.toString());
        */

    }
}
