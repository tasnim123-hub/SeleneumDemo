package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Selectable").click();
		
		//driver.switchTo().frame(0);  //Using index number-if your iframe has no ID or name locator,then go to index number.
		                               //Note:in JAVAindex starts from zero(0).
		
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		//or
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//click item -1
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		
		//switch back to main HTML page
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		//Click Demos(outside frame)
		driver.findElementByLinkText("Demos").click();
		

	}

}
