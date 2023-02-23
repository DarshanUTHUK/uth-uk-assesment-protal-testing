package Main.testcase;

import Com.Base.resources.ScreenshotforReport;
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

public class BaseTestNG extends base {
//    WebDriver driver;

    @BeforeClass
    public void LunchBrowserAndNavigateToUrlSetup() throws IOException {
        initializeDriver();
        Reporter.log("lunchedbrowser" , true);
    }

    @AfterMethod
    public void FailureSetup(ITestResult result) throws IOException {
        Reporter.setCurrentTestResult(result);

        if (result.getStatus()==2) {
            Reporter.log("This is failed log from reporter.log" , true);
            ScreenshotforReport Screenshot = new ScreenshotforReport();
            Screenshot.takeScreenshotAtEndOfTest(driver);
//            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String currentDir = System.getProperty("user.dir");
//            FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() +result.getMethod().getMethodName()+ ".png"));
//            Reporter.log("<a href ='"+scrFile.getAbsolutePath()+"'><img src='"+scrFile.getAbsolutePath()+"'height='200'width='200'/></a>");
        }
        }
    }
//            FileOutputStream scrFiles = new FileOutputStream(img);
//            scrFiles.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
//            scrFiles.close();

//        String currentDir = System.getProperty("user.dir");
//        File img =new File(currentDir + "/screenshots/" + System.currentTimeMillis() + result.getMethod().getMethodName()+ ".png");