package org.Day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      Robot r = new Robot();
	      Actions a = new Actions(driver);
	      WebElement txtlogin = driver.findElement(By.xpath("//input[@id ='email']"));
	      txtlogin.sendKeys("erbavi18gmailcom");
	      Thread.sleep(2000);
	      a.doubleClick(txtlogin).perform();
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_X);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_X); 
	      WebElement txtPass = driver.findElement(By.xpath("//input[@id ='pass']"));
	      txtPass.sendKeys("");
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V); 
	      
	}

}
