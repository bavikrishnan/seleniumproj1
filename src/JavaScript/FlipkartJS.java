package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartJS {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      WebElement loginLink = driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
          loginLink.click();
          Thread.sleep(3000);
         // WebElement loginForm = driver.findElement(By.xpath("//div[@class='_2ISNhP _3AOFWO']"));
	      driver.switchTo().activeElement();
	      WebElement mobileNum = driver.findElement(By.xpath("//input[@class='_2zrpKA _2rqcw- _2VUCMV _1dBPDZ']"));
	      mobileNum.sendKeys("Bavi");
	      WebElement passwd = driver.findElement(By.xpath("//input[@class='_2zrpKA _2rqcw- _3v41xv _1dBPDZ']"));
	      passwd.sendKeys("bavbafb");
	      WebElement loginBtn = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click;",loginBtn);
	}

}
