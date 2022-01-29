package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="last_name")
    private String lastNmae;

    @Column(name="alias_name")
    private String aliasName;

    @Column(name="gender")
    private String gender;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="date_of_birtb")
    private String dob;

    @Column(name="ssn")
    private String ssn;

    @Column(name="address")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample address;

    @Column(name="previous_address")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample previousAddress;

    @Column(name="driver_license")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample driverLicense;

    @Column(name="employment")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample employment;

    @Column(name="finance_profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample financeProfile;

    @Column(name="isCitizen")
    private Boolean isCitizen;

    @Column(name="isActiveMilitary")
    private Boolean isActiveMilitary;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
