package com.organcare.organ_care_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.organcare.organ_care_backend.model.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, Integer> {
}