package Base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Page Load timeout
        //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/Screenshot/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

}
