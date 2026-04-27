package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "follow_up")
public class FollowUp {

    @Id
    private int followUpId;

    private int recipientId;
    private int organId;
    private String checkupDate;
    private String healthStatus;
    private String medications;
    private String notes;
}