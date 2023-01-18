package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteCheckOutPage extends BasePage{

    public CompleteCheckOutPage(WebDriver driver) {
        super(driver);
        
    }


By completeMessageBy = By.className("complete-header");


public void verifySuccesfullPurchase(String expectedText){
    assertTextEquals(expectedText, readText(completeMessageBy));

}

}
