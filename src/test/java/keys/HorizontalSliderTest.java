package keys;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testHorizontalSlider(){
       HorizontalSliderPage slideTest = homePage.clickHorizontalSlider();
       slideTest.setSliderValue("4");
       assertEquals(slideTest.getSliderValue(),"4","value is incorrect");


    }
}
