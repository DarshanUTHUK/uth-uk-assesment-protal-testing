package Com.Base.resources;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class base {
    public WebDriver driver;
    public Properties property;
    public String url;

    
    public WebDriver initializeDriver() throws IOException {


        property = new Properties();
        FileInputStream file = new FileInputStream("src/main/java/Com/Config/Config.properties");

        property.load(file);

        String BrowserName = property.getProperty("browser");
        url = property.getProperty("url");

        if(BrowserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        else if(BrowserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(BrowserName.equals("IE"))
        {
            //Executes IE
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    public WebDriver openurlandverifyPage() throws IOException {
        url = property.getProperty("url");
        driver.get(url);
//        String Expected = driver.findElement(By.cssSelector("p[class='login-box-msg']")).getText();
//        String Actual = "Sign in to start your session";
//        Assert.assertEquals(Actual, Expected);
        System.out.println("Homepage is displayed");
        return driver;
    }
}