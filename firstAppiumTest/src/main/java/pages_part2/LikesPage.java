package pages_part2;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LikesPage {
    AppiumDriver driver;
    private By listItem = By.xpath("//android.view.View[@content-desc=\"Beğendiklerim Gizli liste Ürün ekle\"]/android.widget.TextView[3]");
    private By productName = By.xpath("//android.view.View[@content-desc=\"June Uzay Desenli Kapüşonlu Içi Polarlı Erkek Çocuk Mont\"]/android.widget.TextView");

    public LikesPage(AppiumDriver driver){
        this.driver = driver;
    }
    public void clickListItem(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(listItem).click();
    }
    public String getLikedProductName(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(productName).getText();
    }
}
