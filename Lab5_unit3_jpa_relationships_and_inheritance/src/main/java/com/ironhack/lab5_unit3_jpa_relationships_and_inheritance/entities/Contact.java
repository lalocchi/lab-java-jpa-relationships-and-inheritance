package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;


import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false,length = 50)
    private String company;

    @Column(nullable = false,length = 60)
    private String title;


    @Embedded
    private Name name;

    public  Contact(){}

    public Contact(int id, String company, String title, Name name) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
