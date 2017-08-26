package base;

import org.openqa.selenium.WebElement;

public interface wrapperinterface {

	/**
	 * This method will launch the specified browser with the specified url
	 * 
	 * @param url
	 * @param browser
	 */
	public void invokeApp(String url, String browser);

	// ********locate element with find Element*******************
	public WebElement locateElement(String elementType, String value);

	// To type the input
	public void type(WebElement element, String value);

	// To click an Element
	public void clickElement(WebElement element);

	// To handle dropdowns actions-selectby Index
	public void selectByIndex(WebElement element, int index);

	// To handle dropdowns actions-selectby value
	public void selectByValue(WebElement element, String value);

	// To handle dropdowns actions-selectby visibletext
	public void selectByVisibleText(WebElement element, String text);

	// ***********switchToWindow*****************
	public void switchToWindow(int windowindex);

	// ***********alert actions*****************
	public void switchToalert();

	// ***********alert actions-accept*****************
	public void alertAccept();

	// ***********alert actions-dismiss*****************
	public void alertDismiss();

	// ***********alert actions-getText*****************
	public String alertgetText();

	// ***********switch To frame*****************
	public void switchToframe(WebElement element);

	// ***********verifyTitle*****************
	public boolean verifyTitle(String title);

	// *************get attribute*****************
	public String getAttributes(WebElement element, String attribute);

	// *************get text*****************
	public String getText(WebElement element);

	// *************verify text*****************
	public boolean verifyText(WebElement element, String text);

	// *************taking snapshot*****************
	public boolean takeSnapshot(String srcPath, String destPath);

	// To clear
	public void clear(WebElement element);

	// *************quit app*****************
	public void quitapp();
}
