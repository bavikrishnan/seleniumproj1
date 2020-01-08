import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://demo.automationtesting.in/Register.html");
	      WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	      txtFname.sendKeys("Bavi"); 
	      WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	      txtLname.sendKeys("Krishnan"); 
	      WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	      txtEmail.sendKeys("erbavi18@gmail.com");
	      WebElement txtPhno = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	      txtPhno.sendKeys("8888888888");
	      WebElement btnradio = driver.findElement(By.xpath("//input[@value='FeMale']"));
	      btnradio.click();
	      WebElement btnCheck = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	      btnCheck.click();
	      WebElement txtPassa = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	      txtPassa.sendKeys("abababa");
	      WebElement txtPassb = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	      txtPassb.sendKeys("abababa");
	      WebElement btnSubmit = driver.findElement(By.id("submitbtn"));
	      btnSubmit.click();
	
	
	
	
	}

}
