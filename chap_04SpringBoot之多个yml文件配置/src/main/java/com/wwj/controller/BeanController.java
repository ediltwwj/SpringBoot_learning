package com.wwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class BeanController {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;

    @RequestMapping(value = "/helloBean", method = RequestMethod.GET)
    public String helloBean() {

        System.out.println("DataSource = " + dataSource);
        System.out.println("ItCastUrl = " + itcastUrl);
        System.out.println("ItHeimaUrl = " + itheimaUrl);
        return "Hello, SpringBoot!";
    }
}

