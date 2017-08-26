package pagetests;

import org.testng.annotations.Test;

import base.Annotation;
import pagefactory.LoginPage;

public class LoginTest extends Annotation {

	@Test
	public void loginOpenTaps() {
		new LoginPage().enterUsername().enterPassword().clickLogin();

	}

}
