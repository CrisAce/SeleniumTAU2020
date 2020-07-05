package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascripAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton= By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By alertMessage = By.id("result");

    public JavascripAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTriggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public void clickTriggerConformButton(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }
    public void confirmAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getTextResult(){
        return driver.findElement(alertMessage).getText();
    }

    public void alert_setInput(String text){
         driver.switchTo().alert().sendKeys(text);
    }

}
