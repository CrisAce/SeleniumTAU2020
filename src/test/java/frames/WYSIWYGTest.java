package frames;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.WYSIWYGPage;

import static org.testng.Assert.assertEquals;

public class WYSIWYGTest extends BaseTest {

    @Test
    public void testWYSIWYGPage(){
       WYSIWYGPage page = homePage.clickWYSIWYGPage();
       String text1 ="Hello ";
       String text2 ="World";
       page.clearTextAria();
       page.setTextAria(text1);
       page.decreseIndentation();
       page.setTextAria(text2);

       assertEquals(page.getTextFromEditor(),text1+text2,"the text is wrong");

    }
}
