package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest1 extends BaseAppiumTest {
    AppiumDriver driver;

    @Test
    public void test_Part1() {
        homePage.rejectAlert();
        homePage.selectLocation();
        Assert.assertEquals(homePage.getRegistrationInfo(), "Konumunuz kaydedildi.", "Kayıt pop-up hatası");
        homePage.selectKategory();
        categoriesPage.selectSportCategory();
        Assert.assertEquals(homePage.getLocation(), sportCategoryPage.getLocation(), "Location görüntülenmedi");
    }
}
