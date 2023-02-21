package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }

}
