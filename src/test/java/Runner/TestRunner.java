package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="D:\\Workspace\\CucumberDemo\\src\\test\\java\\Features\\Contact.feature",
		glue= {"StepDefinition"},
		plugin= {"pretty", "html:Report\\HTML-Report",
		"json:Report\\JSON-Report\\cucumber.json",
		"junit:Report\\XML-Report\\cucumber.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:Report\\Extend-Report\\cucumber.html"}, 
		dryRun= false, 		monochrome=true,		strict=true,
		tags= {"@SmokeTest, @RegressionTest"}
	)

public class TestRunner {
	@AfterClass
	public static void reportSetup() {		
		Reporter.loadXMLConfig(new File("D:\\Workspace\\CucumberDemo\\Config\\extent-config.xml"));
		Reporter.setSystemInfo("User Name", "Souri Sengupta");
		Reporter.setSystemInfo("Email", "souri.sengupta@worldpay.com");
		Reporter.setSystemInfo("Platform", "Windows 10");
		Reporter.setSystemInfo("Company", "Worldpay");
		Reporter.setTestRunnerOutput("Cucumber Junit Test Runner ");
		
	}
}


