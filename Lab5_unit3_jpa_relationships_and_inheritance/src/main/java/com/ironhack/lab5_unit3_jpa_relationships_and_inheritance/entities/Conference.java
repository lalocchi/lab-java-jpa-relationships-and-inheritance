package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "conference_id" )
    private List <Speaker>speakerList = new ArrayList<>();

    public Conference(){
    }

    public Conference(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
