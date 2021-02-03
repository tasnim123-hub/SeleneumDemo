package learnTstNg2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BeforeAndAfterMethod2 {
	public ChromeDriver driver;
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
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
	}*/
	}

