package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "staff")
public class Staff {

    @Id
    private int staffId;

    private String name;
    private String role;
    private String contactNo;

    private int assignedHospitalId;
}