package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "loan_history")
public class LoanHistory extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loan_id", referencedColumnName = "id")
    private Loan loan;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name = "score")
    @Enumerated(EnumType.STRING)
    private ScoreEnum score;

    @Column(name="effective_date")
    private OffsetDateTime effectiveDate;

    @Column(name="created_by_user_id")
    private UUID createdByUserId;

}
