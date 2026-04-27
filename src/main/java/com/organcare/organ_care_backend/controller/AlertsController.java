package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Alerts;
import com.organcare.organ_care_backend.repository.AlertsRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alerts")
@CrossOrigin(origins = "*")
public class AlertsController {

    private final AlertsRepository repository;

    public AlertsController(AlertsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Alerts> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Alerts add(@RequestBody Alerts obj) {
        return repository.save(obj);
    }

    @GetMapping("/{id}")
    public Alerts getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}