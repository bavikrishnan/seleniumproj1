package org.Day7Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement btnNav = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    Actions a = new Actions(driver);
	    btnNav.click();
	    //WebElement btnSignIn = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		//btnSignIn.click();
	    
	}

}
