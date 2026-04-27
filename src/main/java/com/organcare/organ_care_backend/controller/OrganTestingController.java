package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.OrganTesting;
import com.organcare.organ_care_backend.repository.OrganTestingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/organ-testing")
@CrossOrigin(origins = "*")
public class OrganTestingController {

    private final OrganTestingRepository repository;

    public OrganTestingController(OrganTestingRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<OrganTesting> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public OrganTesting add(@RequestBody OrganTesting obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public OrganTesting getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}