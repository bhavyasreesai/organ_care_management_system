package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.LegalDocumentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalDocumentationRepository extends JpaRepository<LegalDocumentation, Integer> {
}