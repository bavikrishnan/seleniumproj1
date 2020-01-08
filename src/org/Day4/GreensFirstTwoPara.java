package org.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensFirstTwoPara {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.greenstechnologies.in/selenium-training.php");
	      WebElement txtFirstPara = driver.findElement(By.xpath("//p[contains(.,'real time projects')]"));
          System.out.println(txtFirstPara.getText());
          WebElement txtSecondPara = driver.findElement(By.xpath("//p[contains(.,'Chennai - Located in Adyar, Anna nagar')]"));
          System.out.println(txtSecondPara.getText());
	
	
	
	
	}

}
