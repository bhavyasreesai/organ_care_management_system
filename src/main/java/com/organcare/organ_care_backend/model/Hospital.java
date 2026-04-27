package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hospital")
public class Hospital {

    @Id
    private int hospitalId;

    private String hospitalName;
    private String location;
    private String contactNo;
    private String departments;
}