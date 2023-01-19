package testovi;

import org.junit.Test;

import stranice.CompleteCheckOutPage;
import stranice.HomePage;
import stranice.LoginPage;
import stranice.OverViewPage;
import stranice.YourCartPage;
import stranice.YourInformationPage;

public class SuccesfulPurchaseTest extends BaseTest {

    @Test
public void verifySucessfulPurchase (){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    YourCartPage yourCartPage = new YourCartPage(driver);
    YourInformationPage checkOutPage = new YourInformationPage(driver);
    OverViewPage overViewPage = new OverViewPage(driver);
    CompleteCheckOutPage completeCheckOutPage = new CompleteCheckOutPage(driver);


    loginPage.basePage();
    loginPage.login(standardUsername, password);
    homePage.verifySuccesfulLogin(expectedText);
    homePage.verifyProductAddedToCart();
    homePage.navigateToYourCart();
    yourCartPage.clickOnCheckoutButton();
    checkOutPage.writeInfo(firstName, lastName, postalCode);
    checkOutPage.continueToOverview();
    overViewPage.checkTotalPrice();
    overViewPage.finish();
    completeCheckOutPage.verifySuccesfulPurchase("THANK YOU FOR YOUR ORDER");

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

}
    
}
