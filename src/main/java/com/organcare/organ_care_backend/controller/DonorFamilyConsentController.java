package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.DonorFamilyConsent;
import com.organcare.organ_care_backend.repository.DonorFamilyConsentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/family-consent")
@CrossOrigin(origins = "*")
public class DonorFamilyConsentController {

    private final DonorFamilyConsentRepository repository;

    public DonorFamilyConsentController(DonorFamilyConsentRepository repository) {
        this.repository = repository;
    }

    // GET
    @GetMapping
    public List<DonorFamilyConsent> getAll() {
        return repository.findAll();
    }

    // ADD / UPDATE
    @PostMapping
    public DonorFamilyConsent create(@RequestBody DonorFamilyConsent obj) {
        return repository.save(obj);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}