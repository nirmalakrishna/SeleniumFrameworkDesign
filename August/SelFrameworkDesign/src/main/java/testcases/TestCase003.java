package testcases;

import org.testng.annotations.Test;

import base.wrappers;

public class TestCase003 extends wrappers {

	@Test
	public void deleteLead() {
		//invokeApp("http://leaftaps.com/opentaps/control/main", "chrome");
		type(locateElement("id", "username1"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		clickElement(locateElement("className", "decorativeSubmit"));
		clickElement(locateElement("linkText", "CRM/SFA"));
		clickElement(locateElement("linkText", "Leads"));
		clickElement(locateElement("linkText", "Find Leads"));
		clickElement(locateElement("linkText", "Phone"));
		clear(locateElement("name", "phoneCountryCode"));
		type(locateElement("name", "phoneNumber"), "9790888529");
		clickElement(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String firstLead = getText(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		System.out.println("First Lead in search :: " + firstLead);
		clickElement(locateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		clickElement(locateElement("linkText", "Delete"));
		clickElement(locateElement("linkText", "Find Leads"));
		type(locateElement("name", "id"), firstLead);
		clickElement(locateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Error Message :: " + errorMsg);
		String verifyNoLeadMsg = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Verify Deleted Leads not present in list " + verifyNoLeadMsg);
		quitapp();

	}

}
