package StepDefinition;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.cs.A;
import cucumber.api.java.de.Aber;
import cucumber.api.java.en.Then;
import testBase.TestBase;

public class ContactSteps extends TestBase{
	
	
	@Then("^user enters contact details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_contact_details(String first, String last, String nick, String pos, String dept) throws IOException, InterruptedException  {
		Reporter.addScenarioLog("This is a test for Creating contacts");
		
		driver.switchTo().frame("mainpanel");
		getContactpage().fillContactDetails(first, last, nick, pos,dept);	
		driver.switchTo().parentFrame();		
	}
	
	@Then("^user click save button$")
	public void user_click_save_button() throws InterruptedException  {
		driver.switchTo().frame("mainpanel");
		getContactpage().clickSave();
		driver.switchTo().parentFrame();
	}	
	
	//Scenario Outline: Search Contacts	
	@Then("^User enters search \"([^\"]*)\" in the search box and click Search button$")
	public void user_enters_search_in_the_search_box_and_click_Search_button(String key) throws IOException, InterruptedException {	    
		driver.switchTo().frame("mainpanel");		
		getMyaccount().typeSearchAndClick(key);
		driver.switchTo().parentFrame();
		//Reporter.addScreenCaptureFromPath("D:\\Workspace\\CucumberDemo\\Report\\Screenshots\\Homepage.jpg");
		
		//need to uncomment for failed steps
		assertEquals(false, true);
		
	}
}

