package com.brava.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.Date;

@Value
public class Todo {

    @JsonProperty("title")
    private final String title;

    @JsonProperty("description")
    private final String description;

    @JsonProperty("dueDate")
    private final Date dueDate;

    @JsonCreator
    public Todo(@JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("dueDate") Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }
}
