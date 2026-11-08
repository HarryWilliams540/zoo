package com.harry.zoo;

public class Animal {
    private long id;
    private String name;
    private String species;
    private int hunger;

    public Animal(long id, String name, String species, int hunger) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.hunger = hunger;
    }

    public void setId(long newId) {
        id = newId;
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

    public long getId() {
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
