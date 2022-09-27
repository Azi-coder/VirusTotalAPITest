package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ProductsPage {
    WebDriver driver;
    private By firstItemViewProduct = By.xpath("//ul/li/a[@href='/product_details/1']");
    private By secondItemAddButton = By.xpath("(//a[@data-product-id='2'])[1]");
    private By productButton = By.cssSelector("a[href = '/products']");
    private By continueShoppingButton = By.xpath("//div/button[text()='Continue Shopping']");
    private By viewCartButton = By.xpath("//li/a[@href = '/view_cart']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void showFirstItem() {
        driver.findElement(firstItemViewProduct).click();
    }

    public void clickProductButton() {
        driver.findElement(productButton).click();
    }

    public void continueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    public void viewCart() {
        driver.findElement(viewCartButton).click();
    }

}
