package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "organ")
public class Organ {

    @Id
    private int organId;

    private String organName;
    private String bloodGroup;
    private String availabilityStatus;

    private int donorId;
    private int storageLocationId;

    private String expiryDate;
    private String notes;
}