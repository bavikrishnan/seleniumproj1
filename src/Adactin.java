import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://www.adactin.com/HotelApp/");
	      WebElement txtUName = driver.findElement(By.id("username"));
	      txtUName.sendKeys("bavi");
	      WebElement txtPass = driver.findElement(By.id("password"));
	      txtPass.sendKeys("bavi");
	 }

}
