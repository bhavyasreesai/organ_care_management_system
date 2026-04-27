package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "organ_transport")
public class OrganTransport {

    @Id
    private int transportId;

    private int organId;
    private String fromLocation;
    private String toLocation;
    private String transportDateTime;
    private String transportMode;
    private String temperatureMaintained;
    private int responsibleStaffId;
}