package Exploring_Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node010r3tni8w2wr110ld7omgpzyar91783.node0");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
		alert.accept();
		
		
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]")).click();
		
		Alert confirm_dialog = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
		confirm_dialog.accept();
		
		

	}

}
