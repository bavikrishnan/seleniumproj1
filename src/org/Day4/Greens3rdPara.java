package org.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens3rdPara {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.greenstechnologies.in/selenium-training.php");
	      driver.manage().window();
          //Thread.sleep(100000);
          WebElement e1 = driver.findElement(By.xpath("//p[contains(.,'Selenium Architecture')]"));
          System.out.println(e1.getText());
}

	}

