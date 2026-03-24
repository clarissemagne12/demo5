package com.example.demo;

import com.example.demo.entities.Recensement;

import java.util.List;
import java.util.Optional;

public interface Recensementi {
    List<Recensement> findAll();
    Optional<Recensement> findById(Long id);
    Recensement save(Recensement recensement);
    void deleteById(Long id);
    Recensement update(Recensement recensement);
}
