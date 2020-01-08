package org.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement txtlogin = driver.findElement(By.xpath("//input[@id ='email']"));
    txtlogin.sendKeys("aaa");
    System.out.println(txtlogin.getAttribute("value"));
    WebElement txtPass = driver.findElement(By.xpath("//input[@id ='pass']"));
    txtPass.sendKeys("bbb");
    System.out.println(txtPass.getAttribute("value"));
    WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
    btnLogin.click();
}
}
