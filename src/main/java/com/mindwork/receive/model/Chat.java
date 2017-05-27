package com.mindwork.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Chat {

    private Integer id;

    private String type;

    private String title;

    private String username;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "last_name")
    private String lastName;

    @JsonProperty(value = "all_members_are_administrators")
    private Boolean allMembersAreAdministrators;
}
