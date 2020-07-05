package forgotpassword;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.EmailSentPage;
import testautomation.pages.ForgotPasswordPage;
import testautomation.pages.HomePage;

import static org.testng.Assert.assertEquals;


public class ForgotPasswordTest extends BaseTest {

    @Test
    public  void testForgotPasswordPage(){
        ForgotPasswordPage forgotPasswordTest = homePage.clickForgotPasswordLink();
        forgotPasswordTest.setEmailFiled("cristi.ion21@gmail.com");
        EmailSentPage page =forgotPasswordTest.clickretrievePasswordButton();
        assertEquals(page.getTextMessageAlert().contains("Your e-mail's been sent!"),"Fail, the message is wrong");
    }


}
