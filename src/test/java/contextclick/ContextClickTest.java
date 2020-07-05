package contextclick;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextClickTest extends BaseTest {

    @Test
    public void testContextClick(){
       ContextMenuPage contextPage =homePage.clickContextMenuPage();
       contextPage.rightClickInBox();
       String alertMessage = contextPage.getTextFromJSAlert();
       assertEquals(alertMessage,"You selected a context menu","Message is incorrect");
       System.out.println(alertMessage);
       contextPage.acceptAlert();

    }
}
