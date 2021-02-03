package startingPointOfFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods {
	
public ChromeDriver driver;


	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 driver= new ChromeDriver();
		//URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize window
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//print title of the page
		System.out.println(driver.getTitle());
		//System.out.println("chrome Browser launch successfully");
	}

	public void enterById(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
		
	}

	public void enterByPartialLink(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterByClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
		
	}

	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();
	}

	public void clickByClassName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
		
	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();
		
	}

	public void selectVisibleTextById(String Id, String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd= new Select(ele);
		dd.selectByVisibleText(value);
		
	}
	public void selectVisibleTextByName(String Name, String value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
	}

	
		
	
	public void selectValueById(String Id,String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd= new Select(ele);
		dd.selectByValue(value);
	}

	public void getTextById(String Id) {
		WebElement text = driver.findElementById(Id);
		System.out.println(text);
	}

	public void closeBrowser() {
		driver.close();
		
	}

	public void selectIndexByName(String Name, int value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd=new Select(ele);
		dd.selectByIndex(value);
	}

	

	

	
	

	

}
