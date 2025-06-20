package Tests;

import Base.BaseTest;
import Page.HomePage;
import Page.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickLogin();
        Thread.sleep(2000);

        LoginPage login = new LoginPage(driver);
        login.enterUsername("invalidUser");
        login.enterPassword("wrongPass");
        login.clickLoginButton();
        Thread.sleep(3000);

        // Handle alert and verify text
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("⚠️ Alert appeared: " + alertText);
            alert.accept();

            // Validate the error alert content
            Assert.assertTrue(alertText.contains("Wrong") || alertText.contains("user"),
                    "Expected login failure alert to appear");
            System.out.println("InvalidLoginTest Passed: Alert handled correctly");

        } catch (NoAlertPresentException e) {
            Assert.fail("Expected alert for invalid login but none appeared");
        }
    }
}
