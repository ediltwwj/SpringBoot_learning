package com.wwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class BeanController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/helloBean", method = RequestMethod.GET)
    public String helloBean() {

        System.out.println("DataSource = " + dataSource);
        return "Hello, SpringBoot!";
    }
}

