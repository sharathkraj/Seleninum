package Exploring_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
        
		driver.switchTo().frame(0);
		WebElement ClickMe = driver.findElement(By.xpath("/html/body/button"));
		ClickMe.click();
		
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		ClickMe1.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		
		int size= totalFrames.size();
		

	}

}
