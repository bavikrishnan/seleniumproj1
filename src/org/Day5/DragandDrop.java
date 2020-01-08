package org.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("http://demo.guru99.com/test/drag_drop.html");
	              Actions a = new Actions(driver);
			      WebElement btntype = driver.findElement(By.id("credit2"));
			      WebElement btntype1=driver.findElement(By.id("fourth"));
			      WebElement boxAccount = driver.findElement(By.id("bank"));
                  WebElement boxDAmount = driver.findElement(By.id("amt7"));
                  WebElement boxSales = driver.findElement(By.id("loan"));
                  WebElement boxtype2 = driver.findElement(By.id("credit1"));
                  WebElement boxCAmount = driver.findElement(By.id("amt8"));
                  a.dragAndDrop(btntype, boxAccount).perform();
	              a.dragAndDrop(btntype1,boxDAmount).perform();
	              a.dragAndDrop(boxtype2,boxSales).perform();
	              a.dragAndDrop(btntype1,boxCAmount).perform();
	
	}

}
