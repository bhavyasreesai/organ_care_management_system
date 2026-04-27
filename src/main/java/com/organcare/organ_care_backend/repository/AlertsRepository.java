package com.organcare.organ_care_backend.repository;

import com.organcare.organ_care_backend.model.Alerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertsRepository extends JpaRepository<Alerts, Integer> {
}