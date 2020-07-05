package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public DropDownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoverPage clickHovers(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavascripAlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavascripAlertsPage(driver);
    }
    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        return  new ContextMenuPage(driver);
    }
    public WYSIWYGPage clickWYSIWYGPage(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGPage(driver);
    }

    public FramePage clickFramesPage(){
        clickLink("Frames");
        return new FramePage(driver);
    }


    /**
     * This is a generic method for clicking all the link on the page
     * Since we have 45 links, we had to create 45 methods for webdriver interaction
     */
    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }


}
