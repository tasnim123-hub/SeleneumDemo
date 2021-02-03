package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Leaftap {

	public static void main(String[] args) {
		
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
         //WebDriverWait
         WebDriverWait wait = new WebDriverWait(driver,15);
         wait.until(ExpectedCondition.e);
         driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
         
          driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
          
         driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Cp");
         driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Cpb");
         driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("Rev");
         
         //Verification= For verify the first name ,we use getText() and store
         //the value in first name and print
         String firstName = driver.findElementById("viewLead_firstName_sp").getText();
        // String firstName = driver.findElementById("createLeadForm_firstName").getText();
        // System.out.println(firstName);
       
         
         //Assertion or verification [boolean Actual/Expected]
         Assert.assertEquals(firstName,"Hema", "verify FirstName");
        
         //System.out.println("Element not found");
        if (firstName.equals("Hema")) {
        	System.out.println("Name is Match"); 
        	
			}else {
				System.out.println("Name is not Match");
			}
         
       /*  if (firstName.contains("The Following Errors Occured")) {
			System.out.println("error massage match");
		} else {
System.out.println("error message not match");
		}*/
	}

}/*// enter lastName
//ExplicitlyWait
//Thread.sleep(2000);
	
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(By.id("createLeadForm_lastName")));

//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
driver.findElementById("createLeadForm_lastName").sendKeys("Ma");*/
