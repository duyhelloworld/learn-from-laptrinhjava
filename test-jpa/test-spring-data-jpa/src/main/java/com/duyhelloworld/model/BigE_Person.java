package com.duyhelloworld.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BigE_Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int age;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String phone;
    @Column(name = "create_when")
    private Date createWhen;
    @Column(name = "edit_when")
    private Date editWhen;

    public Long getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateWhen() {
        return this.createWhen;
    }

    public void setCreateWhen(Date createWhen) {
        this.createWhen = createWhen;
    }

    public Date getEditWhen() {
        return this.editWhen;
    }

    public void setEditWhen(Date editWhen) {
        this.editWhen = editWhen;
    }

}
