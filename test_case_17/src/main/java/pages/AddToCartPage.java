package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;
    private By addToCart = By.cssSelector("button[type = 'button']");
    private By continueShoppingButton = By.xpath("//button[@data-dismiss='modal']");
    private By cartButton = By.xpath("//ul/li/a[@href = '/view_cart']");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void add() {
        driver.findElement(addToCart).click();
    }

    public void continueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }
}
