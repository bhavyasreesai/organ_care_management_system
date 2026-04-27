package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.StorageLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageLocationRepository extends JpaRepository<StorageLocation, Integer> {
}