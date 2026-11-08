package com.harry.zoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController 
public class AnimalController {

    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        Random rand = new Random();
        String[] names = {"Tundley", "Smartha", "Woodard"};
        String[] species = {"Monkey", "Wolf", "Elephant"};

        List<Animal> animals = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            animals.add(new Animal(i + 1, names[i], species[i], rand.nextInt(100)));
        }

        return animals;
    }
}
