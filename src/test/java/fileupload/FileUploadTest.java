package fileupload;

import org.testng.annotations.Test;
import testautomation.base.BaseTest;
import testautomation.pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
       FileUploadPage testPage= homePage.clickFileUploadPage();
       testPage.uploadFile("/Users/cristianion/IdeaProjects/SeleniumWebDriver2020/resources/file.properties");
        assertEquals(testPage.getMessage(),"file.properties","incorrect file");
    }

}

