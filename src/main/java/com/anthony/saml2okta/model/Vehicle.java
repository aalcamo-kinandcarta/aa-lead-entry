package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="vehicle_trim_id")
    private UUID vehicleTrimId;

    @Column(name="primary_owner_id")
    private UUID primaryOwnerId;

    @Column(name="secondary_owner_id")
    private UUID secondaryOwnerId;

    @Column(name="vin")
    private String vin;

    @Column(name="vehicle_data")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample vehicledata;

    @Column(name = "lookup_source")
    @Enumerated(EnumType.STRING)
    private LookupSourceEnum lookupSource;
}
