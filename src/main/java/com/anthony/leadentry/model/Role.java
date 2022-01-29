package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample profile;
}
