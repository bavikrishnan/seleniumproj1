package org.Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleApps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      Thread.sleep(1000);
	      WebElement glink = driver.findElement(By.xpath("//a[@class='gb_D gb_oc']"));
	      glink.click();
	      WebElement gmail = driver.findElement(By.xpath("//a[@id='gb23']"));
	      Actions a = new Actions(driver);
	      a.moveToElement(gmail).perform();
	      gmail.click();
	      
	}

}
