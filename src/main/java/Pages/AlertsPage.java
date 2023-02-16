package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By triggerPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    //this can use to accept alerts and prompt buttons
    public void alert_ClickToAccept(){
        driver.switchTo().alert().accept();
    }

    //this is getting result in 'result' section text. this can use to accept alerts and prompt buttons
    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    //this is getting result in alert button text
    public String alertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    //get user input to alert
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
