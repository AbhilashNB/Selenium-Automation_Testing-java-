package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	// WebDriver declearing as globval variable
	
	public WebDriver driver;
	 public FileUtility fLib = new FileUtility();
	 
	 
	 @BeforeSuite
	 public void dbConfig()
	 {
		 System.out.println("connect to DB");
	 }
	 
	 @BeforeClass
	 public void launchBrowser()
	 {
//		 String BROWSER = System.getProperty("username");
//		 fLib.getPropertyData(BROWSER)
//		 String URL = System.getProperty("url");
//		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 		 
	 }
	 
	 
	 @BeforeMethod
	 public void loginToApp()
	 {
		 driver.get("https://www.facebook.com");
	 }
	 
	 
	 
	 @AfterMethod
	 
	 public void logoutFromApp()
	 {
		 System.out.println("logout from App");
	 }
	 
	 @AfterClass
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
	 
	 
	 
	 @AfterSuite
	 public void dbClose()
	 {
		 System.out.println("close to DB");
	 }
	
}
