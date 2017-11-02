package com.example.task2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    private final String msg;

    public NewController(@Value("${custom.message}") String msg) {
        this.msg = msg;
    }


    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index() {
        return "<html><body><h1>" + msg + "</h1></body></html>";
    }
}
