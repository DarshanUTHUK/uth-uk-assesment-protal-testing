package uth_uk_assesment.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import org.openqa.selenium.WebElement;

public class Username_Page  {
    //Register page
    @FindBy(name="username")
    public WebElement Login_Username;

    @FindBy(id="Lets Go")
    public WebElement Lets_Go_Btn;

    @FindBy(id="Welcome to UtH")
    public WebElement Welcome_Text;

    @FindBy(id ="user profile pic ")
    public  WebElement Profile_image;

    @FindBy(id ="user name page explore")
    public  WebElement user_name_page_explore;


    public Username_Page(WebDriver driver) {
        super();//In case you want to pass the driver instance to super class
        PageFactory.initElements(driver,this);
    }
}
