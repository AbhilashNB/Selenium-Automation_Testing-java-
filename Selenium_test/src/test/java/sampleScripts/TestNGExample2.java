package sampleScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample2 {
	@Test
	public void instaramLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		Reporter.log("Instagram Login",true);
		driver.close();

	}
	
	@Test
	public void actiTimeLogin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		Reporter.log("actitime Login",true);
		driver.close();
	}

}
