package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }

}
