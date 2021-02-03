package seleniumDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//URL
driver.get("http://leaftaps.com/opentaps/control/main");
//maximize
driver.manage().window().maximize();
//implicityWait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//enter UserName
driver.findElementById("username").sendKeys("DemoSalesManager");
//enter firstName
driver.findElementById("password").sendKeys("crmsfa");
//click Login
driver.findElementByClassName("decorativeSubmit").click();
//click CRM/SFA
driver.findElementByLinkText("CRM/SFA").click();
//click Leads
driver.findElementByXPath("//a[text()='Leads']").click();

//find all link
List<WebElement> inputList = driver.findElementsByTagName("input");//FindElements
int total = inputList.size();
System.out.println(total);

System.out.println("Total elementsstarting with TagName 'input': " + total);

//find all a (link) Tag
 List<WebElement> linkList = driver.findElementsByTagName("a");//findElements
 System.out.println(linkList.size());
 
 //linktext from all link
 /*for (int i = 0; i < linkList.size(); i++) {  //for(cont+space)
	 String text = linkList.get(i).getText();
	 System.out.println(text);
}*/
	 
 //find all div Tag
 List<WebElement> alldivTag = driver.findElementsByTagName("div");//findElements
 System.out.println(alldivTag.size());
 
 //find all tr Tag
 List<WebElement> alltrTag = driver.findElementsByTagName("tr");
 System.out.println(alltrTag.size());
 
 Thread.sleep(2000);
 driver.close();
	}

}
