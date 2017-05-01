package com.mindwork.model.get_me;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class BotInfo {

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
