package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
}