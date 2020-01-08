import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		 System.setProperty("webdriver..driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   System.out.println("Launched..");
		   System.out.println("Launching Greens technologys...");
		   driver.get("http://www.greenstechnologys.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver.getTitle());
		   System.out.println("Browser Closing....");
		   driver.close();
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\geckodriver.exe");
		   WebDriver driver1 = new FirefoxDriver();
		   System.out.println("Launching Facebook...");
		   driver1.get("https://facebook.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver1.getTitle());
		   System.out.println("Browser Closing....");
		   driver1.close();
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\geckodriver.exe");
		   WebDriver driver2 = new FirefoxDriver();
		   System.out.println("Launching Amazon...");
		   driver2.get("https://amazon.in/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver2.getTitle());
		   System.out.println("Browser Closing....");
		   driver2.close();
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\geckodriver.exe");
		   WebDriver driver3 = new FirefoxDriver();
		   System.out.println("Launching Greens technologys...");
		   driver3.get("http://greenstech.in/selenium-course-content.html");
		   System.out.println("Browser Launched...");
		   System.out.println(driver3.getTitle());
		   System.out.println("Browser Closing....");
           driver3.close();//*/


	}

}
