package org.Day7Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://demo.automationtesting.in/Alerts.html");
	      driver.manage().window().maximize();
	      WebElement okAlert = driver.findElement(By.xpath("//div[@id='OKTab']"));
          okAlert.click();
	      Alert a = driver.switchTo().alert();	
	      a.accept();
	      WebElement confirmAlertbtn = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	      confirmAlertbtn.click();
	      WebElement confirmAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	      confirmAlert.click();
	      a=driver.switchTo().alert();
          String t = a.getText();
	      System.out.println("From Confirm Alert"+t);
          a.dismiss();
          WebElement promptAlertbtn = driver.findElement(By.xpath("//a[@href='#Textbox']"));
          promptAlertbtn.click();
          WebElement promptAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
          promptAlert.click();
          a=driver.switchTo().alert();
          a.sendKeys("Automation Testing User");
          String t1 = a.getText();
          System.out.println("From prompt box:"+t1);
          a.accept();
          
	}

}
