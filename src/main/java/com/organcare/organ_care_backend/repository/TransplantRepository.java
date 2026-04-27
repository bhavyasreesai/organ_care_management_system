package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.Transplant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransplantRepository extends JpaRepository<Transplant, Integer> {
}