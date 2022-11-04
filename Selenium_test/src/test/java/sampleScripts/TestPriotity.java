package sampleScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPriotity {

	// priority = 0
	// invocation count = 1
	// enabled = true
	// adding dependency dependsOnMethods
	// Asset.fail
	// @BeforeSuite
	// @BeforeTest
	// @BeforeClass
	// @BeforeMethod
	// @Test
	// @AfterMethod
	// @AfterClass
	// @AfterTest
	// @AfterSuite
	// @FindBy
	// @Parameters
	// @DataProvider

	@Test(priority = 0, invocationCount = 2, enabled = true)
	public void snake() {
		System.out.println("hiss hiss");
	}

	@Test(priority = -3, invocationCount = 3, enabled = true)
	public void cat() {
		System.out.println("meow meow");
	}

	@Test(priority = -1, invocationCount = 4, enabled = true, dependsOnMethods = "cat")
	public void dog() {
		System.out.println("bow bow");
	}
}
