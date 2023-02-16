package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_ClickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text is incorrect");
    }

    @Test
    public void getTextFromAlerts(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alertText();
        alertsPage.alert_ClickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert test is incorrect");
    }

    @Test
    public void testInputAlerts() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Nipun";
        alertsPage.alert_setInput(text);
        alertsPage.alert_ClickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Result text is incorrect");
    }

}
