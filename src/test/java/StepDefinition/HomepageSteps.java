package StepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import testBase.TestBase;

public class HomepageSteps extends TestBase{
	
	@Before
	public void launchApp() throws MalformedURLException {
		initApplication();
	}
	@After
	public void closeApp(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
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
	//@When("^User enters <\"([^\"]*)\"> and <\"([^\"]*)\"> and click login button$")
	public void user_enters_and_and_click_login_button(String user, String pass) throws InterruptedException  {			
		getHomepage().loginCRM(user,pass);		
	}

	
}
