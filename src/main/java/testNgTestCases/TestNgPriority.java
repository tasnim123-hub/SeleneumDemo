package testNgTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPriority {
	
	public  ChromeDriver driver; //Globally Declare
	
	@BeforeMethod 
public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
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
}
@Test(priority=1)//It will 2nd priority
public void createLead() {
	//create lead
	
    //driver.findElementByLinkText("Create Lead").click();
    //driver.findElementByPartialLinkText("Create").click();
    //driver.findElementByXPath("//a[text()='Create Lead']").click();
    driver.findElementByXPath("//a[contains(text(),'Create')]").click();
    //company name
    driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
    driver.findElementById("createLeadForm_lastName").sendKeys("Ade");
    driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Cp");
    driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Cpb");
    driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("Rev");
}
@Test(priority=0) //It will 1st priority
public void deleteLead() throws InterruptedException {
	//click leads link
	driver.findElementByXPath("//a[text()='Leads']").click();
	//click find Leads link
	driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	Thread.sleep(2000);
	//click phone 
	driver.findElementByXPath("//span[text()='Phone']").click();
	//enter phone number area code
	driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
	//enter phone number
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
	//enter Email address
	//driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@.com");
	//click find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
}

@AfterMethod
public void closeBrowser() {
	driver.close();
}

}
