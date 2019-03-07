package com.example.demo;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
@Timed
public class HelloWorldController {
 
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}