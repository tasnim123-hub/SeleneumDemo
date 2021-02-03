package testNgTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
	@Test
	public void editLead() throws InterruptedException {
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

	//click leads link
			driver.findElementByXPath("//a[text()='Leads']").click();
			//click find Leads link
			driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
			Thread.sleep(2000);
			//enter first name
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ram");
			//click find leads button
			driver.findElementByLinkText("Find Leads").click();
			Thread.sleep(2000);
			/*//capture/click on first resulting lead
			String LeadID = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10005'])[5]").getText();
			System.out.println(LeadID);
			//click on first resulting lead
			driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10005'])[5]").click();
			//Verify title of the page
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("View")) {
				System.out.println("View title match");
			}else {
				System.out.println("View title is not match");
			}
			//click Edit 
			driver.findElementByXPath("//a[text()='Edit']").click();
			//change the company name
			driver.findElementById("updateLeadForm_companyName").clear();    //we can erase commentOut
			driver.findElementById("updateLeadForm_companyName").sendKeys("S");//we can erase commentOut
			//click Update
			driver.findElementByXPath("//input[@value='Update']").click();
			//Confirm the changed name
			String changedName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
			System.out.println(changedName);
			if(changedName.equals("tcs")) {
				System.out.println("tcs matched");
			}else {
				System.out.println("tcs not matched");
			}*/
			driver.close();
			
			
}
}