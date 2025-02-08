package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators
    private By pageTitle = By.className("title");
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with elements
    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void addItemToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getCartItemCount() {
        return driver.findElement(cartBadge).getText();
    }
}
