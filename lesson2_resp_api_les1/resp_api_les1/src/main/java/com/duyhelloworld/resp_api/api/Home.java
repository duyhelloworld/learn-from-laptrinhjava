package com.duyhelloworld.resp_api.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.duyhelloworld.resp_api.dto.DTO;

@RestController
public class Home {
    @GetMapping("/")
    public String getHome() {
        return "Home Page";
    }
    
    @PostMapping("/")
    public DTO postHome(@RequestBody DTO model) {
        System.out.println("Posted");
        return model;
    }

    public enum DAY{
        MONDAY, TUESDAY;
    }
    @DeleteMapping("/")
    public boolean deleteFromHome(DTO model) {
        return model.equals(null);
    }

    @PutMapping("/")
    public DTO updateHome(@RequestBody DTO model) {
        return model;
    }
}
