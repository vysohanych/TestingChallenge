package org.testingchallenges;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebDriverSettings {

    public ChromeDriver driver;

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/vitaliy/tools/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
