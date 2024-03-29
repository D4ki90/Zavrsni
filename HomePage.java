package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super(driver);
    }

    By homePageTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2By = By.id("add-to-cart-sauce-labs-bike-light");
    By shoppingCartBadgeBy = By.className("shopping_cart_badge");
    By numberOfItemsBy = By.className("inventory_item");
    By hamburgerMenuBy = By.id("react-burger-menu-btn");
    String expectedLink = "https://saucelabs.com/";
    By logoutButtonBy = By.id("logout_sidebar_link");
 




    public HomePage verifySuccesfulLogin (String expectedText){
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage verifyProductAddedToCart() {
        click(addToCartButton1By);
        click(addToCartButton2By);
        waitVisability(shoppingCartBadgeBy);
        return this;
    }

    public HomePage numberOfProducts (int expectedNumberOfProducts){
        int actualNumberOfProduct = countItems(numberOfItemsBy);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProduct);
        return this;
    }

    public HomePage clickOnHumburgerMenu(){
        click(hamburgerMenuBy);
        return this;
    }

    public HomePage clickOnshoppingCartBadge() {
        click(shoppingCartBadgeBy);
        return this;
    }

    public HomePage clickOnLogoutButton(){
        click(logoutButtonBy);
        return this;
    }
}
    

