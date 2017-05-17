package com.mindwork.model.receive.method;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mindwork.model.receive.User;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GetMe {

    private Boolean ok;

    @JsonProperty(value = "result")
    private User user;
}
