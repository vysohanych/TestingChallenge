package org.testingchallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingChallengesPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public TestingChallengesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    @FindBy(css = "input[type=\"submit\"]")
    private WebElement submitButton;

    public void openPage() {
        driver.get("http://testingchallenges.thetestingmap.org/index.php");
    }

    protected void enterFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    protected void clickSubmitButton() {
        submitButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.values-tested")));
    }
}
