package page.objects;

import base.BrowserDriver;
import com.beust.jcommander.Parameters;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

import static javafx.scene.input.KeyCode.W;

public class ApprovalPage extends BrowserDriver {

    @FindBy(how = How.CSS, using = "[type='radio'][value='false']")
    public WebElement radio;

    @FindBy(how = How.CSS, using = "[type='radio'][value='true']")
    public WebElement getRadio;

    @FindBy(name = "borrowerFirstName")
    private WebElement firstName;

    @FindBy(name = "borrowerLastName")
    public WebElement lastName;

    @FindBy(name = "borrowerStreet")
    public WebElement homeAddress;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[1]/div/div/div/div/input")
    private WebElement city;

    @FindBy(name = "borrowerState")
    public WebElement state;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[3]/div/div/div/div/input")
    public WebElement zipCode;

    @FindBy(name = "borrowerDateOfBirth")
    public WebElement dateOfBirth;

    @FindBy(name = "borrowerIncome")
    public WebElement annualIncome;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[6]/div/div/div/input")
    public WebElement additionalIncome;

    @FindBy(name = "coBorrowerFirstName")
    public WebElement coFirstName;

    @FindBy(name = "coBorrowerLastName")
    public WebElement coLastName;

    @FindBy(name = "coBorrowerDateOfBirth")
    public WebElement codateOfBirth;

    @FindBy(name = "coBorrowerIncome")
    public WebElement coIncome;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/label/input")
    public WebElement checkBox;

    @FindBy(name = "coBorrowerStreet")
    public WebElement coAdress;

    @FindBy(name = "coBorrowerCity")
    public WebElement coCity;

    @FindBy(name = " coBorrowerState")
    public WebElement coState;

    @FindBy(name = "coBorrowerZipCode")
    public WebElement coZipCode;

    @FindBy(name = "username")
    public WebElement emailAddress;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[3]/div/label/div[1]")
    public WebElement termsofUse;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[4]/button")
    public WebElement submit;

    @FindBy(css = "#root > div > main > div > header > div > label")
    public WebElement menu1;
    @FindBy(xpath = "//body[@class='expansion-alids-init']/div[@id='root']/div[@class='layout__wrap']/main[@class='container-fluid layout__main layout-default']/div/header[@class='header header--collapsed']/div[@class='header-nav']/label[1]")
    public WebElement menu2;
    @FindBy(xpath = "//label[text()='Menu']")
    public WebElement menu;
    @FindBy(css = "#root > div > main > div > header > div > nav > ul > li:nth-child(1) > a")
    public WebElement document;

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress.sendKeys(homeAddress);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }

    public void setState(String state) {
        this.state.sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        this.zipCode.sendKeys(zipCode);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth.sendKeys(dateOfBirth);
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome.sendKeys(annualIncome);
    }

    public void setAdditionalIncome(String additionalIncome) {
        this.additionalIncome.sendKeys(additionalIncome);

    }

    public void setMenu() {
        this.menu.click();
    }

    public void setDocument() {
        this.document.click();
    }

    public void emailAddress(String emailAddress) throws ElementNotInteractableException {
        this.emailAddress.sendKeys(emailAddress);
        try {
            Thread.sleep(300);
            {

            }
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPassWord(String passWord) {
        this.passWord.sendKeys(passWord);
    }

    public void termsofUse() {
        this.termsofUse.isSelected();
        termsofUse.click();
    }

    public void submit() throws InterruptedException {
        this.submit.click();
        Thread.sleep(5000);

    }

    public void clickOnMenu() throws InterruptedException {
        setMenu();
        Thread.sleep(5000);
    }

    public void clickOnDocument() throws InterruptedException {
        setDocument();
        Thread.sleep(5000);
    }


}