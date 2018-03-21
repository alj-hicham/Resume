package com.azzus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Generalinfo implements Serializable {
    @Id
    @GeneratedValue
    private long general_id;
    @NotEmpty
    @Size(max = 10)
    private String title;
    @NotEmpty
    @Size(max = 500)
    private String summary;

    @Size(min = 4, max = 5)
    private String countrynumber;
    @Size(min = 9, max = 9)
    private String number;

    private String phonenumber;


    public Generalinfo() {
    }

    public Generalinfo(@NotEmpty @Size(max = 10) String title, @NotEmpty @Size(max = 500) String summary, @Size(min = 4, max = 5) String countrynumber, @Size(min = 8, max = 8) String number, @Size(min = 12, max = 13) String phonenumber) {
        this.title = title;
        this.summary = summary;
        this.countrynumber = countrynumber;
        this.number = number;
        this.phonenumber = phonenumber;
    }

    public long getGeneral_id() {
        return general_id;
    }

    public void setGeneral_id(long general_id) {
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

    public String getCountrynumber() {
        return countrynumber;
    }

    public void setCountrynumber(String countrynumber) {
        this.countrynumber = countrynumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
