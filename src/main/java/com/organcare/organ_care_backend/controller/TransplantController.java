package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Transplant;
import com.organcare.organ_care_backend.repository.TransplantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transplants")
@CrossOrigin(origins = "*")
public class TransplantController {

    private final TransplantRepository repository;

    public TransplantController(TransplantRepository repository) {
        this.repository = repository;
    }

    // GET
    @GetMapping
    public List<Transplant> getAll() {
        return repository.findAll();
    }

    // ADD / UPDATE
    @PostMapping
    public Transplant create(@RequestBody Transplant obj) {
        return repository.save(obj);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}