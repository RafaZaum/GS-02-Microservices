package com.greenenergy.green_energy.service;

import com.greenenergy.green_energy.model.*;
import com.greenenergy.green_energy.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class energiaRenovavelService {

    private final energiaRenovavelRepository repository;

    public energiaRenovavelService(energiaRenovavelRepository repository) {
        this.repository = repository;
    }

    public List<energiaRenovavel> findAll() {
        return repository.findAll();
    }

    public energiaRenovavel findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Storage not found"));
    }

    public List<energiaRenovavel> findByType(String type) {
        return repository.findByTypeContaining(type);
    }

    public energiaRenovavel save(energiaRenovavel storage) {
        return repository.save(storage);
    }

    public energiaRenovavel update(energiaRenovavel storage) {
        return repository.save(storage);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}