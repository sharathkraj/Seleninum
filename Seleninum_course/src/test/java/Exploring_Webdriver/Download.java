package Exploring_Webdriver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		download.click();
		
		File filelocation = new File("D:\\down");
		File[] totalFiles = filelocation.listFiles();
		
		for (File file : totalFiles) {
			if(file.getName().equals("TestLeafLogo.png")) {
				System.out.println("download sucessfully");
			     break;
			}
		}
	}

}
