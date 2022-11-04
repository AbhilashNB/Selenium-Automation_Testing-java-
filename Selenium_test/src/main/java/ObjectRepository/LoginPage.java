package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	// example for encapsulation
	//decleration
	
	@FindBy(id= "email")
	private WebElement userNameEditText;
	
	@FindBy(id = "pass")
	private WebElement passwordEditText;
	
	@FindBy(name = "login")
	private WebElement logintBtn;

	
	
	// initialization
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//utilization
	
	
	public void loginToApp(String username,String password)
	{
		userNameEditText.sendKeys(username);
		passwordEditText.sendKeys(password);
	}
	
	
	public void lgn()
	{
		logintBtn.click();
	}
	
	
	
}
