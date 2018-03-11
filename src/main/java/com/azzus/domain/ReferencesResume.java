package com.azzus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class ReferencesResume implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long references_id;
    @NotNull
    private String references_firstname;
    @NotNull
    private String getReferences_lastname;

    private String email;
    @NotNull
    private String references_num;

    public ReferencesResume() {
        super();

    }

    public ReferencesResume(@NotNull String references_firstname, @NotNull String getReferences_lastname, String email, @NotNull String references_num) {
        this.references_firstname = references_firstname;
        this.getReferences_lastname = getReferences_lastname;
        this.email = email;
        this.references_num = references_num;
    }

    public Long getReferences_id() {
        return references_id;
    }

    public void setReferences_id(Long references_id) {
        this.references_id = references_id;
    }

    public String getReferences_firstname() {
        return references_firstname;
    }

    public void setReferences_firstname(String references_firstname) {
        this.references_firstname = references_firstname;
    }

    public String getGetReferences_lastname() {
        return getReferences_lastname;
    }

    public void setGetReferences_lastname(String getReferences_lastname) {
        this.getReferences_lastname = getReferences_lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferences_num() {
        return references_num;
    }

    public void setReferences_num(String references_num) {
        this.references_num = references_num;
    }
}
