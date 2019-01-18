package com.cybertek.tests;

import com.cybertek.Utilities.TestBase;
import com.cybertek.pages.HomePage;
import org.testng.annotations.Test;

class LoginTestWithProperties extends TestBase {

    @Test
    public void readPropertyTest(){
        driver.get(ConfigurationReader.getProperty("url"));

        HomePage homePage = new HomePage();

        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        homePage.login(username, password);



    }
}