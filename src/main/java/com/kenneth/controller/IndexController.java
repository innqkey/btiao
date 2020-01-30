package com.kenneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther qinkai
 * @data 2019/12/21 9:55
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping
    public String index(){
        return "spring boot......k8s ...deployment";
    }
}
