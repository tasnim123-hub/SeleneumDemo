package learnTstNg2;

import org.testng.annotations.Test;

import Wrapper.ProjectSppecificWrapper;

public class CreatLead extends ProjectSppecificWrapper {
	
	@Test(dataProvider="getData")
	
	public void creatLead(String cName,String fName,String lName) {
		
	driver.findElementByXPath("//a[text()='Leads']").click();
	
	//create lead
	driver.findElementByXPath("//a[contains(text(),'Create')]").click();
     //company name
    //driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
    driver.findElementById("createLeadForm_companyName").sendKeys(cName);
    //first name
     //driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
     driver.findElementById("createLeadForm_firstName").sendKeys(fName);
     //last name
     //driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
     driver.findElementById("createLeadForm_lastName").sendKeys(lName);
}
}