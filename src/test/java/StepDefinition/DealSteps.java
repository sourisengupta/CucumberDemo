package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.MyAccount;
import testBase.TestBase;

public class DealSteps extends TestBase{

	@Then("^user enters Deal details \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_Deal_details(String title, String amount) throws Throwable {
		Reporter.addScenarioLog("This is a test for Creating Deals");
		driver.switchTo().frame("mainpanel");
		getDealpage().fillupDealsDetails(title, amount);	
		driver.switchTo().parentFrame();	    
	}
	
	@Then("^user click save button in deal page$")
	public void user_click_save_button_in_deal_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
		getDealpage().clickSave();	
		driver.switchTo().parentFrame();	
	}	
}

