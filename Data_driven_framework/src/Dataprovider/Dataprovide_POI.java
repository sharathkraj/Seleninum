package Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dataprovide_POI {

	List<String> userNameList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();
	
	
	public void readExcel() throws IOException {
		
		FileInputStream excel = new FileInputStream("D:\\excel.xls");  // excel sheet path
		
		Workbook workbook = new XSSFWorkbook(excel);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowItreator=sheet.iterator();
		
		while(rowItreator.hasNext()) {
			Row rowValue = rowItreator.next();
			
			Iterator<Cell> columnIterator=rowValue.iterator();
			int i=2;
			while(columnIterator.hasNext()) {
				if(i%2 == 0) {
					userNameList.add(columnIterator.next().getStringCellValue());
				}else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}
				i++;
				
			}
		}
		
	}
	
	public void login(String username , String passWord) {
		WebDriver  driver = new ChromeDriver();
		
		
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

	 //public void executeTest() {
		// for(int i=0; i<userNameList.size();i++) {
			// login(userNameList.get(i),passwordList.get(i));
		 //}
//	 }
	public static void main(String[] args) throws IOException {
		
		Dataprovide_POI usingPOI = new Dataprovide_POI();
		usingPOI.readExcel();
		}

}
