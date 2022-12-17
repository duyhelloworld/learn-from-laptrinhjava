package com.duyhelloworld.jpalearning.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String avatar;

    @Column(name = "full_name")
    private String fullName;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(table = "User", name = "u_id"),
            inverseJoinColumns = @JoinColumn(table = "Role", name = "r_id"))
    private List<Role> roles = new ArrayList<Role>();

    // @OneToOne
    // @MapsId
    // @JoinColumn(name = "login_id", insertable = false, updatable = false)
    // private Login loginSession;

    @OneToMany(mappedBy = "user")
    private List<Blog> blogs = new ArrayList<Blog>();

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public List<Role> getListRole() {
        return this.roles;
    }

    public void setListRole(List<Role> roles) {
        this.roles = roles;
    }



    @Override
    public String toString() {
        return "id : " + this.getId() + ",\nname : " + this.getUsername() + "\nemail : " + this.getEmail();
    }

}
