package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.snapdeal.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(6000);
	      WebElement btnSignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	      btnSignIn.click();
	      WebElement btnRegister = driver.findElement(By.xpath("//span[text()='Register'][1]"));
	      btnRegister.click();
	      driver.switchTo().activeElement();
	      WebElement txtMob = driver.findElement(By.xpath("//input[@id='userName']"));
	      txtMob.sendKeys("87879411484");
	 }

}
