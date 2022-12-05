package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest2 extends BaseAppiumTest{
    AppiumDriver driver;

    @Test
    public void test_Part2() throws InterruptedException {
        homePage.rejectAlert();
        homePage.clickSuperPrice();
        superPricePage.selectProduct();
        selectedProductPage.clickPhoto();
        selectedProductPage.scrollPhoto();
        selectedProductPage.likeProduct();
        loginPage.enterUsername();
        Thread.sleep(4000);
        loginPage.enterPassword();

        Assert.assertEquals(selectedProductPage.getLoginMessage(), "Hoş geldin Azim Arslantaş. Keyifli alışverişler dileriz.", "Login message error");
        selectedProductPage.acceptLoginMessage();
        selectedProductPage.turnBack();
        homePage.pressLikesButton();
        likesPage.clickListItem();
        Assert.assertEquals(likesPage.getLikedProductName(), "June Uzay Desenli Kapüşonlu Içi Polarlı Erkek Çocuk Mont", "Beğeni listesine ürün ekleme hatası");
    }
}
