package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.*;

import static com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities.status3.NO_RESPONSE;

@Entity
public class Guest {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false,length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column (nullable = false)
    private status3 status =NO_RESPONSE ;

    public Guest(){
    }

    public Guest(Long id, String name, status3 status) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    public status3 getStatus() {
        return status;
    }

    public void setStatus(status3 status) {
        this.status = status;
    }
}
