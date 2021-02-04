package com.bookstore.entity;

import javax.persistence.*;

@Entity
//@Table(name = "diff_name")
public class Users {
    private Integer userId;
    private String email;
    private String password;
    private String fullName;

    @Id
    @Column(name = "user_id") //diff name with col name in MySQL db
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment; IDENTITY: unique at table level; AUTO: unique at database level
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    @Column(name = "full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}