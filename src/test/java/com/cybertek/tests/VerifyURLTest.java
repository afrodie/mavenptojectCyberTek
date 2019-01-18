package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    1. Open chrome browser
	2. go to url "https://google.com"
	3. Verify url
		Expected url: "https://www.google.com/"

 */
/*
    1. Open chrome browser
	2. go to url "https://google.com"
	3. Verify url
		Expected url: "https://www.google.com/"
 */
public class VerifyURLTest {
    // THIS TEST IS SUPPOSED TO FAIL, mmy code is failing
    // your may pass
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("http://google.com");

        String expectedUrl = "https://www.google.com/";

        String actualUrl = driver.getCurrentUrl() ;

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }

        System.out.println(driver.getPageSource()); // gets the HTML of the page
    }
}





