package com.mindwork;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindwork.model.get_me.GetMe;
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
    public void testGetMe() {
        GetMe me = null;

        try (InputStream is = App.class.getClassLoader().getResourceAsStream("private.properties")) {
            Properties prop = new Properties();
            prop.load(is);
            String token = prop.getProperty("telegram.token");

            Client client = ClientBuilder.newClient(new ClientConfig());
            String entity = client.target("https://api.telegram.org/bot" + token + "/getMe")
                    .request()
                    .get(String.class);

            System.out.println(entity);

            ObjectMapper mapper = new ObjectMapper();

            me = mapper.readValue(entity, GetMe.class);

            System.out.println(me.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(me);
        Assert.assertEquals(me.getOk(), true);
    }
}
