package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lead")
public class Lead extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "_id")
    private UUID roleID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prospect_id", referencedColumnName = "id")
    private Prospect prospect;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asset_id", referencedColumnName = "id")
    private Vehicle vehicle;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "source_catalog_id", referencedColumnName = "id")
    private SourceCatalog sourceCatalog;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name = "score")
    @Enumerated(EnumType.STRING)
    private ScoreEnum score;

    @Column(name = "current_loan")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample currentLoan;

    @Column(name = "current_insurance")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample currentInsurance;

    @Column(name = "comments")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample comments;

    @Column(name = "email")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample email;

    @Column(name = "sms")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample sms;

    @Column(name = "phone_call")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample phoneCall;
}
