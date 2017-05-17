package com.mindwork.model.receive;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Message {

    @JsonProperty(value = "message_id")
    private Integer messageId;

    private Date date;

    private Chat chat;

    private String text;
}
