import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.irctc.co.in/nget/train-search");
	      WebElement txtFrom = driver.findElement(By.xpath("//input[@placeholder='From*']"));
	      txtFrom.sendKeys("MGR CHENNAI CTL - MAS");
	      WebElement txtTo = driver.findElement(By.xpath("//input[@placeholder='To*']"));
	      txtTo.sendKeys("MUMBAI CENTRAL - BCT");
	}

}
