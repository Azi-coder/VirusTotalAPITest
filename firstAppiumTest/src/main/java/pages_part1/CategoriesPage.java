package pages_part1;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CategoriesPage {
    AppiumDriver driver;
    private By sporKategorisiButonu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.ImageView");
    public CategoriesPage(AppiumDriver driver){
        this.driver = driver;
    }
    public void selectSportCategory(){
        driver.findElement(sporKategorisiButonu).click();
    }
}
