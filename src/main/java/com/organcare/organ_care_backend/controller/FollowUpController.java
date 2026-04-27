package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.FollowUp;
import com.organcare.organ_care_backend.repository.FollowUpRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/follow-ups")
@CrossOrigin(origins = "*")
public class FollowUpController {

    private final FollowUpRepository repository;

    public FollowUpController(FollowUpRepository repository) {
        this.repository = repository;
    }

    // GET
    @GetMapping
    public List<FollowUp> getAll() {
        return repository.findAll();
    }

    // ADD / UPDATE
    @PostMapping
    public FollowUp create(@RequestBody FollowUp obj) {
        return repository.save(obj);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}