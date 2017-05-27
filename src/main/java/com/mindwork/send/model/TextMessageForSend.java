package com.mindwork.send.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class TextMessageForSend {

    @JsonProperty(value = "chat_id")
    private Integer chatId;

    private String text;

    public TextMessageForSend(Integer chatId,
                              String text) {
        this.chatId = chatId;
        this.text = text;
    }
}
