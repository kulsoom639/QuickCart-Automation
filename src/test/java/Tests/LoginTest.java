package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Page.HomePage;
import Page.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() throws InterruptedException {
        // Step 1: Open Home Page
    	  test = extent.createTest("Valid Login Test");
        HomePage home = new HomePage(driver);
        home.clickLogin();  // Click "Log in" on navbar
        Thread.sleep(2000); // Wait for login modal to appear

        // Step 2: Perform Login
        test = extent.createTest("Login Test");
        

        LoginPage login = new LoginPage(driver);
        login.enterUsername("testuser");     // Replace with valid username
        login.enterPassword("testpass");     // Replace with valid password
        login.clickLoginButton();
        
        test.pass("Login test passed");
        test.fail("Login failed due to wrong credentials");

        
        Thread.sleep(3000); // Wait for login to complete

        // Step 3: Assertion (optional for now)
        System.out.println("Login test completed.");
    }
}
