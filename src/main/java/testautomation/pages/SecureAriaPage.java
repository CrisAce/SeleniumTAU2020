package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAriaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public SecureAriaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
