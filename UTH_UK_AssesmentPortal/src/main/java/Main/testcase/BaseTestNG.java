package Main.testcase;

import Com.Base.resources.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTestNG extends base {
    WebDriver driver;
    @BeforeClass
    public void LunchBrowserAndNavigateToUrlSetup() throws IOException {
        driver = initializeDriver();
        openurlandverifyPage();
    }
    @AfterMethod
    public void FailureSetup() throws IOException {
        driver.quit();
    }
}
