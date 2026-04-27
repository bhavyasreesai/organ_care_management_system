package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "organ_testing")
public class OrganTesting {

    @Id
    private int testId;

    private int organId;
    private String testType;
    private String testDate;
    private String testResult;
    private int testedBy;
}