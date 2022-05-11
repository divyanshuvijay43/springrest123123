package com.springrest.springrest.entitites;

import javax.persistence.*;

@Entity
@Table
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String rollno;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = true)
    private String branch;

    @Column(nullable = true)
    private String programName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer role; // 1 for student 2 for warden

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public StudentRegistration()
    {

    }

    public StudentRegistration(String name, String rollno, String emailId, String branch, String programName,String password,Integer role) {
        this.name = name;
        this.rollno = rollno;
        this.emailId = emailId;
        this.branch = branch;
        this.programName = programName;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
