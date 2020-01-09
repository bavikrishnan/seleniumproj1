import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   System.out.println("Launching Greens technologys...");
		   driver.get("http://www.greenstechnologys.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver.getTitle());
		   System.out.println("Browser Closing....");
		   driver.close();
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		   WebDriver driver1 = new ChromeDriver();
		   System.out.println("Launching Gmail...");
		   driver1.get("https://gmail.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver1.getTitle());
		   System.out.println("Browser Closing....");
		   driver1.close();
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		   WebDriver driver2 = new ChromeDriver();
		   System.out.println("Launching Flipkart...");
		   driver2.get("https://flipkart.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver2.getTitle());
		   System.out.println("Browser Closing....");
		   driver2.close();
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		   WebDriver driver3 = new ChromeDriver();
		   System.out.println("Launching Greens technologys...");
		   driver3.get("http://greenstech.in/selenium-course-content.html");
		   System.out.println("Browser Launched...");
		   System.out.println(driver3.getTitle());
		   System.out.println("Browser Closing....");
           driver3.close();
           System.out.println("");
		}

	
	
}
