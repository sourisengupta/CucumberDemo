package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement crmlogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String getHomePageTitle() {
		return driver.getTitle();
	}	
	public boolean validateCRMLogo() {
		return crmlogo.isDisplayed();
	}
	public MyAccount loginCRM(String user, String pass) throws InterruptedException {
		highlightElement(username);
		username.sendKeys(user);
		highlightElement(password);
		password.sendKeys(pass);
		highlightElement(loginBtn);
		loginBtn.click();
		return new MyAccount();
	}
	public void validateHomepage() {
		String title = driver.getTitle();
		assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
}
