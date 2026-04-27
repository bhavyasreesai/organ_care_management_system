package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Insurance;
import com.organcare.organ_care_backend.repository.InsuranceRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/insurance")
@CrossOrigin(origins = "*")
public class InsuranceController {

    private final InsuranceRepository repo;

    public InsuranceController(InsuranceRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Insurance> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Insurance create(@RequestBody Insurance obj) {
        return repo.save(obj);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "Deleted successfully";
    }
}