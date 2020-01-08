package org.Day10andDay12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintAlert {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.sprint.com/");
	    driver.manage().window().maximize();	
	    WebElement signIntbn = driver.findElement(By.xpath("//img[@alt='Sign In']"));
	    if(signIntbn.isDisplayed())
	    {
	    	System.out.println("Element is not hidden");
	    }
	    else {
	    	System.out.println("Element is hidden");
	    }
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", signIntbn);
	    WebElement submitbtn = driver.findElement(By.xpath("//button[@id='loginHeaderButton']"));
	    submitbtn.click();
	}

}
