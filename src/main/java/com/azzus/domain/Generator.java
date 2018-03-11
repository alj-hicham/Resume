package com.azzus.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Generator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gen_id;

    @OneToOne(fetch = FetchType.EAGER)
    private Generalinfo generalinfo;
    @OneToOne(fetch = FetchType.EAGER)
    private Education education;
    @OneToOne(fetch = FetchType.EAGER)
    private Interrests interrests;
    @OneToOne(fetch = FetchType.EAGER)
    private Projects projects;
    @OneToOne(fetch = FetchType.EAGER)
    private ReferencesResume referencesResume;
    @OneToOne(fetch = FetchType.EAGER)
    private Skills skills;
    @OneToOne(fetch = FetchType.EAGER)
    private Userresume userresume;
    @OneToOne(fetch = FetchType.EAGER)
    private Workexperience workexperience;

    public Generator(Generalinfo generalinfo, Education education, Interrests interrests, Projects projects, ReferencesResume referencesResume, Skills skills, Userresume userresume, Workexperience workexperience) {
        this.generalinfo = generalinfo;
        this.education = education;
        this.interrests = interrests;
        this.projects = projects;
        this.referencesResume = referencesResume;
        this.skills = skills;
        this.userresume = userresume;
        this.workexperience = workexperience;
    }

    public Generator() {
        super();
    }

    public Generalinfo getGeneralinfo() {
        return generalinfo;
    }

    public void setGeneralinfo(Generalinfo generalinfo) {
        this.generalinfo = generalinfo;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Interrests getInterrests() {
        return interrests;
    }

    public void setInterrests(Interrests interrests) {
        this.interrests = interrests;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public ReferencesResume getReferencesResume() {
        return referencesResume;
    }

    public void setReferencesResume(ReferencesResume referencesResume) {
        this.referencesResume = referencesResume;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Userresume getUserresume() {
        return userresume;
    }

    public void setUserresume(Userresume userresume) {
        this.userresume = userresume;
    }

    public Workexperience getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(Workexperience workexperience) {
        this.workexperience = workexperience;
    }
}
