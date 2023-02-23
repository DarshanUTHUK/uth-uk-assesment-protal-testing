package Reuseable.testcase;

import Com.Base.resources.base;
import org.openqa.selenium.WebDriver;
import uth_uk_assesment.page.RegisterPage;


import java.io.IOException;

public class Uth_uk_Register extends base{
WebDriver driver;

 RegisterPage Register;

    public WebDriver uthuk_Assesment_Register(String Email,String Username,String Password) throws IOException {
        driver = initializeDriver();
        openurlandverifyPage();
        Register = new RegisterPage(driver);
        Register.Regsiter_Now.click();
        Register.Email.sendKeys(Email);
        Register.Username.sendKeys(Username);
        Register.Password.sendKeys(Password);
        Register.Regsiterbtn.click();
//        driver.close();
        return driver;
    }


}



