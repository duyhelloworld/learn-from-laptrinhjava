package com.duyhelloworld.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogAPI {
    @GetMapping("/")
    public String hello() {
        return "<span style='color: red'> Hello World </span>";
    }
}
