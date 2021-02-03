package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		 
		 //driver.switchTo().frame(driver.findElementById("iframeResult"));
		 //or
		 WebElement frame = driver.findElementById("iframeResult");
		 driver.switchTo().frame(frame);
		 
		 driver.findElementByXPath("//input[@value='John']").clear();
		 driver.findElementByXPath("//input[@value='John']").sendKeys("Tasnim");
		 
		 driver.findElementById("lname").clear();
		 driver.findElementById("lname").sendKeys("Chow");
		 
		 		// driver.switchTo().parentFrame();
//or
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
