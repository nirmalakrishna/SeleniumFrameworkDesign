package testcases;
import org.testng.annotations.Test;

import base.Annotation;

public class TestCase002 {

	public class TestCase1 extends Annotation {
		
	@Test
		public void tc1() throws InterruptedException{
	//	invokeApp("http://leaftaps.com/opentaps/control/main","chrome");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		clickElement(locateElement("xpath", "//*[@value='Login']"));
		clickElement(locateElement("xpath", "//*[@class='crmsfa']/a/img"));
		clickElement(locateElement("linkText", "Leads"));
		clickElement(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "test");
		clickElement(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(15000);
		clickElement(locateElement("xpath", "(//a[@class='linktext'])[4]"));
		clickElement(locateElement("linkText", "Edit"));
		clear(locateElement("id", "updateLeadForm_companyName"));
		type(locateElement("id", "updateLeadForm_companyName"), "updated1");
		clickElement(locateElement("xpath", "//input[@value='Update']"));
		Thread.sleep(1000);
		verifyText(locateElement("id", "viewLead_companyName_sp"),"test");
	//	quitapp();		
		}
	}


}
