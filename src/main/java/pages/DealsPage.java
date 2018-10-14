package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class DealsPage extends TestBase{
	
	@FindBy(xpath="//input[@id='title']")
	WebElement txtTitle;
	
	@FindBy(xpath="//input[@id='title']")
	WebElement txtCompany;
	@FindBy(xpath="//input[@id='title']")
	WebElement lkpCompany;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement txtAmount;
	@FindBy(xpath="//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")
	WebElement btnSave;
	
	public DealsPage() {
		PageFactory.initElements(driver,this);
	}	
	
	public void fillupDealsDetails(String title, String amount) throws InterruptedException {
		highlightElement(txtTitle);
		txtTitle.clear();
		txtTitle.sendKeys(title);
		highlightElement(txtAmount);
		txtAmount.clear();
		txtAmount.sendKeys(amount);		
	}
	public void clickSave() throws InterruptedException {
		highlightElement(btnSave);
		btnSave.click();
	}
	
}

