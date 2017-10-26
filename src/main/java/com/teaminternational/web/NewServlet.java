package com.teaminternational.web;

import com.teaminternational.HelloWorldGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewServlet extends BaseHttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        HelloWorldGenerator hwg = getBean(HelloWorldGenerator.COMPONENT_NAME);
        hwg.sayHello();
    }
}
