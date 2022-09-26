package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactPage;
import pages.HomePage;
import pages.SuccesPage;

import static org.testng.Assert.assertEquals;

public class Steps {
    private WebDriver driver;

    ContactPage contactPage;
    SuccesPage successPage;
    HomePage homePage;


    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        successPage = new SuccesPage(driver);
        contactPage = new ContactPage(driver);

    }

    @When("I click the contact button")
    public void i_click_the_contact_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href = '/contact_us']")).click();


    }

    @Then("Taken to contact page")
    public void taken_to_contact_page() {
        assertEquals(driver.findElement(By.xpath("//h2[.= \"Contact Us\"]")).getText(), "CONTACT US", "TEXT ERROR");
    }

    @Given("I am on the contact page")
    public void i_am_on_the_contact_page() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/contact_us");
        driver.manage().window().maximize();
        successPage = new SuccesPage(driver);
        contactPage = new ContactPage(driver);
        homePage = new HomePage(driver);
    }

    @When("Fill in the blanks")
    public void fill_in_the_blanks() {
        contactPage.setnameInput("A");
        contactPage.setemailInput("a@hotmail.com");
        contactPage.setsubjectInput("a");
        contactPage.setmessageInput("a");
        contactPage.chooseFile("/Users/vngrs/Desktop/Screen Shot 2022-08-31 at 14.59.47.png");
    }

    @When("Click the submit button")
    public void click_the_submit_button() {
        contactPage.clickSubmitButton();
        contactPage.acceptSubmit();

    }

    @Then("Verify success message")
    public void verify_success_message() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.cssSelector("div[class = 'status alert alert-success']")).getText(), "", "Success message error");

    }

    @Then("Go to the homepage")
    public void go_to_the_homepage() {
        driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
        assertEquals(homePage.getFirstText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        driver.quit();

    }
}
