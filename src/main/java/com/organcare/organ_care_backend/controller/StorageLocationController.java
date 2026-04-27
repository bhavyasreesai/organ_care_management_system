package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.StorageLocation;
import com.organcare.organ_care_backend.repository.StorageLocationRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/storage-locations")
@CrossOrigin(origins = "*")
public class StorageLocationController {

    private final StorageLocationRepository repository;

    public StorageLocationController(StorageLocationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<StorageLocation> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public StorageLocation add(@RequestBody StorageLocation obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public StorageLocation getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}