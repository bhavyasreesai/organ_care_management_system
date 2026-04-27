package com.organcare.organ_care_backend.controller;

import com.organcare.organ_care_backend.model.LegalDocumentation;
import com.organcare.organ_care_backend.repository.LegalDocumentationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/legal-documents")
@CrossOrigin(origins = "*")
public class LegalDocumentationController {

    private final LegalDocumentationRepository repository;

    public LegalDocumentationController(LegalDocumentationRepository repository) {
        this.repository = repository;
    }

    // GET
    @GetMapping
    public List<LegalDocumentation> getAll() {
        return repository.findAll();
    }

    // ADD / UPDATE
    @PostMapping
    public LegalDocumentation create(@RequestBody LegalDocumentation obj) {
        return repository.save(obj);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}