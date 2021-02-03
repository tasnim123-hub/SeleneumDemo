package testNgTestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CreateLead {
	
@Test
public void creatalead() {
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
	
    //driver.findElementByLinkText("Create Lead").click();
    //driver.findElementByPartialLinkText("Create").click();
    //driver.findElementByXPath("//a[text()='Create Lead']").click();
    driver.findElementByXPath("//a[contains(text(),'Create')]").click();
    //company name
    driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
    driver.findElementById("createLeadForm_lastName").sendKeys("Ade");
   /* driver.findElementByXPath("//input[@id='createLeadForm_personalTitle']").sendKeys("Cp");
    driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Cpb");
    driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("Rev");*/
    //closeBrowser
   driver.close();
   
    
}
}
