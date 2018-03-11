package com.azzus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Generalinfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long general_id;
    @NotNull
    @Size(max = 45)
    private String title;
    @Size(max = 500)
    private String summary;
    @NotNull
    private Long countrynumber;

    private Long number;
    private Long phonenumber;


    public Generalinfo() {
        super();
    }

    public Generalinfo(String title, String summary, Long countrynumber, Long number, Long phonenumber) {
        this.title = title;
        this.summary = summary;
        this.countrynumber = countrynumber;
        this.number = number;

    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getGeneral_id() {
        return general_id;
    }

    public void setGeneral_id(Long general_id) {
        this.general_id = general_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getCountrynumber() {

        return countrynumber;
    }

    public void setCountrynumber(Long countrynumber) {
        this.countrynumber = countrynumber;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
