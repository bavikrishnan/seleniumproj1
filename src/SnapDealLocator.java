import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealLocator {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.snapdeal.com/login");
	      //WebElement txtLogin = driver.findElement(By.xpath("//input[@id='userName'][1]"));
	      WebElement txtLogin = driver.findElement(By.id("userName"));
	      txtLogin.sendKeys("aba@gmail.com");
	}

}
