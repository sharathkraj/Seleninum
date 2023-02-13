package Logincases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_credentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.mycontactform.com/");
	        
	        driver.findElement(By.name("user")).sendKeys("prabhu1234");
	        driver.findElement(By.name("pass")).sendKeys("1234556");
	        driver.findElement(By.name("btnSubmit")).click();
	            
	        
	        driver.findElement(By.linkText("Logout"));

	}

}
