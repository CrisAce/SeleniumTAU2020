package keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.KeyPressesPage;

import static org.testng.Assert.*;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPage =homePage.clickKeyPress();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPage =homePage.clickKeyPress();
        keyPage.enterPi();

    }



}
