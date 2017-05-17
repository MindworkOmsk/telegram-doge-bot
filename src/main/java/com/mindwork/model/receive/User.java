package com.mindwork.model.receive;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    @JsonProperty(value = "first_name")
    private String firstName;

    @Getter
    @Setter
    private String username;
}
