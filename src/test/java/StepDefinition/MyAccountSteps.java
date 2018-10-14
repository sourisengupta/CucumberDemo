package StepDefinition;

import cucumber.api.java.en.Then;
import pages.ContactsPage;
import pages.DealsPage;
import testBase.TestBase;


public class MyAccountSteps extends TestBase{	
	
	@Then("^user is on My Account page$")
	public void user_is_on_My_Account_page() throws InterruptedException  {
		driver.switchTo().frame("mainpanel");
		getMyaccount().validateMyAccountPage();
		driver.switchTo().parentFrame();
	}
	
	@Then("^user click on New Contact link$")
	public ContactsPage user_click_on_New_Contact_link()  {		
		driver.switchTo().frame("mainpanel");
		getMyaccount().clickOnNewContact();
	    driver.switchTo().parentFrame();
	    return new ContactsPage();
	}
	
	@Then("^user click on New Deal link$")
	public DealsPage user_click_on_New_Deal_link() throws Throwable {
		driver.switchTo().frame("mainpanel");
		getMyaccount().clickOnNewDeal();
	    driver.switchTo().parentFrame();
	    return new DealsPage();
	}
	
	@Then("^click Search button$")
	public void click_Search_button() throws InterruptedException  {	    
		driver.switchTo().frame("mainpanel");
		getMyaccount().clickSearch();
		driver.switchTo().parentFrame();
	}

	@Then("^Result should display in the page$")
	public void result_should_display_in_the_page()  {	    
	    
	}

}

