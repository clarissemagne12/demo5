package com.example.demo;

import com.example.demo.entities.Role;

import java.util.List;
import java.util.Optional;

public interface Rolei {
    List<Role> findAll();
    Optional<Role> findById(Long id);
    Role save(Role role);
    void deleteById(Long id);
    Role update(Role role);



}
