package org.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://greenstech.in/selenium-course-content.html");
	      Actions a = new Actions(driver);
	      WebElement btnOne = driver.findElement(By.xpath("//a[text()='COURSES']"));
	      a.moveToElement(btnOne).perform();
	      WebElement btnSecond = driver.findElement(By.xpath("//span[contains(text(),'Software Testing Training')]"));
	      a.moveToElement(btnSecond).perform();
	      WebElement btnthird = driver.findElement(By.xpath("//span[contains(text(),'Selenium Training')]"));
	      a.moveToElement(btnthird).perform();
	      btnthird.click();
	      WebElement paraTxt = driver.findElement(By.xpath("//p[contains(.,'Selenium with Appium course syllabus')]"));
          a.doubleClick(paraTxt);
          String text = paraTxt.getText();
	      System.out.println(text);
	     
	  
    
	  
	}

}
