package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.Staff;
import com.organcare.organ_care_backend.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/staff")
@CrossOrigin(origins = "*")
public class StaffController {

    private final StaffRepository repo;

    public StaffController(StaffRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Staff> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Staff create(@RequestBody Staff s) {
        return repo.save(s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repo.deleteById(id);
    }
}