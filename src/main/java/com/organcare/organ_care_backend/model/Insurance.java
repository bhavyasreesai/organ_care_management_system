package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "insurance")
public class Insurance {

    @Id
    private int insuranceId;

    private int recipientId;
    private String insuranceCompany;
    private String policyNumber;
    private double coverageAmount;
    private String expiryDate;
    private String contactNo;
}