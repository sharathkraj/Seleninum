package testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_report {
	
	long startTime;
	WebDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter htmlReport;
	ExtentTest testcase;
	

	@Test
	public void openGoogle() throws IOException  {
	
	driver.get("https://www.google.co.in/");
	testcase = extentReport.createTest("Verify the open google");
	String title = driver.getTitle();
	
	if(title.equals("Google")) {
		System.out.println("Passed");
	}else {
		System.out.println("Failed google");
	}
	
}
	@Test
	public void openBing() throws IOException  {
				
		driver.get("https://www.bing.com/");
		testcase = extentReport.createTest("Verify the open bing");
		String title = driver.getTitle();
		
		if(title.equals("bing")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed bing");
		}
			
	}
	@Test
	public void openYahoo() throws IOException {
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		testcase = extentReport.createTest("Verify the open yahoo");
		
		String title = driver.getTitle();
		if(title.equals("yahoo")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed yahoo");
		}
		
	}
	
	@BeforeSuite
	public void openBrowser() {
		
		extentReport = new ExtentReports();
		htmlReport = new ExtentSparkReporter("htmlReport.html");
//		htmlReport = new ExtentHtmlReporter("");
		extentReport.attachReporter(htmlReport);
		
		startTime = System.currentTimeMillis();
		System.out.println("Start time taken"+startTime);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	@AfterSuite
	public void closeBrowse() {
		
       long endTime = System.currentTimeMillis();
	   long totalTime = endTime-startTime;
	   
	   System.out.println("Total time taken"+ totalTime);
		driver.quit();
		
	}
	
	
}

