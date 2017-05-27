package com.mindwork.receive.service;


import com.mindwork.receive.model.UpdatesHeap;
import com.mindwork.util.Token;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;


public class UpdatesBroker {

    public UpdatesHeap getAllUpdates() throws IOException {
        MultivaluedMap<String, String> postParameters = new MultivaluedHashMap<>();
        postParameters.add("offset", "999999999"); //bigger than all current update_id's.

        return ClientBuilder.newClient()
                .target("https://api.telegram.org/bot" + Token.getToken() + "/getUpdates")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.form(postParameters), UpdatesHeap.class);
    }
}
