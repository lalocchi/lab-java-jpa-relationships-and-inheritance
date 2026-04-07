package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.*;

@Entity
public class Speaker {

//    id (auto-generated)
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
//    name
    @Column (nullable = false,length = 50)
    private String name;
//    presentationDuration (Integer)
    private int presentationDuration;

    public Speaker(){
    }

    public Speaker(Long id, String name, int presentationDuration) {
        this.id = id;
        this.name = name;
        this.presentationDuration = presentationDuration;
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

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
