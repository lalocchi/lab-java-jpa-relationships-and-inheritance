package com.ironhack.lab5_unit3_jpa_relationships_and_inheritance.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {

//    Event must have:
//
//    id (auto-generated)
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

//    title
    @Column(nullable = false,length = 60)
    private String title;

//    date (LocalDate)
    private LocalDate date;
//    duration (Integer)
    private int duration;
//    location
    @Column (nullable = false)
    private String location;
//    A list of guests.
    @ManyToMany
    @JoinTable(name = "event_guest", joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id"))
    private List<Guest> guestList = new ArrayList<>();

    public Event(){
    }

    public Event(Long id, String title, LocalDate date, int duration, String location, List<Guest> guestList) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.guestList = guestList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
