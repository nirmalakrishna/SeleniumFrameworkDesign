package base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListener implements WebDriverEventListener {

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Change value of");
		System.out.println("Before changeing the" + driver + "element" + element);

	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After Click on");

	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("After Find By");

	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Back");

	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Forward");

	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate To");

	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After script");

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeChangeValueOf");
		System.out.println("Before changeing the" + driver + "element" + element);

	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("beforeClickOn");

	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("beforeFindBy");

	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateBack");

	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateForward");

	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("beforeNavigateTo");
		System.out.println("The browser" + driver + "launched with url" + url);

	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("beforeScript");

	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("onException");
	if (throwable instanceof org.openqa.selenium.NoSuchElementException) {
			// System.out.println("The Element could not be
			// found"+throwable.getMessage());
			String str = throwable.getMessage();
			System.out.println(str);
			String[] x = str.split("{");
			// String modifiedmsg[];
			System.out.println("Modified text" + x[0]);
		} else if (throwable instanceof NoSuchFrameException) {
			String str = throwable.getMessage();
			System.out.println(str);
		} else if (throwable instanceof NoSuchWindowException) {
			String str = throwable.getMessage();
			System.out.println(str);
		}
		String throwablestr = throwable.toString();
		switch (throwablestr) {
		case "NoSuchElementException":
			break;
		case "NoSuchWindowException":
			break;
		case "NoSuchFrameException":
			break;
		}
		String str = throwable.getMessage();
		System.out.println(str);
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub

	}

}
