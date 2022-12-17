package com.duyhelloworld.jpalearning.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Login extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String loginId;

    private String username;

    private String password;

    public String getLoginId() {
        return this.loginId;
    }

    public void setId(String loginId) {
        this.loginId = loginId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}