package com.cybertek.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configerationReader {
    private static Properties properties;


    static {
        String path="configeration.properties";
        try {
            FileInputStream= fileinputstream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

