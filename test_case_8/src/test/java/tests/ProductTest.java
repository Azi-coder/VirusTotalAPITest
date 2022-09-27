package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductTest extends BaseTest{
    @Test
    public void testTrials() throws InterruptedException {
        assertEquals(homePage.getText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        homePage.clickProductButton();
        assertEquals(productsPage.getProductText(),"ALL PRODUCTS","Product page error");
        Thread.sleep(3000);
        productsPage.clickViewProductButton();
        assertEquals(productDetailPage.getName(),"Blue Top","Product name error");
        assertEquals(productDetailPage.getCategory(),"Category: Women > Tops","Product category error");
        Thread.sleep(3000);
        assertEquals(productDetailPage.getPriceText(),"Rs. 500","Product price error");
        assertEquals(productDetailPage.getAvailibilityText(),"Availability:","Product availibility error");
        assertEquals(productDetailPage.getCondition(),"Condition: New","Product condition error");
        assertEquals(productDetailPage.getbrandText(),"Brand: Polo","Product brand error");
    }
}
