package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.ContactPage;
import pages.HomePage;
import pages.SuccesPage;

public class BaseTest {
    WebDriver driver;
    protected HomePage homepage;
    protected ContactPage contactPage;
    protected SuccesPage successPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        homepage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        successPage = new SuccesPage(driver);
    }

    @AfterClass
    public void quitFrom() {
        driver.quit();
    }

}
