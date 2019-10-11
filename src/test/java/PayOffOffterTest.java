import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import page.objects.ApprovalPage;
import page.objects.HomePage;
import page.objects.PayOffOffer;

public class PayOffOffterTest extends BrowserDriver {

    private HomePage homePage;
    private ApprovalPage approvalPage;
    private PayOffOffer payOffOffer;

    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        approvalPage = PageFactory.initElements(driver, ApprovalPage.class);
        payOffOffer = PageFactory.initElements(driver, PayOffOffer.class);
    }



}
