package com.organcare.organ_care_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.organcare.organ_care_backend.model.Organ;

public interface OrganRepository extends JpaRepository<Organ, Integer> {
}