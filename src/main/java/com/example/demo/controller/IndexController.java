package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author chenwenxin
 * @create 2018-11-12 15:42
 **/
@Slf4j
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index(){
        log.info("------------------------------------------");
        return "hello world";
    }

}
