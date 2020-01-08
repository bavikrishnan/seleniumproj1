package org.Day7Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      WebDriverWait w = new WebDriverWait(driver, 30);
	      driver.get("http://www.greenstechnologys.com/");
	      driver.navigate().to("http://greenstech.in/August-2019/DAY%208%20TASK-Alerts%20and%20Frames.txt");
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().refresh();

	}

}
