package Main.testcase;
import Com.utils.excelExportAndFileIO.Exceltable;
import Reuseable.testcase.Uth_Uk_Login;
import Reuseable.testcase.Uth_uk_Register;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class Testcase extends BaseTestNG {
     WebDriver driver;
    @DataProvider(name="TestScript_1")
    public Object[][] dataRegister(){
        Exceltable Data = new Exceltable();
        Data.readExceltable("src/main/resources/", "TestData.xlsx", "Module_1", "TestScript_1");
        return Data.ExcelData();
    }
@Test(dataProvider = "TestScript_1" ,suiteName = "Register" ,priority = 1)
public void Register_Test(String Email,String Username,String Password,String Execute) throws IOException {
 Uth_uk_Register myRegister = new Uth_uk_Register();
//    Reporter.log(driver.getTitle(),true);
    myRegister.uthuk_Assesment_Register(Email,Username,Password);

    }
    @DataProvider(name="TestScript_2")
    public Object[][] dataLogin(){
        Exceltable Data = new Exceltable();
        Data.readExceltable("src/main/resources/", "TestData.xlsx", "Module_1", "TestScript_2");
        return Data.ExcelData();
    }
    @Test(dataProvider = "TestScript_2" ,suiteName = "Login",priority = 2)
    public void Login_Test(String Username,String Password,String Execute) throws IOException {
        Uth_Uk_Login myLogin = new Uth_Uk_Login();
       myLogin.uthuk_Assesment_Username(Username);
       myLogin.uthuk_Assesment_Password(Password);
    }
}
