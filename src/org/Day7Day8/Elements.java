package org.Day7Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/login.html"); 
	  WebElement txtBox = driver.findElement(By.id("email"));
	  if (txtBox.isEnabled())
	  {
		  System.out.println("You can edit the textbox");
	  }
	  else {
		  System.out.println("It is disabled");
	  }
	  WebElement submitbtn = driver.findElement(By.id("SubmitLogin"));
	  if(submitbtn.isDisplayed())
	  {
		  System.out.println("Element is displayed");
	  }
	  else
	  {
		  System.out.println("Element is not displayed");
	  }
	  if(submitbtn.isSelected())
	  {
		  System.out.println("Button is clicked");
	  }
	  else
	  {
		  System.out.println("Button is not Clicked");
	  }
	  submitbtn.click();
	  }
}
