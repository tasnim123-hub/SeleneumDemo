package startingPointOfFramework;

import org.testng.annotations.Test;

public class TC001_Login extends GenericWrapper{

	@Test
	public void login() {
		 launchBrowser("http://leaftaps.com/opentaps");
		
		 enterById("username","DemoSalesManager");
		// enterById("username", "DemoSalesManager");
		enterById("password","crmsfa");
		
		 clickByClassName("decorativeSubmit");
		 
		 clickByLinkText("CRM/SFA");
		 
	}
}
