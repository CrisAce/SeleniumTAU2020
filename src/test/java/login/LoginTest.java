package login;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.LoginPage;
import testautomation.pages.SecureAriaPage;

import static org.testng.Assert.*;

public class LoginTest  extends BaseTest {

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        SecureAriaPage secureAriaPage =loginPage.clickLoginButton();
        String actualMessage = secureAriaPage.getAlertText();
        assertTrue(actualMessage.contains("You logged into a secure area!"),"Alert text incorrect");

    }
}
