package learnTstNg2;

import org.testng.annotations.Test;

import Wrapper.ProjectSppecificWrapper;

public class EditLead2 extends ProjectSppecificWrapper {

	@Test
	public void editLead() throws InterruptedException {
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
			//capture/click on first resulting lead
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
			}
			
			
}
}
