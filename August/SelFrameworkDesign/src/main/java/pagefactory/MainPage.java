package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	public MainPage() {
		
		PageFactory.initElements(eventDriver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Leads")
	WebElement leadsTab;
	
	public LeadsPage clickLeadsTab(){
		clickElement(leadsTab);
		return new LeadsPage();
	}

}
