package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainAppiumTest {

    AppiumDriver driver;
    AndroidTouchAction action;
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
    private By sporKategorisiButonu = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.ImageView");
    private By location = By.id("com.pozitron.hepsiburada:id/textViewLocation");
    private By superTeklif = By.id("com.pozitron.hepsiburada:id/textView_show_all");
    private By urun = By.xpath("(//android.widget.ImageView[@content-desc=\"ürün fotoğrafı\"])[1]");
    private By photoToSwipe = By.id("com.pozitron.hepsiburada:id/productImage");
    private By geriButonu = By.id("com.pozitron.hepsiburada:id/leftIcon");
    private By favoriButonu = By.id("com.pozitron.hepsiburada:id/product_detail_favourites_new");
    private By userName = By.className("android.widget.EditText");
    private By girisYapButonu = By.className("android.widget.Button");
    private By password = By.className("android.widget.EditText");
    private By loginMessage = By.id("android:id/message");
    private By acceptLoginMessage = By.id("android:id/button1");
    private By begenilerimButonu = By.id("com.pozitron.hepsiburada:id/nav_graph_my_list");
    private By closeAlert = By.linkText("Kapat");
    private By listItem = By.xpath("//android.view.View[@content-desc=\"Beğendiklerim Gizli liste Ürün ekle\"]/android.widget.TextView[3]");
    private By productName = By.xpath("//android.view.View[@content-desc=\"Xiaomi Redmi Note 11 128 GB 6 GB Ram (Xiaomi Türkiye Garantili)\"]/android.widget.TextView");

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", "/Users/vngrs/Documents/IntelliJProjects/firstAppiumTest/apps/hepsiburada-5-5-9.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);

    }

    @Test
    public void test_Part1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if (driver != null) {
            driver.findElement(noAccept).click();
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
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Assert.assertEquals(driver.findElement(kayıtBilgisi).getText(), "Konumunuz kaydedildi.", "Kayıt pop-up hatası");
            driver.findElement(kategoriButonu).click();
            driver.findElement(sporKategorisiButonu).click();
            Assert.assertEquals(driver.findElement(location).getText(), "Akhürrem (Akkonak Köyü) Mh.", "Location görüntülenmedi");


        }
    }

    @Test
    public void test_Part2() throws InterruptedException {

        //bütün test boyunca düzensiz bekleme işlemleri görülüyor.Bunun sebebi uygulama çalışırken uygulama performansına ayak uydurmaktır.
        action = new AndroidTouchAction(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(noAccept).click();

        //iki kere superTeklif locator'ına tıklama sebebi çıkan alert'i ilk tıklamada devre dışı bırakmaktır.
        driver.findElement(superTeklif).click();
        driver.findElement(superTeklif).click();
        driver.findElement(urun).click();

        //burada favoriButonu tıklaması yine alert ekranının devre dışı bırakılmasıdır.(Yani aslında alert dışında herhangi bir yere tıklamak yeterli bunun için)
        driver.findElement(favoriButonu).click();

        AndroidElement photo1 = (AndroidElement) driver.findElements(photoToSwipe).get(0);
        action.press(ElementOption.element(photo1)).waitAction().moveTo(PointOption.point(20, 100)).release().perform();

        driver.findElement(favoriButonu).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(userName).sendKeys("azmarslnts@hotmail.com");
        driver.findElement(girisYapButonu).click();

        //bu şekilde bekleme yapmanın nedeni userName ve password locator'larının aynı olması
        Thread.sleep(4000);

        driver.findElement(password).sendKeys("azim=741");

        driver.findElement(girisYapButonu).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(loginMessage).getText(), "Hoş geldin Azim Arslantaş. Keyifli alışverişler dileriz.", "Login message error");
        driver.findElement(acceptLoginMessage).click();
        driver.findElement(geriButonu).click();
        driver.findElement(begenilerimButonu).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(listItem).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(productName).getText(), "Xiaomi Redmi Note 11 128 GB 6 GB Ram (Xiaomi Türkiye Garantili)", "Beğeni listesine ürün ekleme hatası");
    }


    @AfterTest
    public void quit() {
        if(driver!=null)
            driver.quit();
    }
}
