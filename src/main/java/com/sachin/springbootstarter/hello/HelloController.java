package com.sachin.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sachin on 05-04-2020.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello!!!";
    }
}
