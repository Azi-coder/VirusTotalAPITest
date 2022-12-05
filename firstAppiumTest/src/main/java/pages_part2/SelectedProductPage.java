package pages_part2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SelectedProductPage {
    AppiumDriver driver;
    AndroidTouchAction action;

    private By geriButonu = By.id("com.pozitron.hepsiburada:id/leftIcon");
    private By favoriButonu = By.id("com.pozitron.hepsiburada:id/product_detail_favourites_new");
    private By loginMessage = By.id("android:id/message");
    private By acceptLoginButton = By.id("android:id/button1");
    private By productImage = By.id("com.pozitron.hepsiburada:id/productImage");

    public SelectedProductPage(AppiumDriver driver){
        this.driver = driver;
        action = new AndroidTouchAction(driver);
    }

    public void clickPhoto(){
        driver.findElement(productImage).click();
    }
    public void scrollPhoto(){
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        AndroidElement photo1 = (AndroidElement) driver.findElements(productImage).get(0);
        action.press(ElementOption.element(photo1)).waitAction().moveTo(PointOption.point(10, 1000)).release().perform();
    }
    public void likeProduct(){
        driver.findElement(favoriButonu).click();
    }
    public String getLoginMessage(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(loginMessage).getText();
    }
    public void acceptLoginMessage(){
        driver.findElement(acceptLoginButton).click();
    }
    public void turnBack(){
        driver.findElement(geriButonu).click();
    }

}
