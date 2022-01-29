package com.anthony.leadentry.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JsonContentSample {
    @JsonProperty("info")
    public String info;
}
