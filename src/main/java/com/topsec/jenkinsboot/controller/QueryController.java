package com.topsec.jenkinsboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class QueryController {
    @RequestMapping("/get")
    public String get(){
        return "test for jenkins";
    }
}
