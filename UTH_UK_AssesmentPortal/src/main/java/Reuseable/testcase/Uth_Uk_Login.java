package Reuseable.testcase;
import Com.Base.resources.base;
import org.openqa.selenium.WebDriver;
import uth_uk_assesment.page.Username_Page;
import uth_uk_assesment.page.password_page;

import java.io.IOException;

public class Uth_Uk_Login extends base {
    WebDriver driver;

    Username_Page username;
    password_page password;

    public WebDriver uthuk_Assesment_Username(String user) throws IOException {
        driver = initializeDriver();
        openurlandverifyPage();
        username = new Username_Page(driver);
        username.Login_Username.sendKeys(user);
        username.Lets_Go_Btn.click();
        return driver;
    }

    public WebDriver uthuk_Assesment_Password(String Password) throws IOException {
        driver = initializeDriver();
        openurlandverifyPage();
        password = new password_page(driver);
        password.Login_password.sendKeys(Password);
        password.Sign_In_Btn.click();
        return driver;
    }
    }
