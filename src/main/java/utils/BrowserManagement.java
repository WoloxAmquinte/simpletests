package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Class in charge of the initialization and configuration of the webdriver
 */
public class BrowserManagement {

    private static WebDriver driver;
   // private static Dotenv dotenv = Dotenv.load();

    private BrowserManagement() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = initializeDriver();
        }
        return driver;
    }

    /**
     * Method that determines through the BROWSER environment variable the browser to use and its configuration
     * @return
     */
    public static WebDriver initializeDriver() {
//        switch (dotenv.get("BROWSER")) {
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            case "edge":
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//                break;
//            case "opera":
//                WebDriverManager.operadriver().setup();
//                driver = new OperaDriver();
//                break;
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--start-maximized");
//                chromeOptions.addArguments("--incognito");
//                desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//                driver = new ChromeDriver(chromeOptions);
//                break;
//            default:
//                break;
//        }
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }
}
