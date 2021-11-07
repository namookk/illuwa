package com.illuwa.common.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping(value="/")
    public String home() {
        return "home";
    }
}
