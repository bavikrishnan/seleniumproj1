import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
	      WebElement txtusername = driver.findElement(By.name("username"));
	      txtusername.sendKeys("bavikrishnan");
	      WebElement txtpass = driver.findElement(By.name("password"));
	      txtpass.sendKeys("bavikrishnan");
	
	}

}
