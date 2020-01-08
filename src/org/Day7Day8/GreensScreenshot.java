package org.Day7Day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreensScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      WebDriverWait w = new WebDriverWait(driver, 30);
	      driver.get("http://www.greenstechnologys.com/");
	      driver.manage().window().maximize();
	      TakesScreenshot tk = (TakesScreenshot) driver;
	      File s = tk.getScreenshotAs(OutputType.FILE);
	      System.out.println(s);
	      File d = new File("D:\\Selenium\\New folder\\greens.jpg");
	      FileUtils.copyFile(s,d);
	 }

}
