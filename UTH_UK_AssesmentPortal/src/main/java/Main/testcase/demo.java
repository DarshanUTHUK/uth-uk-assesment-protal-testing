package Main.testcase;
import Com.utils.excelExportAndFileIO.Exceltable;
import Reuseable.testcase.Uth_uk_assesment;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class demo {
    static WebDriver driver;
    @DataProvider()
    public Object[][] dataRegister(){
        Exceltable Data = new Exceltable();
        Data.readExceltable("C:\\Users\\adars\\Excel", "TestData.xlsx", "Module_1", "TestScript_1");
        return Data.ExcelData();
    }
public static void main(String[] args) throws IOException {

 Uth_uk_assesment myRegister = new Uth_uk_assesment();
//    Exceltable Data = new Exceltable();
//    String[][] data = (String[][]) Data.readExceltable("C:\\Users\\adars\\Excel", "TestData.xlsx", "Module_1", "TestScript_1");
//
//    System.out.println(data);
    myRegister.uthuk_Assesment_Register("darshan@uth-uk.com","Darshan","Darshanmj@21");
    }
}
