package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends AbstractPage {
	public static String str;

	public LeadsPage() {

		PageFactory.initElements(eventDriver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement findleadsLink;

	public LeadsPage clickFindLeads() {
		clickElement(findleadsLink);
		return this;
	}

	@FindBy(how = How.LINK_TEXT, using = "Phone")
	WebElement phone;

	public LeadsPage clickPhoneTab() {
		clickElement(phone);
		return this;
	}

	@FindBy(how = How.NAME, using = "phoneCountryCode")
	WebElement countryCode;

	public LeadsPage clearCountryCode() {
		clear(countryCode);
		return this;
	}

	@FindBy(how = How.NAME, using = "phoneNumber")
	WebElement phoneNumber;

	public LeadsPage enterPhoneNumber() {
		type(phoneNumber, "9790888529");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	WebElement findLeadsBtn;

	public LeadsPage clickFindLeadsBtn() throws InterruptedException {
		clickElement(findLeadsBtn);
		Thread.sleep(15000);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//a[@class = 'linktext'])[4]")
	WebElement clickFirstLink;

	public LeadsPage getFirstResultingLeadId() {
		str = getText(clickFirstLink);
		return this;
	}

	public ViewLead clickFirstResultingLead() {
		clickElement(clickFirstLink);
		return new ViewLead();
	}

	@FindBy(how = How.NAME, using = "id")
	WebElement enterId;

	public LeadsPage enterCapturedId(String str) {
		type(enterId, LeadsPage.str);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-paging-info']")
	WebElement noResultText;

	public LeadsPage findLeadsResult() {
		verifyText(noResultText, "No Results found");
		return this;

	}

}
