package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneSearch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("searchterm"+ Keys.ENTER);
        String expected = "searchterm";
        String actual = driver.findElement(By.id("twotabsearchtextbox")).getText();

        if (expected.equals(actual)) {
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("searchterm = " + expected);

        }
    }
}
