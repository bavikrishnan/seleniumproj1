package org.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        txtSearch.sendKeys("iPhone X");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
	    List<WebElement> liphn = driver.findElements(By.xpath("//a[@class='a-link-normal a-text-normal']"));
	    liphn.get(0).click();
	    System.out.println(liphn);
	}

}
