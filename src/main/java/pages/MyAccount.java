package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class MyAccount extends TestBase{	

	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeLnk;
	
	@FindBy(xpath="//td[contains(text(),'User: Souri Sengupta')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLnk;	
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLnk;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealLnk;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLnk;
	
	@FindBy(xpath="//a[contains(text(),'New Task')]")
	WebElement newTaskLnk;
	
	@FindBy(xpath="//a[@class='topnavlink'][contains(text(),'Logout')]")
	WebElement signOut;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement txtSearch;
	
	@FindBy(xpath="/html/body/table[1]/tbody/tr[4]/td/form/table/tbody/tr/td[3]/div/input")
	WebElement btnSearch;
	
	public MyAccount() {
		PageFactory.initElements(driver,this);
	}
	
	public String getMyAccountTitle() {
		return driver.getTitle();
	}
	public boolean verifyCorrectUsername() {
		return userNameLable.isDisplayed();
	}
	public ContactsPage clickContactstab() throws InterruptedException {
		highlightElement(contactsLink);
		contactsLink.click();
		return new ContactsPage();
	}
	public DealsPage clickDealstab() throws InterruptedException {
		highlightElement(dealsLnk);
		dealsLnk.click();
		return new DealsPage();
	}
	public TasksPage clickTaskstab() throws InterruptedException {
		highlightElement(newTaskLnk);
		newTaskLnk.click();
		return new TasksPage();
	}
	public void validateMyAccountPage() {
		assertEquals(true, signOut.isDisplayed());				
	}
	public ContactsPage clickOnNewContact() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLnk.click();
		return new ContactsPage();
	}
	public DealsPage clickOnNewDeal() {
		Actions action = new Actions(driver);
		action.moveToElement(dealsLnk).build().perform();
		newDealLnk.click();
		return new DealsPage();
	}
	public void typeSearchAndClick(String searchString) throws InterruptedException {
		highlightElement(txtSearch);
		txtSearch.clear();
		txtSearch.sendKeys(searchString);
		btnSearch.click();
	}
	public void clickSearch() throws InterruptedException {
		highlightElement(btnSearch);
		btnSearch.click();
	}
	
	
}
