package org.Day10andDay12;
//import org.Day10andDay12.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExamples {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Bavi\\\\\\\\eclipse-workspace\\\\\\\\SeleniumSample\\\\\\\\src\\\\\\\\driver\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
    driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.xpath("(//*[@class='box'])[2]/h2"));
	String txt = ele.getText();
	System.out.println(txt);
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView();", ele);
    
    }

}