package stranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage extends BasePage{

    public OverViewPage(WebDriver driver) {
        super(driver);
       
    }

By itemTotaBy = By.className("summary_subtotal_label");
By taxBy = By.className("summary_tax_label");
By totalPriceBy = By.className("summary_total_label");
By finishButtonBy = By.id("finish");

    public void checkTotalPrice(){

    double itemTotalPrice = Double.parseDouble(readText(itemTotaBy).substring(13));
    double taxPrice = Double.parseDouble(readText(taxBy).substring(6));
    double totalPrice = Double.parseDouble(readText(totalPriceBy).substring(8));
    double subTotalPrice = itemTotalPrice + taxPrice;
    assertDoubleEquals(totalPrice, subTotalPrice);

    }
public void finish(){
    click(finishButtonBy);
}


}



