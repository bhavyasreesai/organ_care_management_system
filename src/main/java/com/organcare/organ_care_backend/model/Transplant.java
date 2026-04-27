package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transplant")
public class Transplant {

    @Id
    private int transplantId;

    private int donorId;
    private int recipientId;
    private int organId;
    private int hospitalId;
    private int surgeonId;
    private String transplantDate;
    private String status;
}