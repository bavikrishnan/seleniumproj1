package org.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportIndia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
        driver.manage().window().maximize();
        WebElement passportOff = driver.findElement(By.id("dcdrLocation"));
        Select s = new Select(passportOff);
        boolean multiple = s.isMultiple();
        System.out.println(multiple);
        List<WebElement> options = s.getOptions();
        for (WebElement value : options) {
		       String text = value.getText();
		       System.out.println(text);
        }
	
	}

}
