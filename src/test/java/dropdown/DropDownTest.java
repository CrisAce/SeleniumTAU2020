package dropdown;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        DropDownPage dropDownPage =homePage.clickDropdownLink();
        String option ="Option 1";
        dropDownPage.selectFromDropdown(option);
        List<String> selectedOptions =dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
