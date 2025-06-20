package Tests;

import Base.BaseTest;
import Page.HomePage;
import Page.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyAddToCartFunctionality() throws InterruptedException {
        // Step 1: Go to category and select product
        HomePage home = new HomePage(driver);
        Thread.sleep(2000);
        home.selectLaptopsCategory();
        Thread.sleep(2000);
        home.clickSonyVaio();
        Thread.sleep(2000);

        // Step 2: Add product to cart
        CartPage cart = new CartPage(driver);
        cart.clickAddToCart();
        Thread.sleep(2000);

        // Step 3: Handle alert
        driver.switchTo().alert().accept();

        // Step 4: Navigate to cart and verify product
        cart.clickCartLink();
        Thread.sleep(3000);

        Assert.assertTrue(cart.isSonyVaioPresentInCart(), "Sony vaio i5 should be visible in the cart");
        System.out.println(" CartTest Passed: Product successfully added to cart");
    }
}
