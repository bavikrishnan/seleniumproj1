package org.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensActiveText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.greenstechnologys.com/");
          driver.manage().window();
          //Thread.sleep(100000);
          WebElement e1 = driver.findElement(By.xpath("//span[contains(.,'Overall')]"));
          System.out.println(e1.getText());
}

}
