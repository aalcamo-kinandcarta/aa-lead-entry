package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "credit")
public class Credit extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Column(name = "bureau")
    @Enumerated(EnumType.STRING)
    private BureauEnum bureau;

    @Column(name = "score")
    private short score;

    @Column(name="score_factors")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample scoreFactors;

    @Column(name="pull_date")
    private OffsetDateTime pullDate;

    @Column(name="inquiry")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample inquiry;

    @Column(name="home_loan_profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample homeLoanProfile;

    @Column(name="auto_loan_profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample autoLoanProfile;

    @Column(name="record_history")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample recordHistory;

    @Column(name="summary")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample summary;
}
