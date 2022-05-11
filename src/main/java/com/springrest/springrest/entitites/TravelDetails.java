package com.springrest.springrest.entitites;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class TravelDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String rollno;

    @Column(nullable = false)
    private String branch;

    @Column(nullable = false)
    private String programName;

    @Column(nullable = false)
    private Date travelDate;

    @Column(nullable = true)
    private Integer studentId;

    @Column(nullable = false)
    private Integer journeyType;
    //journeyType will have two values '1' for arrival & '2' for departure

    public TravelDetails()
    {

    }

    public TravelDetails(Long id, String name, String rollno, String branch, String programName, Date travelDate, Integer studentId, Integer journeyType) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.programName = programName;
        this.travelDate = travelDate;
        this.studentId = studentId;
        this.journeyType = journeyType;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Integer getJourneyType() {
        return journeyType;
    }

    public void setJourneyType(Integer journeyType) {
        this.journeyType = journeyType;
    }
}
