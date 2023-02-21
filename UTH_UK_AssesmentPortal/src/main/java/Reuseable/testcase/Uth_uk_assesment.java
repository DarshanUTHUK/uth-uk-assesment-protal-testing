package Reuseable.testcase;



import Com.Base.resources.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import uth_uk_assesment.page.RegisterPage;
 import Com.Base.resources.base.*;

import java.io.IOException;

public class Uth_uk_assesment extends base {
WebDriver driver;

 RegisterPage Register;

    public WebDriver uthuk_Assesment_Register(String Email,String Username,String Password) throws IOException {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("http://localhost:3000/");
        driver=initializeDriver();
        openurlandverifyPage();
        Register = new RegisterPage(driver);
        Register.Regsiter_Now.click();
        Register.Email.sendKeys(Email);
        Register.Username.sendKeys(Username);
        Register.Password.sendKeys(Password);
        Register.Regsiterbtn.click();
        return driver;
    }


}



