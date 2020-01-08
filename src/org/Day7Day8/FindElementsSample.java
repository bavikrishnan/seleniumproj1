package org.Day7Day8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementsSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      WebDriverWait w = new WebDriverWait(driver, 30);
	      driver.get("http://www.greenstechnologys.com/");
	      List<WebElement> coursesList = driver.findElements(By.xpath("//ul[@class='dropdown']"));
	      Iterator i = coursesList.iterator();
	      while(i.hasNext())
	      {
	       ((WebElement) i.next()).click();
	       driver.navigate().back();  
	}
	}
}
