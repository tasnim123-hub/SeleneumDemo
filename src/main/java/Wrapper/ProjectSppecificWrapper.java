package Wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSppecificWrapper {
	
	public ChromeDriver driver;
	@Parameters({"url","uname","pwd",})
	@BeforeMethod
	public void login(String url,String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver= new ChromeDriver();
		//URL
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get(url);
		//maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//print title of the page
		System.out.println(driver.getTitle());
		//enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys(uname);
		//enter password
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementById("password").sendKeys(pwd);
		//click on login button
		driver.findElementByXPath("//input[@value='Login']").click();
		//CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
	}
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
	}*/
	@DataProvider
	//public void getData() {
		public String[][] getData() {
		//Declare 2D Array
		String[][] data=new String[3][3];

		data[0][0]="";//row/column
		data[0][1]="";
		data[0][2]="";
		
		data[1][0]="";
		data[1][1]="";
		data[1][2]="";
		
		data[2][0]="";
		data[2][1]="";
		data[2][2]="";
		return data;
	}
	
	
}
