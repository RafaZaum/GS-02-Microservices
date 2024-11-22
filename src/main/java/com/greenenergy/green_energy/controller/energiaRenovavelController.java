package com.greenenergy.green_energy.controller;

import com.greenenergy.green_energy.model.*;
import com.greenenergy.green_energy.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storages")
public class energiaRenovavelController {

    private final energiaRenovavelService service;

    public energiaRenovavelController(energiaRenovavelService service) {
        this.service = service;
    }

    @GetMapping
    public List<energiaRenovavel> getAllStorages() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public energiaRenovavel getStorageById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/search")
    public List<energiaRenovavel> searchByType(@RequestParam String type) {
        return service.findByType(type);
    }

    @PostMapping
    public energiaRenovavel createStorage(@RequestBody energiaRenovavel storage) {
        return service.save(storage);
    }

    @PutMapping
    public energiaRenovavel updateStorage(@RequestBody energiaRenovavel storage) {
        return service.update(storage);
    }

    @DeleteMapping("/{id}")
    public void deleteStorage(@PathVariable Long id) {
        service.deleteById(id);
    }
}



