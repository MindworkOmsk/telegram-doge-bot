package com.mindwork.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class UpdatesHeap {

    private Boolean ok;

    @JsonProperty(value = "result")
    private List<Update> updates;
}
