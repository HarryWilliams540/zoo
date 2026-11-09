package com.harry.zoo;

import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class AnimalService {
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
        
        // propogate starter animals for an empty database
        if (animalRepository.count() == 0) {
            Random rand = new Random();
            String[] names = {"Tundley", "Smartha", "Woodard"};
            String[] species = {"Monkey", "Wolf", "Elephant"};
            for (int i = 0; i < 3; i++) {
                animalRepository.save(new Animal(names[i], species[i], rand.nextInt(100)));
            }
        }
    }

    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Long id) {
        return animalRepository.findById(id).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
