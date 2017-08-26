package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

	public LoginPage() {

		PageFactory.initElements(eventDriver, this);
	}

	@FindBy(how = How.ID, using = "username")
	WebElement uName;

	public LoginPage enterUsername() {
		type(uName, "DemoSalesManager");
		return this;
	}

	@FindBy(how = How.ID, using = "password")
	WebElement pWord;

	public LoginPage enterPassword() {
		type(pWord, "crmsfa");
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement loginBtn;

	public HomePage clickLogin() {
		clickElement(loginBtn);
		return new HomePage();
	}

}
