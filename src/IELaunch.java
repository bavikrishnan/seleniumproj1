import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		 System.setProperty("webdriver.ie.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\IEDriverServer.exe");
		   WebDriver driver = new InternetExplorerDriver();
		   System.out.println("Launched..");
		   System.out.println("Launching Greens technologys...");
		   driver.get("http://www.greenstechnologys.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver.getTitle());
		   System.out.println("Browser Closing....");
		   driver.close();
		   System.setProperty("webdriver.ie.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\IEDriverServer.exe");
		   WebDriver driver1 = new InternetExplorerDriver();
		   System.out.println("Launching Facebook...");
		   driver1.get("https://facebook.com/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver1.getTitle());
		   System.out.println("Browser Closing....");
		   driver1.close();
		   System.setProperty("webdriver.ie.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\IEDriverServer.exe");
		   WebDriver driver2 = new InternetExplorerDriver();
		   System.out.println("Launching Amazon...");
		   driver2.get("https://amazon.in/");
		   System.out.println("Browser Launched...");
		   System.out.println(driver2.getTitle());
		   System.out.println("Browser Closing....");
		   driver2.close();
		   System.setProperty("webdriver.ie.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\IEDriverServer.exe");
		   WebDriver driver3 = new InternetExplorerDriver();
		   System.out.println("Launching Greens technologys...");
		   driver3.get("http://greenstech.in/selenium-course-content.html");
		   System.out.println("Browser Launched...");
		   System.out.println(driver3.getTitle());
		   System.out.println("Browser Closing....");
           driver3.close();
	}

}
