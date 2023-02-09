package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_Suite {
	
	long startTime;
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		startTime = System.currentTimeMillis();
		
		
		System.out.println("Start time taken"+ startTime);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void openGoogle() {
	
	driver.get("https://www.google.co.in/");
	
}
	@Test
	public void openBing() {
				
		driver.get("https://www.bing.com/");
			
	}
	@Test
	public void openYahoo() {
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
	}
	
	@AfterSuite
	public void closeBrowse() {
		
       long endTime = System.currentTimeMillis();
	   long totalTime = endTime-startTime;
	   
	   System.out.println("Total time taken"+ totalTime);
		driver.quit();
		
	}
	
	
}

