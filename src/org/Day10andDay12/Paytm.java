package org.Day10andDay12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {


	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://paytm.com/"); 
		  driver.manage().window().maximize();
	      WebElement loginBtn = driver.findElement(By.xpath("//div[@data-reactid='46']"));
	      loginBtn.click();
	      WebElement frameswitch = driver.findElement(By.xpath("//*[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
	      driver.switchTo().frame(frameswitch);
	      Thread.sleep(3000);
	      WebElement loginlink = driver.findElement(By.xpath("//div[@ng-click='toggleQRLoginFormView()']"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", loginlink);
		  //loginlink.click();
	      WebElement txtInput = driver.findElement(By.xpath("//input[@id='input_0']"));
	      txtInput.sendKeys("Bavikrishnan");
	      WebElement txtPassword = driver.findElement(By.xpath("//input[@id='input_1']"));
	      txtPassword.sendKeys("1243355");
	   
	
	}

}
