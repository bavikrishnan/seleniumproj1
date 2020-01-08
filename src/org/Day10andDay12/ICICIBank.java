package org.Day10andDay12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ICICIBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bavi\\\\eclipse-workspace\\\\SeleniumSample\\\\src\\\\driver\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement element = wait.until(
	    ExpectedConditions.visibilityOfElementLocated(By.id("AuthenticationFG.USER_PRINCIPAL")));
	    WebElement txtUser = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
	    txtUser.sendKeys("Bavi");
	    /*WebElement txtPwd = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
	    txtPwd.sendKeys("bavikrihsnan");*/
	    
	}

}
