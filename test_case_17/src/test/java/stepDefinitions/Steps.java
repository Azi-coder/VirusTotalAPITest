package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddToCartPage;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;

import static org.testng.Assert.assertEquals;

public class Steps {
    WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    CartPage cartPage;
    AddToCartPage addToCartPage;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        addToCartPage = new AddToCartPage(driver);
    }

    @When("I click the products button")
    public void i_click_the_products_button() throws InterruptedException {
        assertEquals(homePage.getText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        Thread.sleep(2000);
        homePage.clickProductButton();

    }

    @When("I add a product to cart")
    public void i_add_a_product_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        productsPage.showFirstItem();
        addToCartPage.add();
        Thread.sleep(2000);
        addToCartPage.continueShopping();
        addToCartPage.clickCartButton();
        assertEquals(cartPage.getCartText(), "Shopping Cart", "Shopping cart text error");

    }

    @Then("I remove added product from cart")
    public void i_remove_added_product_from_cart() {
        cartPage.deleteItem();
    }
}
