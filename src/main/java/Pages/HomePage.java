package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");
    // this method no need if we use following method.because we can use following method repetly.

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    //this is a following method and it can use common method to every clicking option.
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
