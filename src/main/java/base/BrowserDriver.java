package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.io.IOException;

public class BrowserDriver {
    public static WebDriver driver = null;

    public static String   os = System.getProperty("os", "windows");//mac

    //@Parameters({"url"})
    @Parameters({"useCloudEnv","cloudEnvName", /*"os",*/ "os_version", "browserName", "browserVersion", "url"})

    @BeforeMethod
    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,
            /*@Optional("windows") String os,*/ @Optional("10") String os_version, @Optional("firefox") String browserName, @Optional("34")
                              String browserVersion, @Optional("https://www.credify.tech/phone/nonDMFunnel") String url) throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(url);
        getLocalDriver(browserName, os);
        driver.get(url);

    }

    public WebDriver getLocalDriver(String browserName, String os) {


        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeOptions options =new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);

            if (os.equalsIgnoreCase("windows")) {
                System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver.exe");
                driver = new ChromeDriver(options);
            } else if (os.equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver");
                driver = new ChromeDriver(options);
            }
        }
        else if (browserName.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--private");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

        }

        return driver;
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}