package sampleScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;
import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMExample extends BaseClass
{
	//public static void main(String[] args) throws InterruptedException 
	//{
		
		// for every page we should create POM Class and call the actions of POM Class here
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		
//		WebElement first = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
//		WebElement last = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
//		//driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("admin");
//		//driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("admin");
//		first.sendKeys("admin");
//		last.sendKeys("admin");
//		Thread.sleep(4000);
//		driver.navigate().refresh();
//		Thread.sleep(4000);
//		first.sendKeys("sanjay");
//		last.sendKeys("sanjay");
//		System.out.println("completed");
//		Thread.sleep(4000);
//		
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApp("admin", "1232432");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.facebook.com");
//		//now create a object for LoginPage
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.loginToApp("admin", "12345");
//		loginPage.lgn();
//		Thread.sleep(3000);
//		driver.close();
		
		
	//}
	
	@Test
	public void LoginToFaceBook() throws InterruptedException 
	{
		//WebDriver driver = null;
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		//now create a object for LoginPage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp("admin", "12345");
		loginPage.lgn();
		//Thread.sleep(3000);
		//driver.close();
		
	}

}
