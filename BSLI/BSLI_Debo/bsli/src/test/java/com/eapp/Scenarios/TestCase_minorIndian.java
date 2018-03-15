package com.eapp.Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.eapp.Elements.IChamp_HomePage;
import com.eapp.Operations.EApp_LandingPage_Operations;
import com.eapp.Operations.IChamp_HomePage_Operations;
import com.eapp.Operations.IChamp_LandingPage_Operations;
import com.eapp.Operations.IChamp_LoginPage_Operations;
import com.eapp.Reporting.Report_Setup;

public class TestCase_minorIndian {
	public WebDriver driver;
	IChamp_LoginPage_Operations operations_object = new IChamp_LoginPage_Operations();
	IChamp_HomePage_Operations homepage = new IChamp_HomePage_Operations();
	IChamp_LandingPage_Operations landingPage = new IChamp_LandingPage_Operations();
	EApp_LandingPage_Operations operationseapp =new EApp_LandingPage_Operations();
	String driverPath = "./";
	
public void setDriver(String browserType, String appURL) {
		
		switch(browserType) {
		case "ie":
			driver = initIEDriver(appURL);
			break;
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Internet Explorer as default for execution...");
			driver = initIEDriver(appURL);
		}
	}

	@SuppressWarnings("deprecation")
	public WebDriver initIEDriver(String appURL) {
		System.out.println("Launching Internet Explorer with new profile..");
		System.setProperty("webdriver.ie.driver", driverPath+ "IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		//Log.info(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS);
		//cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		//cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		cap.setCapability("nativeEvents", false);    
		//cap.setCapability("unexpectedAlertBehaviour", "accept");
		cap.setCapability("ignoreProtectedModeSettings", true);
		//cap.setCapability("enable-popup-blocking", true);
		//cap.setCapability("enablePersistentHover", true);
		//cap.setCapability("ignoreZoomSetting", true);
		cap.setJavascriptEnabled(true);	
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new InternetExplorerDriver(cap);
		driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);      
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());     
		alert.authenticateUsing(new UserAndPassword("INOS005753", "mahadev@123"));

	
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
			for(int i=1;i<=3;i++){
			
			alert1.accept();
			
		}
	
		return driver;
	}
	
	private WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");		
		System.setProperty("webdriver.chrome.driver", driverPath+ "chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("nativeEvents", false);    
		cap.setCapability("unexpectedAlertBehaviour", "accept");
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("enable-popup-blocking", true);
		cap.setCapability("enablePersistentHover", true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setJavascriptEnabled(true);	
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		System.out.println("URL:-  "+ appURL);

		driver.navigate().to(appURL);
		System.out.println("URL:-  "+ appURL);
		WebDriverWait wait = new WebDriverWait(driver, 10);      
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());     
		alert.authenticateUsing(new UserAndPassword("inos005753", "mahadev@123"));
		
		return driver;
	}
	
	@Parameters({"browserType", "appURL"})
	@BeforeTest
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@Parameters("TestCase_Name")

	@Test
	
	public void TC_01(String TestCase_Name) throws InterruptedException, IOException, AWTException
	{
		Report_Setup.InitializeReport(TestCase_Name);
		operations_object.IChamp_Login(driver);	
		homepage.IChamp_Click(driver);
		landingPage.IChamp_Life_Insured_Details_MinorIndian(driver);
		landingPage.Select_Product_MinorIndian(driver);
		landingPage.Client_Tab_MinorIndian(driver);
		landingPage.Policy_Tab_MinorIndian(driver);
		landingPage.Rider_Tab_MinorIndian(driver);
		operationseapp.Policy_Tab_MinorIndian(driver);
		operationseapp.Policy_Tab_tobeinsured_MinorIndian(driver);
		operationseapp.BankDetailsTab_Proposer_MinorIndian(driver);
		operationseapp.HealthDetailsTab_Proposer_minorIndian(driver);
		operationseapp.HealthDetailsTab_ToBeInsured_minorIndian(driver);
		operationseapp.IARTab_Insurer_minorIndian(driver);
		operationseapp.Review_AcceptanceTab_minorIndian(driver);
		operationseapp.DocumentUploadTab_Proposer_minorIndian(driver);
		operationseapp.DocumentUploadTab_tobeinsured_minorIndian(driver);
		operationseapp.PaymentTab_minorIndian(driver);
		Report_Setup.extent.endTest(Report_Setup.test);
		Report_Setup.extent.flush();
	}
	
	//@AfterTest
	public void close() throws Exception {
		driver.close();
	}
	}

