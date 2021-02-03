package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver ();
		//url
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		//Implicitly wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.findElementById("searchBtn").click();
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);

		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		//simpleAlert.accept();


	}

}
