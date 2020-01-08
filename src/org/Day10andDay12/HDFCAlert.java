package org.Day10andDay12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	    driver.switchTo().frame("login_page");
	    WebElement continuebtn = driver.findElement(By.xpath(("(//img[@alt='continue'])[1]")));
	    continuebtn.click();
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
        
}
}
