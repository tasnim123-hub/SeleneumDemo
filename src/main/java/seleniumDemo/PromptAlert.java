package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		String PromptAlert = driver.switchTo().alert().getText();
		System.out.println(PromptAlert);
		
		driver.switchTo().alert().sendKeys("I am working");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElementById("result").getText());
		
	}

}