package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    private WebDriver driver;
    private By name = By.xpath("//h2[.='Blue Top']");
    private By category = By.xpath("//*[@class='product-information']//p[text()='Category: Women > Tops']");
    private By price = By.xpath("//span/span[text()='Rs. 500']");
    private By availibility = By.xpath("//div/p[2]/b");
    private By condition = By.xpath("(//div[@class='product-information']//p)[3]");
    private By brand = By.xpath("(//div[@class='product-information']//p)[4]");

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
    }
    public String getName(){
        return driver.findElement(name).getText();
    }
    public String getCategory(){
        return driver.findElement(category).getText();
    }
    public String getPriceText(){
        return driver.findElement(price).getText();
    }
    public String getAvailibilityText(){
        return driver.findElement(availibility).getText();
    }
    public String getbrandText(){
        return driver.findElement(brand).getText();
    }
    public String getCondition(){
        return driver.findElement(condition).getText();
    }
}
