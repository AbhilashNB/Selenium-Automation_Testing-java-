package sampleScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExampleAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		//System.out.println("before suite");
		Reporter.log("before suite",true);
		
	}

	@BeforeTest
	public void beforeTest() {
		//System.out.println("before test");
		Reporter.log("before test",true);
	}

	@BeforeClass
	public void beforeClass() {
		//System.out.println("before class");
		Reporter.log("before class",true);
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("before Method");
		Reporter.log("before method",true);
	}

	@Test
	public void testScript1() {
		//System.out.println("test script");
		Reporter.log("executing the test1 scripts",true);
	}
	
	@Test
	public void testScript2() {
		//System.out.println("test script");
		Reporter.log("executing the test2 scripts",true);
	}

	
	@Test
	public void testScript3() {
		//System.out.println("test script");
		Reporter.log("executing the test3 scripts",true);
	}
	@AfterMethod
	public void afterMethod() {
		//System.out.println("after Method");
		Reporter.log("after method",true);
	}

	@AfterClass
	public void afterClass() {
		//System.out.println("after class");
		Reporter.log("after class",true);
	}

	@AfterTest
	public void afterTest() {
		//System.out.println("after Test");
		Reporter.log("after test",true);
	}

	@AfterSuite
	public void afterSuite() {
		//System.out.println("after Suite");
		Reporter.log("after suite",true);
	}

}
