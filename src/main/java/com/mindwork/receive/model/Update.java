package com.mindwork.receive.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mindwork.receive.model.message.Message;
import lombok.Data;
import lombok.ToString;


@ToString
@Data
public class Update {

    @JsonProperty(value = "update_id")
    private Integer id;

    private Message message;
}
