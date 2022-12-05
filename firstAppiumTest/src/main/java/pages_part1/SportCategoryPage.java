package pages_part1;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SportCategoryPage {
    AppiumDriver driver;
    private By location = By.id("com.pozitron.hepsiburada:id/textViewLocation");
    public SportCategoryPage(AppiumDriver driver){
        this.driver = driver;
    }
    public String getLocation(){
        return driver.findElement(location).getText();
    }

}
