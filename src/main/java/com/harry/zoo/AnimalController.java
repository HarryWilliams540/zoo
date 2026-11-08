package com.harry.zoo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }
    
    @GetMapping("/api/animals")
    public List<Animal> getAnimals() {
        return animalService.findAll();
    }

    @GetMapping("/api/animals/{id}")
    public Animal getAnimal(@PathVariable long id) {
        return animalService.findById(id);
    }
}
