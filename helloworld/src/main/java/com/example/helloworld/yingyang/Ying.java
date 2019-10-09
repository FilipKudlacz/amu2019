package com.example.helloworld.yingyang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ying {


    //Tylko na potrzebe pokazania wykonania zadania.
    @Autowired
    private Yang yang;

    @Autowired
    public void setYang(Yang yang) {
        this.yang = yang;
    }
}
