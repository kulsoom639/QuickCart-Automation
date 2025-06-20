package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.HomePage;

public class SearchTest extends BaseTest {

    @Test
    public void verifyLaptopsCategoryDisplaysProduct() throws InterruptedException {
        HomePage home = new HomePage(driver);
        
        Thread.sleep(2000); // Allow page to load
        home.selectLaptopsCategory(); // Click "Laptops"
        Thread.sleep(2000); // Wait for products to load

        boolean isProductVisible = home.isSonyVaioVisible(); // Check for product
        Assert.assertTrue(isProductVisible, "Sony vaio i5 should be visible under Laptops");

        System.out.println("SearchTest Passed: Product displayed under Laptops");
    }
}
