package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccesPage {
    WebDriver driver;
    private By successText = By.className("status");
    private By homeButton = By.xpath("//span/i[@class = 'fa fa-angle-double-left']");

    public SuccesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessText() {
        return driver.findElement(successText).getText();
    }

    public void clickHomeButton() {
        driver.findElement(homeButton).click();
    }


}
