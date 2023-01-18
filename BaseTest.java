package testovi;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String expectedText = "PRODUCTS";
    String lockedOutUser = "locked_out_user";
    String errorText = "Epic sadface: Sorry, this user has been locked out.";
    String emptyUsername = "";
    String emptyUsernameError = "Epic sadface: Username is required";
    String badUsername = "test";
    String badUsernamePasswordError = "Epic sadface: Username and password do not match any user in this service";
    String firstName = "Dalibor";
    String lastName = "Nedeljkovic";
    String postalCode = "37000";

    public WebDriver driver;

    @Before
    public void setup (){
        System.setProperty("webdriver.chromedriver", "C:\\Users\\38169\\Desktop\\ZavrsniTest\\ZavrsniTest\\lib\\hromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @After
    public void teardown(){
        driver.quit();
        }
}