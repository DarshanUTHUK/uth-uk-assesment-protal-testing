package Main.testcase;

import Com.Base.resources.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class BaseTestNG extends base {
    WebDriver driver;

    @BeforeClass
    public WebDriver LunchBrowserAndNavigateToUrlSetup() throws IOException {
        driver = initializeDriver();
        openurlandverifyPage();
        return driver;
    }

    @AfterMethod
    public void FailureSetup(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);
        if (result.getStatus()==2) {
            Reporter.log("This is failed log from reporter.log" , true);

        }
        }
    }
