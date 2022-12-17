package com.duyhelloworld.jpalearning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

public class Login {
    @Id
    @Column(name = "login_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String username;

    @Column
    private String password;

    // @OneToOne(mappedBy = "loginSession")
    // @JoinColumn(name = "user_id", insertable = false, updatable = false)
    // private User user;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    // public User getUser() {
    //     return this.user;
    // }

    // public void setUser(User user) {
    //     this.user = user;
    // }
}