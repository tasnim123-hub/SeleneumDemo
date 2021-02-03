package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeSnapeShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//print title of the page
		System.out.println(driver.getTitle());
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click on login button
		driver.findElementByXPath("//input[@value='Login']").click();
		//CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//Leads
		driver.findElementByXPath("//a[text()='Leads']").click();
		//create lead
		 driver.findElementByXPath("//a[contains(text(),'Create')]").click();
         //company name
         driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
         driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
         
         //We will Type (try) before any Element/Then(cont/ctrl+space)/try_catch=click
         try {
        	 driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
        	 System.out.println("Enter last name successfuiiy");
        	 
		} catch (Exception e) {
			System.err.println("Enter last name not successfuiiy");
			
		}finally {
			//Take snapshot
			File src = driver.getScreenshotAs(OutputType.FILE);//take snapshot and store in Temp File
			
			//the path where it store after move
			File dest = new File("./snap/image.png");
			
			FileUtils.copyFile(src, dest);//moving file source to dest
		}
         
	}

}
