package dataProvide;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	String[][] data = null;
	
	
	

	public String[][] gettothedatafromExcel() throws BiffException, IOException {
		
		FileInputStream excel = new FileInputStream("D:\\excel.xls");  // excel sheet path
		Workbook workbook = Workbook.getWorkbook(excel);  // get workbook
		Sheet sheet = workbook.getSheet(0);  // get sheet
		int rowCount=sheet.getRows();  // rows
		int columnCount=sheet.getColumns();  //column
		
		String testdata[][] = new String[rowCount-1][columnCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0;j<columnCount;j++) {
				
				testdata[i-1][j] = sheet.getCell(j,i) .getContents();
			}
		}
		
		return testdata;
		
	}
	
	

@DataProvider(name = "logindata")
public String[][] logindataprovider() throws BiffException, IOException {
	
	data = gettothedatafromExcel();
    return data;
}

@Test(dataProvider ="logindata" )
@Parameters({"username","password"})

public void test1(String username , String passWord) {

WebDriver driver = new ChromeDriver();
 
driver.get("https://www.mycontactform.com/");


WebElement userName = driver.findElement(By.name("user"));
userName.sendKeys(username);

WebElement password = driver.findElement(By.name("pass"));
password.sendKeys(passWord);

WebElement submit = driver.findElement(By.name("btnSubmit"));
submit.click();
     
WebElement Logout = driver.findElement(By.linkText("Logout"));
Logout.click();

}


}
