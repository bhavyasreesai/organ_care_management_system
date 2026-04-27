package com.organcare.organ_care_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "storage_location")
public class StorageLocation {

    @Id
    private int storageLocationId;

    private String locationName;
    private String temperatureControl;
    private int capacity;

    private int responsibleStaffId;
}