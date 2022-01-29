package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "loan")
public class Loan extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    private Lead lead;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id", referencedColumnName = "id")
    private Offer offer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lender_catalog_id", referencedColumnName = "id")
    private LenderCatalog lenderCatalog;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name="loan_profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample loanProfile;

    @Column(name="insurance")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample insurance;

    @Column(name="application")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample application;

    @Column(name="lien_payoff")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample lienPayoff;

    @Column(name="product_payoff")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample productPayoff;

    @Column(name="created_by_user_id")
    private UUID createdById;

    @Column(name="modified_by_user_id")
    private UUID modifiedById;

    @Column(name="created_date")
    private OffsetDateTime createdDate;

    @Column(name="modified_date")
    private OffsetDateTime modifiedDate;
}
