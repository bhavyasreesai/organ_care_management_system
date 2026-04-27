package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "donor_family_consent")
public class DonorFamilyConsent {

    @Id
    private int consentId;

    private int donorId;
    private String familyMemberName;
    private String relationshipToDonor;
    private String consentDate;
    private String contactNo;
    private String consentStatus;
}