package com.duyhelloworld.jpalearning.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {
    @ManyToMany(mappedBy = "listRole")
    private List<User> list = new ArrayList<User>();

    @Column(name = "role_description")
    private String roleDesc;

    public String getRoleDesc() {
        return this.roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
    
    public List<User> getList() {
        return this.list;
    }
    
    public void setList(List<User> list) {
        this.list = list;
    }

}
