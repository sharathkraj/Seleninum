package Exploring_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		// edit box
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Sharath");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("kumar");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("chennai");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("test@test.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("1234567890");
		
		//radio buttons
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
		
		
		// check box
		
		driver.findElement(By.id("checkbox3")).click();
		
		
		// drop_down
		
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByIndex(4);
		
		Thread.sleep(3000);
		
		Select country = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")));
		country.selectByIndex(4);
		
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByIndex(4);
		
		Select month = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		month.selectByIndex(4);
		
		Select date = new Select(driver.findElement(By.id("daybox")));
		date.selectByIndex(4);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Sharath@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Sharath@123");
		
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
