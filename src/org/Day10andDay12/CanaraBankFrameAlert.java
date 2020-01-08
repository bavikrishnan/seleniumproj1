package org.Day10andDay12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBankFrameAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		WebElement submitbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    submitbtn.click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	}

}
