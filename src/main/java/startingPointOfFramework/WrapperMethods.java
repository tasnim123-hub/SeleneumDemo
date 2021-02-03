package startingPointOfFramework;

public interface WrapperMethods {
	public void launchBrowser(String url);
	public void enterById(String locatorValue, String data);
	public void enterByName(String locatorValue, String data);
	public void enterByPartialLink(String locatorValue, String data);
	public void enterByXpath(String locatorValue, String data);
	
	public void clickByName(String locatorValue);
	public void clickByClassName(String locatorValue);
	public void clickByLinkText(String locatorValue);
	public void clickByXpath(String locatorValue);
	public void selectVisibleTextById(String Id,String value);
	public void selectVisibleTextByName(String Name,String value);
	public void selectIndexByName(String Name,int value);
	public void selectValueById(String Id,String value);
	public void getTextById(String Id);
	public void closeBrowser();
}
