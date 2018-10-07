package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

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

public class ContactSteps extends TestBase{
	
	
	
	@Then("^user enters contact details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_contact_details(String first, String last, String nick, String pos, String dept) throws IOException  {
		Reporter.addScenarioLog("This is a test for Creating contacts");
		
		driver.switchTo().frame("mainpanel");
		getContactpage().fillContactDetails(first, last, nick, pos,dept);	
		driver.switchTo().parentFrame();
	}
	
	@Then("^user click save button$")
	public void user_click_save_button()  {
		driver.switchTo().frame("mainpanel");
		getContactpage().clickSave();
		driver.switchTo().parentFrame();
	}	
	
	//Scenario Outline: Search Contacts	
	@Then("^User enters search \"([^\"]*)\" in the search box and click Search button$")
	public void user_enters_search_in_the_search_box_and_click_Search_button(String key) throws IOException {	    
		driver.switchTo().frame("mainpanel");		
		getMyaccount().typeSearchAndClick(key);
		driver.switchTo().parentFrame();
		Reporter.addScreenCaptureFromPath("D:\\Workspace\\CucumberDemo\\Report\\Screenshots\\Homepage.jpg");
		
		//need to uncomment for failed steps
		assertEquals(false, true);
	}
	

	
	
}

