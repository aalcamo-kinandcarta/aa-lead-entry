package com.anthony.saml2okta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class JsonContentSample {
    @JsonProperty("info")
    public String info;
}
