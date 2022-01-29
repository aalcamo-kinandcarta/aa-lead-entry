package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "source_catalog")
public class SourceCatalog extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="name")
    private String nameame;

    @Column(name="info")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample info;
}
