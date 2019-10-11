import application.base.page.Utils;
import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ApprovalPage;
import page.objects.HomePage;

import java.io.*;

public class ApprovalPageTest extends BrowserDriver {

    private HomePage homePage;
    private ApprovalPage approvalPage;
    @BeforeMethod
    public void initElements(){
      homePage = PageFactory.initElements(driver, HomePage.class);
      approvalPage = PageFactory.initElements(driver, ApprovalPage.class);
    }

    @Test
    public void testCheckRate() throws IOException, InterruptedException {

        String firstName = "John";

        homePage.setHompeConfiguration("2000", 1);
        approvalPage.setFirstName(firstName);
        approvalPage.setLastName("Endrow");
        approvalPage.setHomeAddress("1111 Polaris Pkwy " );
        approvalPage.setCity("Columbus");
        approvalPage.setState("OH");
        approvalPage.setZipCode("43240");
        approvalPage.setDateOfBirth("12/16/1971");
        approvalPage.setAnnualIncome(" 150000");
        approvalPage.setAdditionalIncome("10000");

        String email = "none@none.com";
        String password = "!234Sama";
        approvalPage.emailAddress((email));
        approvalPage.setPassWord(password);
        approvalPage.termsofUse();
        approvalPage.submit();
        approvalPage.clickOnMenu();
        approvalPage.clickOnDocument();


//        String str = "Loan Amount; Monthly Payment; 36 Month Term; 11.40% Interest Rate; APR";
//        BufferedWriter writer = new BufferedWriter(new FileWriter("data/"+firstName.toLowerCase()+".txt", true));
//        writer.append(str);
//        writer.close();

    }

    @Test(enabled = false)
    public void checkOfferData() throws IOException {
        String b = Utils.readFile("data/text.txt");
        String[] inputData = b.split(";");
        System.out.println(inputData[0]);
        System.out.println(inputData[1]);


    }

}

