package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest {

	//public static void main(String[] args) {
	
@Test
public void browserTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		//Title print
		System.out.println(driver.getTitle());
		//Title print
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	  //Assertion or Verification  [boolean Actual/Expected]
	     Assert.assertEquals(title, "Google","Asserting the title");
	     
	   //Assertion or Verification [true/false]
	     boolean searchbox = driver.findElementByName("q").isDisplayed();
	     Assert.assertTrue(searchbox, "Verifing if the searching box is displayed");
		
	       
	         
	         
	       //driver.close();
	}

}
