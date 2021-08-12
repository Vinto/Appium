package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests {
    public static AppiumDriver driver;

    @BeforeTest
    public static void androidSetUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ToDo.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

//    @BeforeTest
//    public static void iOSSetUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "iOS");
//        capabilities.setCapability("automationName", "XCUITest");
//        capabilities.setCapability("platformVersion", "13.3");
//        capabilities.setCapability("deviceName", "iPhone 11 Pro Max");
//        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/DailyCheck.app");
//
//        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//    }

    @AfterTest
    public void tearDown() {
        if(null != driver) {
            driver.quit();
        }
    }
}
