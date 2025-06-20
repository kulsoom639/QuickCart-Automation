package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Needed for @FindBy
    }

    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cartLink;

    @FindBy(xpath = "//td[contains(text(),'Sony vaio i5')]")
    WebElement sonyVaioInCart;

    // Actions
    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickCartLink() {
        cartLink.click();
    }

    public boolean isSonyVaioPresentInCart() {
        return sonyVaioInCart.isDisplayed();
    }
}
