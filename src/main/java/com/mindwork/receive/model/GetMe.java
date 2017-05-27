package com.mindwork.receive.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mindwork.receive.model.User;
import lombok.Data;
import lombok.ToString;

@Data
public class GetMe {

    private Boolean ok;

    @JsonProperty(value = "result")
    private User user;
}
