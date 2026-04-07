package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

import static com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities.status.ACTIVE;

@Entity
public class Member {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column (nullable = false)
    private status status = ACTIVE ;

    private LocalDate renewalDate;

    public Member(){
    }

    public Member(Long id, String name, status status, LocalDate renewalDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    //
}
