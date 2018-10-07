package testBase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import pages.ContactsPage;
import pages.DealsPage;
import pages.HomePage;
import pages.MyAccount;
import utility.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static AppProperties property;
	private static String url, currentBrowser;	
	HomePage homepage;	
	MyAccount myaccount ;
	ContactsPage contactpage;
	DealsPage dealpage;

	public DealsPage getDealpage() {
		if(null==dealpage) {
			dealpage=new DealsPage();
		}
		return dealpage;
	}

	public void setDealpage(DealsPage dealpage) {
		this.dealpage = dealpage;
	}

	public MyAccount getMyaccount() {
		if(null==myaccount) {
			myaccount=new MyAccount();
		}
		return myaccount;
	}

	public void setMyaccount(MyAccount myaccount) {
		this.myaccount = myaccount;
	}

	public ContactsPage getContactpage() {
		if(null==contactpage) {
			contactpage=new ContactsPage();
		}
		return contactpage;
	}

	public void setContactpage(ContactsPage contactpage) {
		this.contactpage = contactpage;
	}

	protected HomePage getHomepage() {
		if(null==homepage) {
			homepage=new HomePage();
		}
		return homepage;
	}

	protected void setHomepage(HomePage homepage) {
		this.homepage = homepage;
	}

	public TestBase() {
		property = new AppProperties();
		url=property.getProperty("URL");
		currentBrowser = property.getProperty("BROWSER");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public static void initApplication() throws MalformedURLException {
		selectBrowser(currentBrowser);
		getURL(url);		
	}
	public void closeApplication() {		
		driver.close();
	}
	public static void selectBrowser(String browser) throws MalformedURLException {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();	
//			
//			//grid
//			DesiredCapsnew RemoteWebDriver(new URL("http://192.168.0.11:5566/wd/hub"),capabilty);
		}
		else if(browser.equalsIgnoreCase("Firefox")) {						
		}
		else if(browser.equalsIgnoreCase("IE")) {			
		}
	}
	public static void getURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	public static void captureScreenshot(String screenshotname) throws IOException {
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("D:\\Workspace\\CucumberDemo\\Report\\Screenshots\\"+screenshotname+".jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void closeApplication() {
//		driver.close();
//	}
}
