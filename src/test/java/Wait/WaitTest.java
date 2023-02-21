package Wait;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTests {

    @Test

    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickdynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded Text is incorrect");

    }
}
