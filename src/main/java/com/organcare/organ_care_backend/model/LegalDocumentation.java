package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "legal_documentation")
public class LegalDocumentation {

    @Id
    private int documentId;

    private int donorId;
    private int recipientId;
    private String documentType;
    private String issueDate;
    private String expiryDate;
    private int authorizedBy;
}