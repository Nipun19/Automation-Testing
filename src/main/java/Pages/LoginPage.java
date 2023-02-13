package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"login\"]/button");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }
    public void setUserName(String tomsmith){
        driver.findElement(usernameField).sendKeys(tomsmith);
    }
    public void setPassword(String SuperSecretPassword){
        driver.findElement(usernameField).sendKeys(SuperSecretPassword);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
