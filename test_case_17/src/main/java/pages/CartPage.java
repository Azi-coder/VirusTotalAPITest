package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {
    WebDriver driver;
    private By cartText = By.xpath("//ol/li[text()='Shopping Cart']");
    private By itemDeleteButton = By.xpath("//a[@class = 'cart_quantity_delete']");
    private By deletedItem = By.xpath("//tbody/tr[@id='product-1']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartText() {
        return driver.findElement(cartText).getText();
    }

    public void deleteItem() {
        driver.findElement(itemDeleteButton).click();

    }

    public void controlItem() {
        driver.findElement(itemDeleteButton).click();
    }
}
