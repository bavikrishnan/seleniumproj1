package org.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEven {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bavi\\eclipse-workspace\\SeleniumSample\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement contSelect = driver.findElement(By.id("continents"));
		Select s = new Select(contSelect);
	    boolean multiple = s.isMultiple();
	    System.out.println(multiple);
	    List<WebElement> li = driver.findElements(By.id("continents"));
	    for(int i=0;i<li.size();i++)
	    if(i%2==0)
	    {   
	    	s.selectByIndex(i);
	    	
	    }
	}

}
