package testcases;



import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class CartTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        initializeBrowser();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyAddToCart() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        
        homePage.addItemToCart();
        Assert.assertEquals(homePage.getCartItemCount(), "1", "Item not added to cart!");
    }

    @AfterMethod
    public void teardown() {
        closeBrowser();
    }
}
