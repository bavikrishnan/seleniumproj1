package org.Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      WebElement txtlogin = driver.findElement(By.xpath("//input[@name ='q']"));
	      String valuep = "greens velmurugan";
	      txtlogin.sendKeys(valuep);
	      Robot r = new Robot();
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_LEFT);

	  }

}
