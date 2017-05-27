package com.mindwork.send.service;


import com.mindwork.receive.model.message.MessageWrapped;
import com.mindwork.send.model.TextMessageForSend;
import com.mindwork.util.Token;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import java.util.concurrent.ExecutionException;


public class MessageSender {

    public MessageWrapped sendMessage(TextMessageForSend textMessageForSend) throws ExecutionException, InterruptedException {
        return ClientBuilder.newClient()
                .target("https://api.telegram.org/bot" + Token.getToken() + "/sendMessage")
                .request()
                .post(Entity.json(textMessageForSend), MessageWrapped.class);
    }
}
