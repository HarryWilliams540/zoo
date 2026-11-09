package com.harry.zoo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Animal {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String species;
    private int hunger;

    protected Animal() {}

    public Animal(String name, String species, int hunger) {
        this.name = name;
        this.species = species;
        this.hunger = hunger;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    public void setHunger(int newHunger) {
        hunger = newHunger;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getHunger() {
        return hunger;
    }

}
