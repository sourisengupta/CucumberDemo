package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.MyAccount;
import testBase.TestBase;

public class HomepageSteps extends TestBase{
	
	@Before
	public void launchApp() throws MalformedURLException {
		initApplication();
	}
	@After
	public void closeApp() {
		
		
		closeApplication();
	}
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws IOException  {		
		Reporter.addStepLog("Launching the application");		
		getHomepage().validateHomepage();
		captureScreenshot("Homepage");
		Reporter.addScreenCaptureFromPath("D:\\Workspace\\POM2\\Report\\Screenshots", "Application Launch");		
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void user_enters_and_and_click_login_button(String user, String pass)  {			
		getHomepage().loginCRM(user,pass);		
	}

	
}
