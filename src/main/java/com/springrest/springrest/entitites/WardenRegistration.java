package com.springrest.springrest.entitites;

import javax.persistence.Column;

public class WardenRegistration {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;

    private Integer role;

    @Column(nullable = false)
    private String emailId;


    public WardenRegistration(){

    }

    public WardenRegistration(String name, String password, Integer role, String emailId) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
