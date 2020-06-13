package org.testingchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNameTests extends WebDriverSettings{



    @Test
    public void averageValueTest() {
        TestingChallengesPage testingChallengesPage = PageFactory.initElements(driver, TestingChallengesPage.class);

        testingChallengesPage.openPage();
        Assert.assertEquals(driver.getTitle(), "Testing Challenges");
        testingChallengesPage.enterFirstName("John");
        testingChallengesPage.clickSubmitButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("span.values-tested")).getText(), "1");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.values-description > li")).getText(), "Average value");

    }

    @Test
    public void emptyValueTest() {
        TestingChallengesPage testingChallengesPage = PageFactory.initElements(driver, TestingChallengesPage.class);

        testingChallengesPage.openPage();
        Assert.assertEquals(driver.getTitle(), "Testing Challenges");
        testingChallengesPage.clickSubmitButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("span.values-tested")).getText(), "1");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.values-description > li")).getText(), "Empty value");

    }

    @Test
    public void spaceValueTest() {
        TestingChallengesPage testingChallengesPage = PageFactory.initElements(driver, TestingChallengesPage.class);

        testingChallengesPage.openPage();
        Assert.assertEquals(driver.getTitle(), "Testing Challenges");
        testingChallengesPage.enterFirstName(" ");
        testingChallengesPage.clickSubmitButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("span.values-tested")).getText(), "1");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.values-description > li")).getText(), "Space");

    }

    @Test
    public void otherCharsTest() {
        TestingChallengesPage testingChallengesPage = PageFactory.initElements(driver, TestingChallengesPage.class);

        testingChallengesPage.openPage();
        Assert.assertEquals(driver.getTitle(), "Testing Challenges");
        testingChallengesPage.enterFirstName("&");
        testingChallengesPage.clickSubmitButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("span.values-tested")).getText(), "2");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.values-description > li")).getText(), "Other chars then alphabetic");

    }

    @Test
    public void maximumValueTest() {
        TestingChallengesPage testingChallengesPage = PageFactory.initElements(driver, TestingChallengesPage.class);

        testingChallengesPage.openPage();
        Assert.assertEquals(driver.getTitle(), "Testing Challenges");
        testingChallengesPage.enterFirstName("MarryMarryMarryMarryMarryMarry");
        testingChallengesPage.clickSubmitButton();
        Assert.assertEquals(driver.findElement(By.cssSelector("span.values-tested")).getText(), "1");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.values-description > li")).getText(), "Maximum values");

    }
}
