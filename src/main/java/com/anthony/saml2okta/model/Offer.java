package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "offer")
public class Offer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    private Lead lead;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lender_catalog_id", referencedColumnName = "id")
    private LenderCatalog lenderCatalog;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name="offer_data")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample offerData;

    @Column(name="gap_insurance")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample gapInsurance;

    @Column(name="warranty")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample warranty;

    @Column(name="insurance")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample insurance;
}
