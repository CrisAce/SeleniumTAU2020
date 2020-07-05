package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private WebDriver driver;
    private By nestedFramesButton = By.linkText("Nested Frames");
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By textLeftFrame = By.tagName("body");


    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickNestedFramesButton(){
        driver.findElement(nestedFramesButton).click();
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(leftFrame);
    }
    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame(){
        switchToBottomFrame();
        return driver.findElement(textLeftFrame).getText();
    }

}
