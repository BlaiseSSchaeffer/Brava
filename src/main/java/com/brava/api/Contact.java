package com.brava.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class Contact {

    @JsonProperty("first_name")
    private final String firstName;

    @JsonProperty("last_name")
    private final String lastName;

    @JsonCreator
    public Contact(@JsonProperty("first_name") String firstName,
                   @JsonProperty("last_name") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
