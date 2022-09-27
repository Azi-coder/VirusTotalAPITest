package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AddToCartPage;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

public class BaseTest {
    WebDriver driver;
    protected HomePage homePage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected AddToCartPage addToCartPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        addToCartPage = new AddToCartPage(driver);

    }
    @AfterClass
    public void quit(){
        //driver.quit();
    }
}
