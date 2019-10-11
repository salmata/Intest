package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(name = "desiredAmount")
    private WebElement loanamount;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div[2]/div/select")
    private WebElement dropdown;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div/div/div/div[2]/div[2]/form/div/div/div[3]/button")
    private WebElement checkyourRate;

    public void giveloanamount(){
        loanamount.sendKeys("2000");
    }

   public void checkrate (){
       checkyourRate.click();
   }

   public void selectDropdown(int index){
       Select selectoption = new Select(dropdown);
       selectoption.selectByIndex(index);
   }

   public void setHompeConfiguration(String amount, int selectOption){
       loanamount.sendKeys(amount);
       Select selectoption = new Select(dropdown);
       selectoption.selectByIndex(selectOption);
       checkyourRate.click();
   }

}
