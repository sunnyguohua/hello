package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.micrometer.core.annotation.Timed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

//    @GetMapping("/dic")
//    @Timed(value = "all.people", longTask = true)
//    public String list() throws JsonProcessingException {
//        return objectMapper.writeValueAsString(dictDao.list());
//    }




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
