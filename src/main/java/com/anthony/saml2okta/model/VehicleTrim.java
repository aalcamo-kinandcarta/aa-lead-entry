package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vehicle_trim")
public class VehicleTrim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "vehicle_model_id")
    private UUID vehicleModelId;

    @Column(name = "year")
    private short year;
}
