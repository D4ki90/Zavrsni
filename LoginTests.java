package testovi;

import org.junit.Test;

import stranice.HomePage;
import stranice.LoginPage;

public class LoginTests extends BaseTest{
    
    public LoginPage loginPage;
  
    @Test
    public void verifySuccesfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifySuccesfulLogin(expectedText);

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


    @Test
    public void verifyUnsuccesfulLogin(){
    LoginPage loginPage = new LoginPage(driver);

    loginPage.basePage();
    loginPage.login(lockedOutUser, password);
    loginPage.verifyUnsuccesfulLogin(errorText);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    }

    @Test
    public void verifyUnsuccesfulLoginWithEmptyUsername(){
    LoginPage loginPage = new LoginPage(driver);

    loginPage.basePage();
    loginPage.login(emptyUsername, password);
    loginPage.verifyUnsuccesfulLogin(emptyUsernameError);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    }
    

    @Test
    public void verifyUnsuccesfulLoginWithBadUsername(){
    LoginPage loginPage = new LoginPage(driver);

    loginPage.basePage();
    loginPage.login(badUsername, password);
    loginPage.verifyUnsuccesfulLogin(badUsernamePasswordError);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    }

}
