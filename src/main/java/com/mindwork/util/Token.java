package com.mindwork.util;


import com.mindwork.App;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Token {

    private static String TOKEN;

    private Token() {

    }

    public static String getToken() {
        if (TOKEN == null) {
            try (InputStream is = App.class.getClassLoader().getResourceAsStream("private.properties")) {
                Properties prop = new Properties();
                prop.load(is);
                TOKEN = prop.getProperty("telegram.token");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return TOKEN;
    }
}
