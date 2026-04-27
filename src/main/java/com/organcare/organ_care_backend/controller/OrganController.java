package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Organ;
import com.organcare.organ_care_backend.repository.OrganRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organs")
@CrossOrigin(origins = "*")
public class OrganController {

    private final OrganRepository repository;

    public OrganController(OrganRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Organ> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Organ add(@RequestBody Organ o) {
        return repository.save(o);
    }

    @GetMapping("/{id}")
    public Organ getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}