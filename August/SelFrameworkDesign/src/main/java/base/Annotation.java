package base;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Annotation extends wrappers {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	/*@BeforeGroups
	public void beforeGroups() {
		System.out.println("before groups");
	}*/

	@BeforeClass
	public void beforeClass() {
		System.out.println("before suite");
	}

	@DataProvider
	public void dataProvider() {
		System.out.println("before suite");
	}

	@BeforeMethod
	public void beforeMethod() {
		invokeApp("chrome", "http://leaftaps.com/opentaps/");
		System.out.println("before method");
	}

	@AfterMethod
	public void afterMethod() {
		quitapp();
		System.out.println("after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@AfterGroups
	public void aftergroups() {
		System.out.println("after groups");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
}
