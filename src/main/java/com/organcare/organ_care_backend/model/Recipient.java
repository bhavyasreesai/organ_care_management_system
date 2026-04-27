package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipient")
public class Recipient {

    @Id
    private int recipientId;

    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private String organRequired;
    private String urgencyLevel;
    private String notes;
}