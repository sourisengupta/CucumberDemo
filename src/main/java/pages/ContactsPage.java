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
	public void typeFirstName(String firstname) throws InterruptedException {
		highlightElement(firstName);
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	public void typeSurName(String surname) throws InterruptedException {
		highlightElement(surName);
		surName.clear();
		surName.sendKeys(surname);
	}
	public void typeNickName(String nickname) throws InterruptedException {
		highlightElement(nickName);
		nickName.clear();
		nickName.sendKeys(nickname);
	}
	public void typePosition(String pos) throws InterruptedException {
		highlightElement(position);
		position.clear();
		position.sendKeys(pos);
	}
	public void typeDepartment(String dept) throws InterruptedException {
		highlightElement(department);
		department.clear();
		department.sendKeys(dept);
	}
	public void clickSave() throws InterruptedException {
		highlightElement(btnSave);
		//txtSearch.sendKeys("Hello world");
		btnSave.click();
	}
	public void fillContactDetails(String first, String last, String nick, String pos, String dept) throws InterruptedException {		
		typeFirstName(first);
		typeSurName(last);
		typeNickName(nick);
		typePosition(pos);
		typeDepartment(dept);
		
	}
	
}
