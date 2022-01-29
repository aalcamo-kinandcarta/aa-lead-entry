package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lead_id", referencedColumnName = "id")
    private Lead lead;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "assigned_to_agent_id", referencedColumnName = "id")
    private Agent agent;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(name="planned_start_date")
    private OffsetDateTime plannedDtartDate;

    @Column(name="planned_end_date")
    private OffsetDateTime plannedEndDate;

    @Column(name="actual_start_date")
    private OffsetDateTime actualStartDate;

    @Column(name="actual_end_date")
    private OffsetDateTime actualEndDate;
}
