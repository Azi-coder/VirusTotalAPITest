package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages_part1.CategoriesPage;
import pages_part1.HomePage;
import pages_part1.SportCategoryPage;
import pages_part2.LikesPage;
import pages_part2.LoginPage;
import pages_part2.SelectedProductPage;
import pages_part2.SuperPricePage;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseAppiumTest {

    AppiumDriver driver;
    HomePage homePage;
    CategoriesPage categoriesPage;
    SportCategoryPage sportCategoryPage;
    SuperPricePage superPricePage;
    SelectedProductPage selectedProductPage;
    LoginPage loginPage;
    LikesPage likesPage;


    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", "/Users/vngrs/Documents/IntelliJProjects/firstAppiumTest/apps/hepsiburada-5-5-9.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        homePage = new HomePage(driver);
        categoriesPage = new CategoriesPage(driver);
        sportCategoryPage = new SportCategoryPage(driver);
        superPricePage = new SuperPricePage(driver);
        selectedProductPage = new SelectedProductPage(driver);
        loginPage = new LoginPage(driver);
        likesPage = new LikesPage(driver);
    }

    @AfterTest
    public void quit() {
        if(driver!=null)
            driver.quit();
    }
}
