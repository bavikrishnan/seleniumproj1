package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTextHighlight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Bavi\\\\\\\\eclipse-workspace\\\\\\\\SeleniumSample\\\\\\\\src\\\\\\\\driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	    driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement((By.xpath("(//strong)[1]")));
		if (driver instanceof JavascriptExecutor)
		{
	      //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	      js.executeScript("arguments[0].style.border='3px solid red'", ele);
		}
	  
	}

}
