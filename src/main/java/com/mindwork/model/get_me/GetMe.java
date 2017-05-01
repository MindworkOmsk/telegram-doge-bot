package com.mindwork.model.get_me;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GetMe {

    @Getter
    @Setter
    private Boolean ok;

    @Getter
    @Setter
    @JsonProperty(value = "result")
    private BotInfo botInfo;
}
