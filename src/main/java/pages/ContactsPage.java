package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import testBase.TestBase;

public class ContactsPage extends TestBase{	

	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='surname']")
	WebElement surName;
	@FindBy(xpath="//input[@name='nickname']")
	WebElement nickName;
	@FindBy(xpath="//input[@id='company_position']")
	WebElement position;
	@FindBy(xpath="//input[@id='department']")
	WebElement department;
	@FindBy(xpath="//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")
	WebElement btnSave;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}		
	public void typeFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	public void typeSurName(String surname) {
		surName.clear();
		surName.sendKeys(surname);
	}
	public void typeNickName(String nickname) {
		nickName.clear();
		nickName.sendKeys(nickname);
	}
	public void typePosition(String pos) {
		position.clear();
		position.sendKeys(pos);
	}
	public void typeDepartment(String dept) {
		position.clear();
		position.sendKeys(dept);
	}
	public void clickSave() {
		//txtSearch.sendKeys("Hello world");
		btnSave.click();
	}
	public void fillContactDetails(String first, String last, String nick, String pos, String dept) {		
		firstName.clear();
		firstName.sendKeys(first);
		surName.clear();
		surName.sendKeys(last);
		nickName.clear();
		nickName.sendKeys(nick);
		position.clear();
		position.sendKeys(pos);
		position.clear();
		position.sendKeys(dept);
	}
	
}
