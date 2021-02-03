package learnCollections;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByPartialLinkText("Try it Yourself »").click();
		//method 1-get window Handle /Move to new window
		String CurentWin = driver.getWindowHandle();
		System.out.println(CurentWin);
		
		System.out.println("..............................");
		//method 2- get window Handles                 //Syntax of Set- Set<Integer> obj = new HashSet<Integer>();
		Set<String> allWinRef = driver.getWindowHandles();
		System.out.println(allWinRef);
		System.out.println("..........................");
		//for each Loops
		for(String eachwin:allWinRef) {
			System.out.println(eachwin);
			driver.switchTo().window(eachwin);
			}
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//driver.close();//closing the child/new window
	}

}
