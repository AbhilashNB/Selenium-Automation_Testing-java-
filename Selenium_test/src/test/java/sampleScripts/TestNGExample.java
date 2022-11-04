package sampleScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample {
	@Test
	public void launchChrome() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com");
		Reporter.log("chrome", true);
		Thread.sleep(2000);
		driver.close();

		// webdrivermanaager.<brfowserdriver>.create will auto close the browser

	}

	@Test
	public void launchFirefox() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Reporter.log("firefox", true);
		Thread.sleep(2000);
		driver.close();

		// WebDriverManager.FireFoxDriver.setup will not close the bowser
	}

	@Test
	public void launchFlipKart() throws InterruptedException {
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.navigate().to("https://www.flipkart.com");
		Reporter.log("edge", true);
		Thread.sleep(2000);
		driver.close();

	}

}
