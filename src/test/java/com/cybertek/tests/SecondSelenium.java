package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/Users/cybertekschool/Documents/selenium dependencies/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver(); // this line open firefox driver

        driver.get("https://etsy.com");

        driver.navigate().to("https://amazon.com");

        driver.navigate().back();

        driver.navigate().forward();



    }

}

