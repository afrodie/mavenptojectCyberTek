package com.cybertek.tests;

import com.cybertek.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DoubleClickTest extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        driver.switchTo().frame("iframeResult");
        Actions action=new Actions(driver);
        //identify the webelement on which we double click
        WebElement Text=driver.findElement(By.id("demo"));
        //double click on element
        action.doubleClick(Text).perform();
        Assert.assertTrue(Text.getAttribute("style").contains("red"));


    }
}
