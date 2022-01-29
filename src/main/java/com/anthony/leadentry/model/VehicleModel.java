package com.anthony.leadentry.model;

import javax.persistence.*;
import java.util.UUID;

public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_make_id", referencedColumnName = "id")
    private VehicleMake vehicleMake;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private VehicleTypeEnum vehicleTypeEnum;
}
