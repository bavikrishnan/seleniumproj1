package JavaScript;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement txtlogin = driver.findElement(By.xpath("//input[@id ='email']"));
	    txtlogin.sendKeys("aaa");
	    WebElement txtPass = driver.findElement(By.xpath("//input[@id ='pass']"));
	    txtPass.sendKeys("bbb");
	    WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    if (driver instanceof JavascriptExecutor)
		{
	    	js.executeScript("arguments[0].click();",btnLogin);		
		}
	    
		}
	}


