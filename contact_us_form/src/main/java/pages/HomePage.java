package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By firstText = By.xpath("//h2");
    private By contactUsButton = By.cssSelector("a[href='/contact_us']");
    public ContactPage contactPage = new ContactPage(driver);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstText() {
        return driver.findElement(firstText).getText();
    }

    public void clickContactUsButton() {
        driver.findElement(contactUsButton).click();
    }

}
