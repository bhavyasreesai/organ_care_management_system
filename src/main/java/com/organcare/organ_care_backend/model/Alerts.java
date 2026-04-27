package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alerts")
public class Alerts {

    @Id
    private int alertId;

    private int recipientId;
    private int staffId;
    private int organId;
    private String alertType;
    private String alertDateTime;
    private String status;
}