package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductsPage;

import static org.testng.Assert.assertEquals;

public class Steps {
    private WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
    }

    @When("I press the products button")
    public void i_press_the_products_button() {
        assertEquals(homePage.getText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        homePage.clickProductButton();
    }

    @When("I press the view details")
    public void i_press_the_view_details() throws InterruptedException {
        Thread.sleep(3000);
        productsPage.clickViewProductButton();

    }

    @Then("Show the first product details")
    public void show_the_first_product_details() throws InterruptedException {
        assertEquals(productDetailPage.getName(), "Blue Top", "Product name error");
        assertEquals(productDetailPage.getCategory(), "Category: Women > Tops", "Product category error");
        Thread.sleep(3000);
        assertEquals(productDetailPage.getPriceText(), "Rs. 500", "Product price error");
        assertEquals(productDetailPage.getAvailibilityText(), "Availability:", "Product availibility error");
        assertEquals(productDetailPage.getCondition(), "Condition: New", "Product condition error");
        assertEquals(productDetailPage.getbrandText(), "Brand: Polo", "Product brand error");

    }
}

