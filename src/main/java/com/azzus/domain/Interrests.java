package com.azzus.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Interrests implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Interrests_id;
    @NotNull
    private String interrests_title;
    @NotNull
    private String interrests_description;

    public Interrests(@NotNull String interrests_title, @NotNull String interrests_description) {
        this.interrests_title = interrests_title;
        this.interrests_description = interrests_description;
    }

    public Interrests() {
        super();
    }

    public Long getInterrests_id() {
        return Interrests_id;
    }

    public void setInterrests_id(Long interrests_id) {
        Interrests_id = interrests_id;
    }

    public String getInterrests_title() {
        return interrests_title;
    }

    public void setInterrests_title(String interrests_title) {
        this.interrests_title = interrests_title;
    }

    public String getInterrests_description() {
        return interrests_description;
    }

    public void setInterrests_description(String interrests_description) {
        this.interrests_description = interrests_description;
    }
}
