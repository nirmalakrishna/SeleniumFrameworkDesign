package pagetests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Annotation;
import pagefactory.LeadsPage;
import pagefactory.LoginPage;

public class DeleteLead extends Annotation {

	@Test(dataProvider = "DeleteLead")
	public void deleteLead() throws InterruptedException {

		new LoginPage().enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeadsTab().clickFindLeads()
				.clickPhoneTab().clearCountryCode().enterPhoneNumber().clickFindLeadsBtn()

				.getFirstResultingLeadId().clickFirstResultingLead().clickDeleteBtn().clickFindLeads()
				.enterCapturedId(LeadsPage.str).clickFindLeadsBtn().findLeadsResult();

	}

	@DataProvider(name = "DeleteLead")
	public static Object[][] input() {
		return new Object[][] { { "DemoSalesManager", "crmsfa", "9790888529" }

		};
	}
}
