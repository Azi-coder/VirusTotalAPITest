package pages_part2;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SuperPricePage {
    AppiumDriver driver;
    private By urun = By.xpath("(//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"])[1]");

    public SuperPricePage(AppiumDriver driver){
        this.driver = driver;
    }
    public void selectProduct(){
        driver.findElement(urun).click();
    }

}
