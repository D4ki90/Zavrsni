package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage extends BasePage{

    public YourInformationPage(WebDriver driver) {
        super(driver);
        
    }
    
By firstNameFieldBy = By.id("first-name");
By lastNameFieldBy = By. id("last-name");
By postalCodeFieldBy = By.id("postal-code");
By continueButtonBy = By.id("continue");

public void writeInfo (String firstName, String lastName, String postalCode){

writeText(firstNameFieldBy, firstName);
writeText(lastNameFieldBy, lastName);
writeText(postalCodeFieldBy, postalCode);

}

public void continueToOverview(){
    click(continueButtonBy);
}


}
