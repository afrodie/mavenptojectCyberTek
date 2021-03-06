package com.cybertek.tests;

import com.cybertek.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.pkcs.SigningCertificateInfo;

public class HoverTest extends TestBase {
    @Test
    public void test(){
        driver.get("http:/www.amazon.com");
        WebElement signIn=driver.findElement(By.xpath("//span[.='Hello.sign in']"));
        //moving the element on top of the given element
        actions.moveToElement(signIn).perform();

        driver.findElement(By.xpath("//span[.='your Hearts']")).click();
        Assert.assertTrue(driver.getTitle().contains("Interesting"));
    }
    @Test
    public void test2(){
        driver.get("http://www.amazon.com");
       WebElement help=driver.findElement(By.xpath("(//a[.='Help'][2]"));
       actions.moveToElement(help).perform();
    }
}
