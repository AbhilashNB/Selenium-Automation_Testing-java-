package sampleScripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDependsOn {
	@Test
	public void test1()
	{
		System.out.println("test1");
		//Assert.fail("Sample error message");
	}

	@Test()
	public void test2() {
		System.out.println("test2");
		
	}
	
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("test3");
	}

}
