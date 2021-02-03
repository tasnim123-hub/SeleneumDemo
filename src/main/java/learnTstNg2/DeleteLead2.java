package learnTstNg2;

import org.testng.annotations.Test;

public class DeleteLead2 extends BeforeAndAfterMethod2{
	@Test
	public void deleteLead() throws InterruptedException {
		//click leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		//click find Leads link
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		//enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		//click find leads button
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		//capture/click on first resulting lead
		String LeadID = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10022'])[6]").getText();
		System.out.println(LeadID);
		//click on first resulting lead
		driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10022'])[6]").click();
		//click Delete 
		driver.findElementByXPath("//a[text()='Delete']").click();
		//click find Leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Enter Capture Lead ID
		driver.findElementByXPath("input[@name='id']").sendKeys("10022");
		//click find leads button 
		driver.findElementByXPath("//button[text()='find Leads']").click();
		//Verify error msg
		String errorMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(errorMsg);
		if(errorMsg.contains("No records")) {
			System.out.println("ErrorMsg is match");
		}
		else {
			System.out.println("ErrorMsg is not match");
		}
}
}