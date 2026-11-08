package com.harry.zoo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController 
public class AnimalController {
    
    private List<Animal> animals = new ArrayList<>();
    
    public AnimalController() {
        Random rand = new Random();
        String[] names = {"Tundley", "Smartha", "Woodard"};
        String[] species = {"Monkey", "Wolf", "Elephant"};
        for (int i = 0; i < 3; i++) {
            animals.add(new Animal(i + 1, names[i], species[i], rand.nextInt(100)));
        }
    }

    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        return animals;
    }

    @GetMapping("/api/animals/{id}")
    public Animal getAnimal(@PathVariable long id) {
        for (Animal a : animals) {
            if (a.getId() == id) {
                return a;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal not found");
    }
}
