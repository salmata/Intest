import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ApprovalPage;
import page.objects.HomePage;
import page.objects.PayOffOffer;

public class HomePageTest extends BrowserDriver {

    private HomePage homePage;
    private ApprovalPage approvalPage;
    private PayOffOffer payOffOffer;

    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        approvalPage = PageFactory.initElements(driver, ApprovalPage.class);
        payOffOffer = PageFactory.initElements(driver, PayOffOffer.class);
    }

    @Test
    public void testHomePageLoading (){
        homePage.giveloanamount();
        homePage.selectDropdown(2);
        homePage.checkrate();
        try {
            Thread.sleep(3000);
        }catch (Exception ex){

        }
    }
}
