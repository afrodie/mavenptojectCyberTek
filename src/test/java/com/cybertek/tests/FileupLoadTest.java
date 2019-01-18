package com.cybertek.tests;

import com.cybertek.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FileupLoadTest extends TestBase {
    @Test
    public void fileUpload(){


        driver.get("http://the-internet.herokuapp.com/upload");

        //have to upload the file from my computer but first i need to locate the element
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        String pathOfMyFile = "/Users/dilorus/Downloads/test.txt";
        chooseFile.sendKeys(pathOfMyFile);


        driver.findElement(By.id("file-submit")).click();
    }

}