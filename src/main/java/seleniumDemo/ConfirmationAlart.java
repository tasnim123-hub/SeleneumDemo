package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		//url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByXPath("//a[text()='CRM/SFA']").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByXPath("//a[text()='Leads']").click();
driver.findElementByXPath("//a[contains(text(),'Merge')]").click();
driver.findElementByXPath("//a[text()='Merge']").click();


String ConfirmationAlart = driver.switchTo().alert().getText();
System.out.println(ConfirmationAlart);

Thread.sleep(3000);
//driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();

	}


}
