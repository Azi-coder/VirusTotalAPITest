package pages_part2;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    AppiumDriver driver;
    private By userName = By.className("android.widget.EditText");
    private By girisYapButonu = By.className("android.widget.Button");
    private By password = By.className("android.widget.EditText");

    public LoginPage(AppiumDriver driver){
        this.driver = driver;
    }
    public void enterUsername(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(userName).sendKeys("azmarslnts@hotmail.com");
        driver.findElement(girisYapButonu).click();
    }
    public void enterPassword(){
        driver.findElement(password).sendKeys("azim=741");
        driver.findElement(girisYapButonu).click();
    }
}
