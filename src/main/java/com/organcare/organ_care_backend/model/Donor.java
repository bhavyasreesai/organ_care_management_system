package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data   // 🔥 THIS FIXES EVERYTHING
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "donor")
public class Donor {

    @Id
    private int donorId;

    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private String contactNo;
    private String medicalHistory;
    private String consentStatus;
}