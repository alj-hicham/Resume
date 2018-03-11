package com.azzus.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Educ_us_id;

    private String educ_degre;

    private String educ_title;

    private String educ_university;

    private Date date;
    @OneToOne
    private Generalinfo userid;
    private String educ_adress;


    public Education(String educ_degre, String educ_title, String educ_university, Date date, String educ_adress, Generalinfo Userid) {
        this.educ_degre = educ_degre;
        this.educ_title = educ_title;
        this.educ_university = educ_university;
        this.date = date;
        this.educ_adress = educ_adress;
        this.userid = Userid;

    }

    public Education() {
        super();
    }

    public Long getEduc_us_id() {
        return Educ_us_id;
    }

    public void setEduc_us_id(Long educ_us_id) {
        Educ_us_id = educ_us_id;
    }

    public Generalinfo getUserid() {
        return userid;
    }

    public void setUserid(Generalinfo userid) {
        this.userid = userid;
    }

    public String getEduc_degre() {
        return educ_degre;
    }

    public void setEduc_degre(String educ_degre) {
        this.educ_degre = educ_degre;
    }

    public String getEduc_title() {
        return educ_title;
    }

    public void setEduc_title(String educ_title) {
        this.educ_title = educ_title;
    }

    public String getEduc_university() {
        return educ_university;
    }

    public void setEduc_university(String educ_university) {
        this.educ_university = educ_university;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEduc_adress() {
        return educ_adress;
    }

    public void setEduc_adress(String educ_adress) {
        this.educ_adress = educ_adress;
    }
}
