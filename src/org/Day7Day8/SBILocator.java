package org.Day7Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SBILocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      WebDriverWait w = new WebDriverWait(driver, 30);
	      driver.get("https://retail.onlinesbi.com/retail/login.htm");
	      //driver.manage().window().maximize();
          WebElement findElement = driver.findElement(By.xpath("//a[@class='login_button'][1]"));
	      findElement.click();
	      WebElement findElement2 = driver.findElement(By.xpath("//input[@id='Button2']"));
	      findElement2.click();
	      Alert a = driver.switchTo().alert();
	      a.accept();
	      
	}

}
