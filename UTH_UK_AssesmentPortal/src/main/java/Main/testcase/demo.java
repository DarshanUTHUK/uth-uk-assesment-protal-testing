package Main.testcase;
import Com.Base.resources.base;
import Com.utils.excelExportAndFileIO.Exceltable;
import Reuseable.testcase.Uth_uk_assesment;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;

public class demo extends BaseTestNG {
     WebDriver driver;
    @DataProvider(name="TestScript_1")
    public Object[][] dataRegister(){
        Exceltable Data = new Exceltable();
        Data.readExceltable("src/main/resources/", "TestData.xlsx", "Module_1", "TestScript_1");
        return Data.ExcelData();
    }
@Test(dataProvider = "TestScript_1" ,suiteName = "Register")
public void test(String Email,String Username,String Password,String Execute) throws IOException {
 Uth_uk_assesment myRegister = new Uth_uk_assesment();
//    Reporter.log(driver.getTitle(),true);
    myRegister.uthuk_Assesment_Register(Email,Username,Password);

    }
}
