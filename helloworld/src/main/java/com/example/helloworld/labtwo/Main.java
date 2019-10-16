package com.example.helloworld.labtwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Component
public class Main {

    private final static Logger logger = LoggerFactory.getLogger(Main.class);


    @PostConstruct
    public void main() {
        Class main = getClass();
        Method[] methods = main.getMethods();
        Field[] fields = main.getFields();
        Constructor[] constructors = main.getConstructors();

        for (Constructor constructor: constructors) {
            String constructorInfo = "Constructor name: " + constructor.getName();
            logger.info(constructorInfo);
        }

        for (Field field: fields) {
            String fieldInfo = "Field name: " + field.getName();
            logger.info(fieldInfo);
        }

        for (Method method: methods) {

            String methodInfo = "Mehod name: " + method.getName() + " Parameters: ";

            for (Class parameter: method.getParameterTypes()) {
                methodInfo += " " + parameter + ",";
            }
            logger.info(methodInfo);
        }

        //Walnac sleepa w konstruktorze singletonu
        //Serializacji po prostu serializowac i zdeserializowac i zobaczyc co sie stanie

    }
}
