package com.harry.zoo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository <Animal, Long> {}