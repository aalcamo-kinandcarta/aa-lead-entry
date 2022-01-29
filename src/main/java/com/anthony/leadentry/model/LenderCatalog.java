package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lender_catalog")
public class LenderCatalog extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="contact_info")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample contactInfo;

    @Column(name="offer_info")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample offerInfo;

    @Column(name="stipulation")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample stipulation;

}
