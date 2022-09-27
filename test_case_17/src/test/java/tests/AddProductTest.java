package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddProductTest extends BaseTest {
    @Test
    public void productTests() throws InterruptedException {

        assertEquals(homePage.getText(), "Full-Fledged practice website for Automation Engineers", "Homepage is not opened properly");
        homePage.clickProductButton();
        Thread.sleep(1000);
        productsPage.showFirstItem();
        addToCartPage.add();
        Thread.sleep(1000);
        addToCartPage.continueShopping();
        addToCartPage.clickCartButton();
        assertEquals(cartPage.getCartText(), "Shopping Cart", "Shopping cart text error");
        cartPage.deleteItem();

    }
}
