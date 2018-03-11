package com.azzus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Workexperience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long work_id;

    private String work_title;
    private String work_description;
    private String work_task;
    private String jobCompany_name;

    private Date job_years;

    public Workexperience(String work_title, String work_description, String work_task, String jobCompany_name, Date job_years) {
        this.work_title = work_title;
        this.work_description = work_description;
        this.work_task = work_task;
        this.jobCompany_name = jobCompany_name;
        this.job_years = job_years;
    }

    public Workexperience() {
    }

    public Long getWork_id() {
        return work_id;
    }

    public void setWork_id(Long work_id) {
        this.work_id = work_id;
    }

    public String getWork_title() {
        return work_title;
    }

    public void setWork_title(String work_title) {
        this.work_title = work_title;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getWork_task() {
        return work_task;
    }

    public void setWork_task(String work_task) {
        this.work_task = work_task;
    }

    public String getJobCompany_name() {
        return jobCompany_name;
    }

    public void setJobCompany_name(String jobCompany_name) {
        this.jobCompany_name = jobCompany_name;
    }

    public Date getJob_years() {
        return job_years;
    }

    public void setJob_years(Date job_years) {
        this.job_years = job_years;
    }
}
