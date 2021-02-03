package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		//FirefoxDriver driver= new  FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  
	
		driver.close();
		

	}

}
