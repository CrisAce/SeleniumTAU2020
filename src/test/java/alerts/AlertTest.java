package alerts;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.JavascripAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlerts(){
       JavascripAlertsPage alert =homePage.clickJavaScriptAlerts();
       alert.clickTriggerAlertButton();
       alert.acceptAlert();
       assertEquals(alert.getTextResult(),"You successfuly clicked an alert","Error, you didn't click on the accept");
    }

    @Test
    public void testAlertsConfirm(){
        JavascripAlertsPage alert =homePage.clickJavaScriptAlerts();
        alert.clickTriggerConformButton();
        assertEquals(alert.getTextFromAlert(),"I am a JS Confirm","Error , message incorect");
    }

    @Test
    public void testPromptConfirm(){
        JavascripAlertsPage alert =homePage.clickJavaScriptAlerts();
        alert.clickPromptButton();
        String text = "Cristi Ion";
        alert.alert_setInput(text);
        alert.acceptAlert();
        assertEquals(alert.getTextResult(),"You entered: "+text,"wrong message");

    }

}
