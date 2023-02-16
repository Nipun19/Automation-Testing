package Hover;

import Base.BaseTests;
import org.testng.annotations.Test;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
    }
}
