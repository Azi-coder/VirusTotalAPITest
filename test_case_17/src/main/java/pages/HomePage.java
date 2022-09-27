package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private By firstText = By.xpath("//h2");
    private By productButton = By.cssSelector("a[href = '/products']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProductButton() {
        driver.findElement(productButton).click();
    }

    public String getText() {
        return driver.findElement(firstText).getText();
    }
}
