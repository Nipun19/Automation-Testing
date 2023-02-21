package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadPage {
    private WebDriver driver;
    private By link_Example1 = By.xpath("//*[@id=\"content\"]/div/a[1]");

    public DynamicLoadPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExamplePage clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExamplePage(driver);
    }
}
