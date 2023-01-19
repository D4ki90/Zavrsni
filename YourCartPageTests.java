package testovi;

import org.junit.Test;


import stranice.YourInformationPage;
import stranice.HomePage;
import stranice.LoginPage;
import stranice.OverViewPage;
import stranice.YourCartPage;



public class YourCartPageTests extends BaseTest {
  
    
@Test
public void verifyTotalPrice(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    YourCartPage yourCartPage = new YourCartPage(driver);
    YourInformationPage checkOutPage = new YourInformationPage(driver);
    OverViewPage overViewPage = new OverViewPage(driver);
    

    loginPage.basePage();
    loginPage.login(standardUsername, password);
    homePage.verifySuccesfulLogin(expectedText);
    homePage.verifyProductAddedToCart();
    homePage.navigateToYourCart();
    yourCartPage.clickOnCheckoutButton();
    checkOutPage.writeInfo(firstName, lastName, postalCode);
    checkOutPage.continueToOverview();
    overViewPage.checkTotalPrice();


    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

}
}
