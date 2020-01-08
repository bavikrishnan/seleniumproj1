import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.redbus.in/");
	      driver.manage().window().maximize();
	      WebElement userIcon = driver.findElement(By.id("i-icon-profile"));
          userIcon.click();
          WebElement btnSign = driver.findElement(By.xpath("//input[@id='signInLink']"));
          btnSign.click();
	}

}
