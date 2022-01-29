package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "document")
public class Document extends BaseEntity {

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
    @JoinColumn(name = "loan_id", referencedColumnName = "id")
    private Loan loan;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private DocumentEnum document;

    @Column(name="request_link")
    private String requestLink;

    @Column(name="location")
    private String location;

    @Column(name="requested_date")
    private OffsetDateTime requestedDate;

    @Column(name="upload_date")
    private OffsetDateTime uploadDate;

    @Column(name="expiration_date")
    private OffsetDateTime expirationDate;

    @Column(name="requested_by_agent_id")
    private UUID requestedByAgentId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uploaded_by_customer_id", referencedColumnName = "id")
    private Customer customer;
}
