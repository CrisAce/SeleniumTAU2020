package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGPage {
    private WebDriver driver;
    private String editorIframeId ="mce_0_ifr";
    private By textAria =By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public WYSIWYGPage(WebDriver driver){
        this.driver=driver;
    }

    public void clearTextAria(){
        switchToEditAria();
        driver.findElement(textAria).clear();
        switchToMainAria();
    }

    public void setTextAria(String text){
        switchToEditAria();
        driver.findElement(textAria).sendKeys(text);
        switchToMainAria();
    }

    public void decreseIndentation(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditAria();
        String text =driver.findElement(textAria).getText();
        switchToMainAria();
        return text;
    }

    private void switchToEditAria(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainAria(){
        driver.switchTo().parentFrame();
    }


}
