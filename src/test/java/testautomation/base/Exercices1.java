package testautomation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercices1 {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement shiftingContent =driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement menulElement = driver.findElement(By.partialLinkText("Example 1: Menu Element"));
        System.out.println(menulElement.getTagName());
        menulElement.click();

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());



    }

    public static void main(String[] args) {
        Exercices1 test = new Exercices1();
        test.setUp();
    }
}
