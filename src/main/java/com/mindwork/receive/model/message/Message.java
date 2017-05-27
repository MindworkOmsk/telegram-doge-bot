package com.mindwork.receive.model.message;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mindwork.receive.model.Chat;
import com.mindwork.receive.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class Message {

    @JsonProperty(value = "message_id")
    private Integer messageId;

    private Date date;

    private Chat chat;

    private String text;

    @JsonProperty(value = "from")
    private User fromUser;
}
