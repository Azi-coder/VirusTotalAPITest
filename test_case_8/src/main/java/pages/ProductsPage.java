package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;
    private By productsText = By.cssSelector("h2[class = 'title text-center']");
    private By viewProductButton = By.xpath("//a[@href = '/product_details/1']");
    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }
    public String getProductText(){
        return driver.findElement(productsText).getText();
    }
    public void clickViewProductButton(){
        driver.findElement(viewProductButton).click();
    }
}
