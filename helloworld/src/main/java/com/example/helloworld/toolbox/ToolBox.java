package com.example.helloworld.toolbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class ToolBox {

    @Autowired
    @Qualifier("FavoriteTool")
    private ITool tool;

    @Autowired
    private List<ITool> tools;

    @PreDestroy
    public void main() {
        tool.use();

        for (ITool item: tools) {
            item.use();
        }
    }
}
