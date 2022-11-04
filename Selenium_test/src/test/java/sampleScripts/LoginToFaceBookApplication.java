package sampleScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToFaceBookApplication extends BaseClass
{
	@Test
	public void loginToFaceBookApp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		
		//Assert.assertEquals(actualtitle, "Facebook – log in or sign up");
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualtitle, "Facebook – log in or ");
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qweqweqwe");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("qrewqerwqe");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Reporter.log("LoginToFaceBookApp() method is passed",true);
		sa.assertAll();
	
		// hard assert and soft assert
		// hard are static methods and soft are non static  methods
		//it will stop the execution // this will not stop the execution
		// it will halt the remaining test cases
		
		
	}
	
	
	
	
	
}
