package application.base.page;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;

public class ApplicationBasePage extends BrowserDriver {

    public static void sendKeys(String webElementName, String Keys, WebElement webElement){
        webElement.sendKeys(); }

    public static void click(String webElementName, WebElement webElement){
        webElement.click();
    }


    public static void select(String webElementName, WebElement webElement){ webElement.isSelected();}


}
