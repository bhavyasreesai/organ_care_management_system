package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Recipient;
import com.organcare.organ_care_backend.repository.RecipientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipients")
@CrossOrigin(origins = "*")
public class RecipientController {

    private final RecipientRepository repository;

    public RecipientController(RecipientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Recipient> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Recipient add(@RequestBody Recipient r) {
        return repository.save(r);
    }

    @GetMapping("/{id}")
    public Recipient getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}