package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}