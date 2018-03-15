package com.eapp.Reporting;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reporting {	
	static String snappath=null;	
	public static final String snapshotsPath = "./Snapshots/";

public static String captureScreenshot(WebDriver driver){
		
		try{
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //The below method will save the screen shot in d drive with name "screenshot.png"
			String name = scrFile.getName();
            FileUtils.copyFile(scrFile, new File(snapshotsPath+name));
            String newPath = System.getProperty("user.dir") +"/";
            snappath = newPath+snapshotsPath+name;
            
		}catch(Exception e){
			
			System.out.println("Issue with snapshot capture");
			
		}
		return snappath;
	}
	
	public static void Log_Pass(String stepName, String passMessage){
		//Report_Setup.InitializeReport(stepName);

		Report_Setup.test.log(LogStatus.PASS, stepName, passMessage);
        
	}
	
	public static void Log_Fail(String stepName, String failMessage, WebDriver driver) throws InterruptedException{

		Report_Setup.test.log(LogStatus.FAIL, stepName, failMessage);
		Thread.sleep(5000);
		String img = Report_Setup.test.addScreenCapture(captureScreenshot(driver));
		Report_Setup.test.log(LogStatus.INFO, stepName, "Error Snap: " + img);
	}
	
	public static void Log_Pass_with_Screenshot(String stepName, String passMessage, WebDriver driver) throws InterruptedException{
		

		Report_Setup.test.log(LogStatus.PASS, stepName, passMessage);
		Thread.sleep(5000);

		String img = Report_Setup.test.addScreenCapture(captureScreenshot(driver));

		Report_Setup.test.log(LogStatus.INFO, stepName, "Error Snap: " + img);

	}
}
