 package Logincases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Valid_username {

	@Test
	@Parameters({"username","password"})
	
	public void test2(String username , String passWord) {
		
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
