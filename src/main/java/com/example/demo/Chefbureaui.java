package com.example.demo;

import com.example.demo.entities.Chefbureau;

import java.util.List;
import java.util.Optional;

public interface Chefbureaui {
    List<Chefbureau> findAll();
    Optional<Chefbureau> findById(Long id);
    Chefbureau save(Chefbureau chefbureau);
    void deleteById(Long id);
    Chefbureau update(Chefbureau chefbureau);
}
