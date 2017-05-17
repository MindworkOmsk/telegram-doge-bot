package com.mindwork.model.send;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Message {

    //choose this
    @JsonProperty(value = "chat_id")
    private Integer chatId;

    //or this
    @JsonProperty(value = "chat_id")
    private String chatName;

    private String text;
}
