package Dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown("Option 1");
    }
}
