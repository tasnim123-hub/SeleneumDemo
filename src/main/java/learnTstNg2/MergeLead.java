package learnTstNg2;

import java.util.Set;

import org.testng.annotations.Test;

public class MergeLead extends BeforeAndAfterMethod2{
	@Test
	public void meargeLead() throws InterruptedException {
		//click Leads link
		driver.findElementByLinkText("Leads").click();
		//click merge Leads
		driver.findElementByLinkText("Merge Leads").click();
		//click on icon near from Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		String CurentWin = driver.getWindowHandle();
		System.out.println(CurentWin);
		//method 1-get window Handle /Move to new window
		Set<String> allWinRef = driver.getWindowHandles();
		System.out.println(allWinRef);
		//for each Loops
		for (String eachWin:allWinRef){
			System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			System.out.println(driver.getTitle());
		}
		//enter Lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10043");
		
		//click on find Leads button
		driver.findElementByXPath("(//button[text()='Find Leads'])").click();
		
		//capture/print first resulting Lead
		 String elefirstName = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
		 System.out.println(elefirstName);
		 Thread.sleep(2000);
		 
		 //click first resulting Lead
		 driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		 
		 //switching back to (parent/primary/main) window 
		 driver.switchTo().window(CurentWin);
		 
		 //click on icon near to Lead
		 driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		 
		 //move to new window
		 Set<String> allWinRef1 = driver.getWindowHandles();
		 System.out.println(allWinRef1);
		 
		 for(String eachWin:allWinRef1) {
			 System.out.println(eachWin);
		 }
		 Thread.sleep(4000);
		 //enter Lead ID
		 driver.findElementByXPath("(//input[@type='text'])").sendKeys("10044");
		 Thread.sleep(2000);
		 //driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

}
