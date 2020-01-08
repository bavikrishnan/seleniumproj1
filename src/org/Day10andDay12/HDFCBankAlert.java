package org.Day10andDay12;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFCBankAlert {

	private static boolean displayed;

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	    driver.switchTo().frame("login_page");
	    WebElement idTxt = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	    idTxt.sendKeys("Bavi");
	    WebElement continuebtn = driver.findElement(By.xpath(("(//img[@alt='continue'])[1]")));
	    continuebtn.click();
	    Thread.sleep(3000);
	    WebElement pwdTxt = driver.findElement(By.xpath("//input[@name='fldPassword']")); 
	    pwdTxt.sendKeys("krishnan");
	    
	    WebElement captchaFrame = driver.findElement(By.id("captcha_iframe"));
	    if(captchaFrame.isDisplayed())
	    {
	    System.out.println("captcha present/n Entering dummy values");	
	    WebElement captchafld = driver.findElement(By.xpath("//input[@name='fldCaptcha']"));
	    captchafld.sendKeys("dummy");
	    WebElement Loginbtn = driver.findElement(By.xpath("//img[@alt='Login']"));
 	    Loginbtn.click();
 	    try
 	    {
 	    	Alert alert = driver.switchTo().alert();
 	    	alert.accept();
 	    }
 	    catch(Exception e) 
 	    {
 	    	System.out.println(e);
 	    }
	    }
	    else 
	    {
	    	WebElement Loginbtn = driver.findElement(By.xpath("//img[@alt='Login']"));
	 	    Loginbtn.click();
	 	}
	}

}
