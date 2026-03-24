package com.example.demo;

import com.example.demo.entities.Personne;

import java.util.List;
import java.util.Optional;

public interface Personnei {
    List<Personne> findAll();
    Optional<Personne> findById(Long id);
    Personne save(Personne personne);
    void deleteById(Long id);
    Personne update(Personne personne);
}
