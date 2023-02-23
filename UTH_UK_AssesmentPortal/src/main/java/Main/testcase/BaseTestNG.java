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
import java.io.FileOutputStream;
import java.io.IOException;

public class BaseTestNG  {
    WebDriver driver;

    @BeforeClass
    public void LunchBrowserAndNavigateToUrlSetup() throws IOException {
        Reporter.log("lunchedbrowser" , true);
    }

    @AfterMethod
    public void FailureSetup(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);
//        String currentDir = System.getProperty("user.dir");
//        File img =new File(currentDir + "/screenshots/" + System.currentTimeMillis() + + ".png");
        if (result.getStatus()==2) {
            Reporter.log("This is failed log from reporter.log" , true);
//            FileOutputStream scrFiles = new FileOutputStream(img);
//            scrFiles.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
//            scrFiles.close();
//            Reporter.log("<a href ='".+>");
        }
        }
    }
