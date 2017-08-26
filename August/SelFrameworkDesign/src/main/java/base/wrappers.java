package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class wrappers extends EventListener{
	
//	public static final WebElement WebElement = null;
	public WebDriver driver;
	public static EventFiringWebDriver eventDriver ;

	// ********launch browser****************
	public void invokeApp(String browser, String url) {
	
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			break;
		/*case "ie":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case "firefox":

			break;*/
		}
		eventDriver = new EventFiringWebDriver(driver);
		EventListener handler = new EventListener();
		eventDriver.register(handler);
		eventDriver.manage().window().maximize();
		eventDriver.get(url);

	}

	// ********locate element with find Element*******************
	public WebElement locateElement(String elementType, String value) {

		WebElement ele = null;
		switch (elementType) {
		case ("id"):
			ele = eventDriver.findElement(By.id(value));
			break;
		case "name":
			ele = eventDriver.findElement(By.name(value));
			break;
		case "classname":
			ele = eventDriver.findElement(By.className(value));
			break;
		case "linkText":
			ele = eventDriver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			ele = eventDriver.findElement(By.partialLinkText(value));
			break;
		case "xpath":
			ele = eventDriver.findElement(By.xpath(value));
			break;
		case "css":
			ele = eventDriver.findElement(By.cssSelector(value));
			break;
		case "tagName":
			ele = eventDriver.findElement(By.tagName(value));
			break;
		case "type":
			ele = eventDriver.findElement(By.xpath("//*[@type='+"+ value+"+'"));
			break;
		case "value":
			ele = eventDriver.findElement(By.xpath("//*[@value='+"+ value+"+'"));
			break;
		case "href":
			ele = eventDriver.findElement(By.xpath("//*[@href='+"+ value+"+'"));
			break;
		}
		return ele;
	}

	// To type the input
	public void type(WebElement element, String value) {
		element.sendKeys(value);

	}

	// To click an Element
	public void clickElement(WebElement element) {
		element.click();

	}

	// To handle dropdowns actions-selectby Index
	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);

	}

	// To handle dropdowns actions-selectby value
	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	// To handle dropdowns actions-selectby visibletext
	public void selectByVisibleText(WebElement element, String text) {

		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	// ***********switchToWindow*****************
	public void switchToWindow(int windowindex) {
		Set<String> windowHandles = eventDriver.getWindowHandles();
		List<String> allwindows = new ArrayList<>();
		allwindows.addAll(windowHandles);
		eventDriver.switchTo().window(allwindows.get(windowindex));

	}

	// ***********alert actions*****************
	public void switchToalert() {
		eventDriver.switchTo().alert();

	}

	// ***********alert actions-accept*****************
	public void alertAccept() {
		eventDriver.switchTo().alert().accept();

	}

	// ***********alert actions-dismiss*****************
	public void alertDismiss() {
		eventDriver.switchTo().alert().dismiss();
	}

	// ***********alert actions-getText*****************
	public String alertgetText() {
		String text = "";
		text = eventDriver.switchTo().alert().getText();
		return text;
	}

	// ***********switch To frame*****************
	public void switchToframe(WebElement element) {
		eventDriver.switchTo().frame(element);

	}

	// ***********verifyTitle*****************
	public boolean verifyTitle(String title) {
		String wintitle = "";
		wintitle = eventDriver.getTitle();
		if (wintitle.equals(title)) {
			return true;
		} else {
			return false;
		}

	}

	// *************get attribute*****************
	public String getAttributes(WebElement element, String attribute) {
		String value = "";
		value = element.getAttribute(attribute);
		return value;
	}

	// *************get text*****************
	public String getText(WebElement element) {
		String text = "";
		text = element.getText();
		return text;
	}

	// *************verify text*****************
	public boolean verifyText(WebElement element, String text) {
		if (element.getText().equalsIgnoreCase(text)) {
			return true;
		} else {
			return false;
		}
	}

	// *************taking snapshot*****************
	public boolean takeSnapshot(String srcPath, String destPath) {

		return true;
	}

	// To clear
	public void clear(WebElement element) {
		element.clear();

	}

	// *************quit app*****************
	public void quitapp() {
		eventDriver.close();

	}

}