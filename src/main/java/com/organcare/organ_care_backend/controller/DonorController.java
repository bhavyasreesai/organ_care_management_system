package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Donor;
import com.organcare.organ_care_backend.repository.DonorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {

    private final DonorRepository repo;

    public DonorController(DonorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Donor> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Donor create(@RequestBody Donor d) {
        return repo.save(d);
    }

    @PutMapping("/{id}")
    public Donor update(@PathVariable int id, @RequestBody Donor d) {
        d.setDonorId(id);
        return repo.save(d);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "Donor deleted successfully";
    }
}