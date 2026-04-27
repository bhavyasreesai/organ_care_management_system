package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.DonorFamilyConsent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorFamilyConsentRepository extends JpaRepository<DonorFamilyConsent, Integer> {
}