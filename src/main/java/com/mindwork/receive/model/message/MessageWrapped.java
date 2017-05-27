package com.mindwork.receive.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class MessageWrapped {

    private Boolean ok;

    @JsonProperty(value = "result")
    private Message message;
}
