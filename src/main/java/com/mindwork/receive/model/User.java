package com.mindwork.receive.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class User {

    private Integer id;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastname;

    private String username;

    @JsonProperty(value = "language_code")
    private String languageCode;
}
