package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsSQA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Bavi\\\\\\\\eclipse-workspace\\\\\\\\SeleniumSample\\\\\\\\src\\\\\\\\driver\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
	    driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    System.out.println(driver.getTitle());
	    js.executeScript("window.scrollTo(0,-(document.body.scrollHeight))");
	}

}
