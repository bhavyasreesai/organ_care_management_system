package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.OrganTesting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganTestingRepository extends JpaRepository<OrganTesting, Integer> {
}