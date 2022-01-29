package com.anthony.saml2okta.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "agent")
public class Agent extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="role_id")
    private UUID roleID;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastNmae;

    @Column(name="email")
    private String email;

    @Column(name="profile")
    @Convert(converter = JsonContentSample.class)
    private JsonContentSample profile;
}
