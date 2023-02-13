package Exploring_Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyActions {

	public static void main(String[] args) throws AWTException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
		WebElement sign_in = driver.findElement(By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a"));
	    sign_in.click();
		
			
		WebElement e_mail = driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input"));
		e_mail.sendKeys("test12344565657@test.com");
		
	    Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")).sendKeys("test#1234");
		driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")).click();
			   


}
}
