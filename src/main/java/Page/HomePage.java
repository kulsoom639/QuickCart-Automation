package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(xpath = "//a[text()='Laptops']")
    WebElement laptopsCategory;

    @FindBy(xpath = "//a[text()='Sony vaio i5']")
    WebElement sonyVaioProduct;

    @FindBy(id = "cartur")
    WebElement cartLink;
    @FindBy(id = "logout2")
    WebElement logoutLink;


    
    public boolean isLoginVisibleAfterLogout() {
        return loginLink.isDisplayed();
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void selectLaptopsCategory() {
        laptopsCategory.click();
    }

    public void clickSonyVaio() {
        sonyVaioProduct.click();
    }

    public void goToCartPage() {
        cartLink.click();
    }

  
    public boolean isSonyVaioVisible() {
        return sonyVaioProduct.isDisplayed();
    }
    
    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
    }
}
