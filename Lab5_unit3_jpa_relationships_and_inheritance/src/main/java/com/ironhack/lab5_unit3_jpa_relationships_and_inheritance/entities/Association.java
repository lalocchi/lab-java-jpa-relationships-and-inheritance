package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 150)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "association_id")
    private List<Division> divisionsList = new ArrayList<>();

    public Association(){
    }

    public Association(Long id, String name, List<Division> divisionsList) {
        this.id = id;
        this.name = name;
        this.divisionsList = divisionsList;
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

    public List<Division> getDivisionsList() {
        return divisionsList;
    }

    public void setDivisionsList(List<Division> divisionsList) {
        this.divisionsList = divisionsList;
    }
}
