package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver();
	        
	      driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com");
	        
	        driver.findElement(By.partialLinkText("Sign up")).click();
	        driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[1]/input")).sendKeys("sharathkraj5553244");
	        driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input")).sendKeys("test9345435@test.com");
	        driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")).sendKeys("Sharath@1234");   
	        driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")).click();

	}

}
