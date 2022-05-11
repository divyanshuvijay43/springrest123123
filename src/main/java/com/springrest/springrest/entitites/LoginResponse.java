package com.springrest.springrest.entitites;

public class LoginResponse {

    private Integer id;
    private Integer roll;

    public LoginResponse()
    {

    }

    public LoginResponse(Integer id, Integer roll) {
        this.id = id;
        this.roll = roll;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }
}
