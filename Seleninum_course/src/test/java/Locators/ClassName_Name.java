package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.mycontactform.com/");
        
        driver.findElement(By.name("user")).sendKeys("prabhu123");
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.name("btnSubmit")).click();
            
        
        driver.findElement(By.linkText("Logout"));

	}

}
