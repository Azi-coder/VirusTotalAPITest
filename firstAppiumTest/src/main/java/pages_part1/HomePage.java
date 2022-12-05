package pages_part1;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage {
    AppiumDriver driver;
    private By noAccept = By.id("com.android.permissioncontroller:id/permission_deny_button");
    private By konum = By.id("com.pozitron.hepsiburada:id/textViewLocation");
    private By il = By.xpath("//android.widget.ImageView[@content-desc=\"İl seçin\"]");
    private By ilSec = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
    private By ilce = By.xpath("//android.widget.ImageView[@content-desc=\"İlçe seçin\"]");
    private By ilceSec = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
    private By mahalle = By.xpath("//android.widget.TextView[@content-desc=\"Mahalle seçin\"]");
    private By mahalleSec = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
    private By kaydetButonu = By.id("com.pozitron.hepsiburada:id/button");
    private By kayıtBilgisi = By.id("com.pozitron.hepsiburada:id/tvTitle");
    private By kategoriButonu = By.xpath("//android.widget.FrameLayout[@content-desc=\"Kategorilerim\"]/android.widget.FrameLayout/android.widget.ImageView");
    private By location = By.id("com.pozitron.hepsiburada:id/textViewLocation");
    private By superTeklif = By.id("com.pozitron.hepsiburada:id/textView_show_all");
    private By begenilerimButonu = By.id("com.pozitron.hepsiburada:id/nav_graph_my_list");


    public HomePage(AppiumDriver driver){
        this.driver = driver;
    }
    public void rejectAlert(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(noAccept).click();
    }
    public void selectLocation(){
        /*konum Locator'ına iki kere click işleminin sebebi ilk seferde Alert yüzünden tıklanamaması,
           yani ilk click işlemi, Alert'i kapatmak için yapılıyor.*/
        driver.findElement(konum).click();
        driver.findElement(konum).click();
        driver.findElement(il).click();
        driver.findElement(ilSec).click();
        driver.findElement(ilce).click();
        driver.findElement(ilceSec).click();
        driver.findElement(mahalle).click();
        driver.findElement(mahalleSec).click();
        driver.findElement(kaydetButonu).click();
    }
    public void selectKategory(){
        driver.findElement(kategoriButonu).click();
    }
    public String getRegistrationInfo(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElement(kayıtBilgisi).getText();
    }
    public String getLocation(){
        return driver.findElement(location).getText();
    }
    public void clickSuperPrice(){
        //Burada iki kere tıklamanın sebebi ilk tıklamada alert ekranını kaldırmak.
        driver.findElement(superTeklif).click();
        //İkinci tıklama asıl tıklama işlemini yapıyor.
        driver.findElement(superTeklif).click();
    }
    public void pressLikesButton(){
        driver.findElement(begenilerimButonu).click();
    }
}
