package org.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.greenstechnologys.com/");
    driver.manage().window();
    WebElement contactUSbtn = driver.findElement(By.xpath("//a[@href='contact.php']"));
    Actions a = new Actions(driver);
    Robot r  = new Robot();  
    a.contextClick(contactUSbtn);
    for(int i=0;i<2;i++)
    {
    	r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
    }
    String nWindow = driver.getWindowHandle();
    driver.switchTo().window(nWindow);
    List<WebElement> addrlist = driver.findElements(By.xpath("//i[@class='fa fa-home']"));
    System.out.println(addrlist);    
}
}
