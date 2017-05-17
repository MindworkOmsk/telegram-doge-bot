package com.mindwork;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindwork.model.receive.method.GetMe;
import com.mindwork.util.Token;
import org.glassfish.jersey.client.ClientConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@RunWith(JUnit4ClassRunner.class)
public class TestGetMe {

    @Test
    public void testGetMe() throws IOException {
        Client client = ClientBuilder.newClient(new ClientConfig());
        String entity = client.target("https://api.telegram.org/bot" + Token.getToken() + "/getMe")
                .request()
                .get(String.class);

        System.out.println(entity);

        ObjectMapper mapper = new ObjectMapper();

        GetMe me = mapper.readValue(entity, GetMe.class);

        System.out.println(me.toString());

        Assert.assertNotNull(me);
        Assert.assertEquals(me.getOk(), true);
    }
}
