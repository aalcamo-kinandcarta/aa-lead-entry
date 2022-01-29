package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "prospect")
public class Prospect {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Column(name="asset_id")
    private UUID assetId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name = "direct_mailer_pin")
    private String  directMailerPin;
}
