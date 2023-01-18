package stranice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class YourCartPage extends BasePage{

    public YourCartPage(WebDriver driver){
        super(driver);
    }

    By checkOutButtonBy = By.id("checkout");

    public YourCartPage clickOnCheckoutButton() {
        click(checkOutButtonBy);
        return this;
    }
}
