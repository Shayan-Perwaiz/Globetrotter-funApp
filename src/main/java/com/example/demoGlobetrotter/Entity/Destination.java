package com.example.demoGlobetrotter.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;
    private String country;

    @ElementCollection
    private List<String> clues;

    @ElementCollection
    private List<String> fun_fact;

    @ElementCollection
    private List<String> trivia;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getClues() {
        return clues;
    }

    public void setClues(List<String> clues) {
        this.clues = clues;
    }

    public List<String> getFun_fact() {
        return fun_fact;
    }

    public void setFun_fact(List<String> fun_fact) {
        this.fun_fact = fun_fact;
    }

    public List<String> getTrivia() {
        return trivia;
    }

    public void setTrivia(List<String> trivia) {
        this.trivia = trivia;
    }
}