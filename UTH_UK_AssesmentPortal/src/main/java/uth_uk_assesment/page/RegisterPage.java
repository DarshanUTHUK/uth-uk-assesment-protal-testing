package uth_uk_assesment.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import org.openqa.selenium.WebElement;

public class RegisterPage  {
    //Register page
    @FindBy(id="Register Now")
    public WebElement Regsiter_Now;

    @FindBy(name="email")
    public WebElement Email;

    @FindBy(name="username")
    public WebElement Username;

    @FindBy(name="password")
    public WebElement Password;

    @FindBy(id="Registerbtn")
    public WebElement Regsiterbtn;


    public RegisterPage(WebDriver driver) {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver,this);
    }
}
