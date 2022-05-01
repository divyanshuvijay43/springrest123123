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

    @Column(nullable = false)
    private String rollno;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String branch;

    @Column(nullable = false)
    private String programName;

    @Column(nullable = false)
    private String password;

    public StudentRegistration()
    {

    }

    public StudentRegistration(String name, String rollno, String emailId, String branch, String programName,String password) {
        this.name = name;
        this.rollno = rollno;
        this.emailId = emailId;
        this.branch = branch;
        this.programName = programName;
        this.password = password;
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
