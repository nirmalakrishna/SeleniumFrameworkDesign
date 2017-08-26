package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	public HomePage() {
				PageFactory.initElements(eventDriver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement crmsfaLink;
	
	public MainPage clickCRMSFA(){
		clickElement(crmsfaLink);
		return new MainPage();
	}

}
