package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.OrganTransport;
import com.organcare.organ_care_backend.repository.OrganTransportRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/organ-transport")
@CrossOrigin(origins = "*")
public class OrganTransportController {

    private final OrganTransportRepository repository;

    public OrganTransportController(OrganTransportRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<OrganTransport> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public OrganTransport add(@RequestBody OrganTransport obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public OrganTransport getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}