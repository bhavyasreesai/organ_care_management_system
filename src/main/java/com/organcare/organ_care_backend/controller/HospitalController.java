package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Hospital;
import com.organcare.organ_care_backend.repository.HospitalRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/hospitals")
@CrossOrigin(origins = "*")
public class HospitalController {

    private final HospitalRepository repo;

    public HospitalController(HospitalRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Hospital> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Hospital create(@RequestBody Hospital h) {
        return repo.save(h);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repo.deleteById(id);
    }
}