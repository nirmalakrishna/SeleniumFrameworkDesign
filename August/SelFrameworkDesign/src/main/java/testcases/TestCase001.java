package testcases;

import org.testng.annotations.Test;

import base.Annotation;
import base.wrappers;

public class TestCase001 {

	public class CreateLead extends Annotation {
		@Test
		public void sam() {
		//	invokeApp("chrome", "http://leaftaps.com/opentaps");
			type(locateElement("id", "username"), "DemoSalesManager");
			type(locateElement("id", "password"), "crmsfa");
			clickElement(locateElement("classname", "decorativeSubmit"));
			clickElement(locateElement("linkText", "CRM/SFA"));
			clickElement(locateElement("linkText", "Create Lead"));
			type(locateElement("id", "createLeadForm_companyName"), "ABCD");
			type(locateElement("id", "createLeadForm_firstName"), "Jaya");
			type(locateElement("id", "createLeadForm_lastName"), "geetha");
			selectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"), "Direct Mail");
			selectByVisibleText(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");
			type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9876565656");
			type(locateElement("id", "createLeadForm_primaryEmail"), "jaygeethaj@gmail.com");
			clickElement(locateElement("name", "submitButton"));
			getText(locateElement("xpath", "//*[@id='viewLead_companyName_sp']"));
		//	quitapp();

		}
	}
}
