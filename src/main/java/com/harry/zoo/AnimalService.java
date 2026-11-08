package com.harry.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class AnimalService {
    private List<Animal> animals = new ArrayList<>();

    public AnimalService() {
        Random rand = new Random();
        String[] names = {"Tundley", "Smartha", "Woodard"};
        String[] species = {"Monkey", "Wolf", "Elephant"};
        for (int i = 0; i < 3; i++) {
            animals.add(new Animal(i + 1, names[i], species[i], rand.nextInt(100)));
        }
    }

    public List<Animal> findAll() {
        return animals;
    }

    public Animal findById(long id) {
            for (Animal a : animals) {
            if (a.getId() == id) {
                return a;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal not found");
    }
}
