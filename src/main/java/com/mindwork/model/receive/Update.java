package com.mindwork.model.receive;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;


@ToString
@Data
public class Update {

    @JsonProperty(value = "update_id")
    private Integer id;

    private Message message;
}
