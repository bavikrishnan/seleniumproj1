import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class Base {
        static WebDriver driver;
        static WebElement ele;
		private WebElement txtField;
        //Setup Application
        public static void setupApplication()
		{
		  WebDriver driver;
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		}
        //Loading URL
        public static void url(String url)
        {
        	driver.get(url);
        }
        //Quit Browser
        public static void quit()
		{
          System.out.println("Closing the browser now.....");
		  driver.quit();
		}
      //Close Tab
        public static void close() {
           System.out.println("Closing the tab now.....");
           driver.close();
        }
        //Get Title 
        public static void Title()
        {
        	driver.getTitle();
        }
        //Get Current URL
        public static void CurrentURL()
        {
        	driver.getCurrentUrl();
        }
        //To Send Values
        public static void send(WebElement ele,String value)
        {
        ele.sendKeys(value);
        }
        //Get Button Click
        public static void click(WebElement ele)
        {
        ele.click();
        }
        //To GetText
        public static void text(WebElement ele)
        {
        	System.out.println(ele.getText());
        }
      //To GetAttributeValue
        public static void getValue(WebElement ele, String aname)
        {
        	System.out.println(ele.getAttribute(aname));
        }
        //Get Drop Down Select all
        public static void dropDownSelectAll(String str)
        {
        	WebElement contSelect = driver.findElement(By.id(str));
    		Select s = new Select(contSelect);
    	    boolean multiple = s.isMultiple();
    	    System.out.println(multiple);
    	    List<WebElement> li = driver.findElements(By.id(str));
    	    for(int i=0;i<li.size();i++)
    	    	s.selectByIndex(i);
        }
        //Get Drop Down deSelect all
        public static void dropDowndeSelectAll(String tname)
        {
        	WebElement contSelect = driver.findElement(By.id(tname));
    		Select s = new Select(contSelect);
    	    boolean multiple = s.isMultiple();
    	    System.out.println(multiple);
    	    List<WebElement> li = driver.findElements(By.id(tname));
    	    for(int i=0;i<li.size();i++)
    	    	s.deselectByIndex(i);
        }
        //Get Selected Options
        public static void getAllSelectedDropDownList(String tname)
        {
        	WebElement contSelect = driver.findElement(By.id(tname));
    		Select s = new Select(contSelect);
    	    boolean multiple = s.isMultiple();
    	    System.out.println(multiple);
    	    List<WebElement> li = driver.findElements(By.id(tname));
    	    for(int i=0;i<li.size();i++)
    	    System.out.println(s.getAllSelectedOptions());
        }
        //Get First Selected List
        public static void getFirstSelectedDropDownList(String tname)
        {
        	WebElement contSelect = driver.findElement(By.id(tname));
    		Select s = new Select(contSelect);
    	    System.out.println(s.getFirstSelectedOption());
        }
      //Get Drop Down list
        public static void getAllDropDownList(String tname)
        {
        	WebElement contSelect = driver.findElement(By.id(tname));
    		Select s = new Select(contSelect);
    	    List<WebElement> li = driver.findElements(By.id(tname));
    	    for(int i=0;i<li.size();i++)
    	    System.out.println(s.getOptions());
        }
        //Get Screenshot
        public static void takeSnap() throws IOException {
        	  TakesScreenshot tk = (TakesScreenshot) driver;
    	      File src = tk.getScreenshotAs(OutputType.FILE);
    	      System.out.println(src);
    	      try {
    	    	   File dest = new File("D:\\Selenium\\New folder\\Snap.jpg");
    	    	   FileUtils.copyFile(src,dest);
    	      }
    	      catch(Exception e)
    	      {
    	    	  System.out.println(e.getMessage());
    	    	  System.out.println("Exception in File destination *****/n Created new directory called temp ****");
    	    	  File s = new File("D:\\temp");
    	    	  s.mkdir();  
    	     }
    	   }
        //Get Parent Window
        public static void getparentWindow() {
        	driver.getWindowHandle();
        }
      //Switch to Window
        public static void switchToWindow(int wcount)
        {
        	Set<String> windowHandles = driver.getWindowHandles();
            Iterator it = windowHandles.iterator();
        	for (String windows : windowHandles)
        	    {
				System.out.println("All Windows:"+windows);
				}
        	int count=0;
        	while(it.hasNext())                                        
        	{   String cwindow = (String) it.next();
        	    if(count== wcount)
        	    {
        		System.out.println("Switching to:"+count);
        		driver.switchTo().window(cwindow);
        	    }
        	    wcount++;
        	    }
         }
        //Get all Window Handles
        public static void getallwindowHandles()
        {
        	Set<String> windowHandles = driver.getWindowHandles();
        	for (String string : windowHandles) {
				System.out.println(string);
		     }
        }
        //Switch to Default Frame
        public static void parentFrame() {
		     
         System.out.println("Switching to Parent Frame:");
         driver.switchTo().parentFrame();
        }
        //Get Frames List
        public static void getFrames()
        {
         List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
         for (WebElement webElement : findElements) {
			  System.out.println("Size"+webElement.getSize());
              System.out.println("Names:"+webElement.getText());       
              }        
        }
        //Switch to Parent Frame(String)
		public static void switchframe(String str) {
			driver.switchTo().frame(str);
		}
		//Switch to Parent Frame(Integer)
		public static void switchframe(int a) {
			driver.switchTo().frame(a);
		}
		//Switch to Parent Frame(WebElement)
		public static void switchframe(WebElement ele) {
			driver.switchTo().frame(ele);
		}
		public void jsclick(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    if (driver instanceof JavascriptExecutor)
			{
		    	js.executeScript("arguments[0].click();",ele);		
			}
		    
			}
		public static void sendwithJS(WebElement ele, String tname,String val) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement txtField = driver.findElement(By.id(tname));
		    if (driver instanceof JavascriptExecutor)
			{
		    	js.executeScript("arguments[0].setAttribute('value',"+val+");",ele);		
			}
		    
			}
		public static void getwithJS(WebElement ele, String tname,String val) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement txtField = driver.findElement(By.id(tname));
		    if (driver instanceof JavascriptExecutor)
			{
		    	Object obj = js.executeScript("arguments[0].getAttribute('value')",ele);
		    	String t = (String)obj;
		    	System.out.println(t);
			}
		 }
	     public static void switchToAlert()
		   {
	    	 Alert a = driver.switchTo().alert();		
		   }
	     public static void confirmAlert()
	     {
	    	 Alert a = driver.switchTo().alert();	
		     a.accept();
	     }
	     public static void dismissAlert()
	     {
	    	 Alert a = driver.switchTo().alert();	
		     a.dismiss();
	     }
	     public static void promptAlert(String value)
	     {
	    	 Alert a=driver.switchTo().alert();
	         a.sendKeys(value);
	         String t1 = a.getText();
	         System.out.println("From prompt box:"+t1); 
	     }
	     public static void navigateTo(String url)
	     {
	    	 driver.navigate().to(url);
	     }
	     public static void refresh()
	     {
	    	 driver.navigate().refresh();
	     }
	     public static void forward()
	     {
	    	 driver.navigate().forward();
	     }
	     public static void back()
	     {
	    	 driver.navigate().back();
	     }
	     public static void doubleClick() {
			Actions a = new Actions(driver);
			a.doubleClick();
		 }
	     public static void doubleClick(WebElement ele) {
				Actions a = new Actions(driver);
				a.doubleClick(ele);
	     }
	     public static void rightClick() {
	    	 Actions a = new Actions(driver);
	    	 a.contextClick();
	     }
	     public static void rightClick(WebElement ele) {
	    	 Actions a = new Actions(driver);
	    	 a.contextClick(ele);
	     }
	     public static void dragandDrop(WebElement ele1, WebElement ele2) {
	    	 Actions a = new Actions(driver);
	    	 a.dragAndDrop(ele1, ele2);
	     }
	     
		
}
