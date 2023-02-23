package uth_uk_assesment.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class password_page {
    @FindBy(id="Hello userName")
    public WebElement hello_username;

    @FindBy(id ="user name page explore")
    public  WebElement user_name_page_explore;

    @FindBy(id ="user profile pic ")
    public  WebElement Profile_image;

    @FindBy(name="password")
    public WebElement Login_password;

    @FindBy(id="Sign In")
    public WebElement Sign_In_Btn;

    @FindBy(id="Forgot Password")
    public WebElement forgot_password_txt;

    @FindBy(id="Recover Now")
    public WebElement recover_now_Btn;

    public password_page(WebDriver driver) {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver,this);
    }


}
