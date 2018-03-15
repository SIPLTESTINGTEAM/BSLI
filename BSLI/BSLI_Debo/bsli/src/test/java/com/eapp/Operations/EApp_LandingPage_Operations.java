  package com.eapp.Operations;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.eapp.Elements.EApp_LandingPage;
import com.eapp.Elements.IChamp_LandingPage;
import com.eapp.Reporting.Extent_Reporting;

public class EApp_LandingPage_Operations {
		WebDriver driver;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		String desiredPath = "./Datasheet_2.3.xlsx"; 				
		File src = new File(desiredPath);
		EApp_LandingPage landing_Page = new EApp_LandingPage();
		WebElement Sales_Hierarchy_IAgree;
		WebElement Illustration_IAgree;
		WebElement  Existing_Policy ;
		WebElement Aadhar_UID;
		WebElement Personal_Details;
		WebElement Proposer_Personal_Details;
		WebElement Proposer_MiddleName;
		WebElement Insurer_MiddleName;
		WebElement Proposer_Marital_Status;
		WebElement Marital_Status;
		WebElement Relationship;
		WebElement Proposerholdingcitizenship;
		WebElement Proposertaxresident;
		WebElement Proposer_professional_Details;
		WebElement  Proposer_Qualifications;
		WebElement Proposer_occupations;
		WebElement Proposer_Nameofbusiness;
		WebElement Proposer_Nature_Business;
		WebElement Proposer_Type_Organization;
		WebElement  Proposer_Years_Business;
		WebElement Proposer_Annual_Income;
		WebElement Proposer_Pan_Card;
		WebElement PanCard_Validatebutton;
		WebElement Proposer_Agreebutton;
		WebElement Insurer_Personal_Details;
		WebElement Insurer_BirthState;
		WebElement Insurer_Father_Mother_Name;
		WebElement Father_Spouse_Name;
		WebElement Place_Of_Birth_State;
		WebElement Place_Of_Birth_City;
		WebElement Insurer_Nationality;
		WebElement Insurer_livingwith;
		WebElement Insurer_Study;
		WebElement Insurer_Class;
		WebElement Insureer_TelNo_ResNo;
		WebElement Insurer_mobNo;
		WebElement Insurer_AltmobNo;
		WebElement Communication_Address ;
		WebElement Proposer_Address1;
		WebElement Proposer_Address2;
		WebElement Proposer_Address3;
		WebElement Proposer_Area;
		WebElement Proposer_City_Town_Village;
		WebElement Proposer_Pin;
		WebElement Proposer_TelNo_ResNo;
		WebElement Proposer_mobNo;
		WebElement Proposer_AltmobNo;
		WebElement Proposer_Email;
		WebElement Proposer_GetPolicyDoc;
		WebElement Proposer_EIA_Details; 
		WebElement EIA_Details;
		WebElement Insurer_PepToggle;
		WebElement Insurer_Purposeofinsurance;
		WebElement Insurer_Agreebutton; 
		WebElement Existing_Policy_PreviousPolicytab;
		WebElement Insured_concurrentPolicy;
		WebElement Refused_PostponedPolicies;
		WebElement Refused_declined_PostponedPolicy;
		WebElement Familyinsuranceadd;
		WebElement allchildreninsured_notinsured;
		WebElement Fathersexistingpolicy;
		WebElement Mothersexistingpolicy;
		WebElement Brothersexistingpolicy;
		WebElement Sistersexistingpolicy;
		WebElement Agreebutton;
		WebElement policy_payout_addbutton;
		WebElement Account_holder_name;
		WebElement Account_Number;
		WebElement Account_Type;
		WebElement IFSC_Code;
		WebElement Renewal_Policy_addButton;
		WebElement Payment_Method;
		WebElement BankDetails_Agreebutton;
		WebElement PersonalDetailsHealth_addbutton;
		WebElement Proposer_Height_Feet;
		WebElement Proposer_Height_Inch;
		WebElement Proposer_Weight;
		WebElement WeightChange_PastOneYr;
		WebElement Reason_ChangeofWeight;
		WebElement Weight_timeofBirth;
		WebElement WeightChange_ToggleButton;
		WebElement lifStyle_Info_addbutton ;
		WebElement LifestylePlus;
		WebElement LifestylePlus_Travel;
		WebElement LifestylePlus_occupation;
		WebElement LifestylePlus_narcotic;
		WebElement LifestylePlus_alcohol;
		WebElement LifestylePlus_ciagare;
		WebElement HIV_togglebutton;
		WebElement Family_MedHist_addbutton;
		WebElement DiagonsedWithDiseases;
		WebElement Father_age;
		WebElement Father_Health;
		WebElement Mother_age;
		WebElement Mother_Health;
		WebElement Having_Brother;
		WebElement Having_Sister;
		WebElement Sister_age;
		WebElement Sister_Health;
		WebElement MedicalHistory_addbutton;
		WebElement IsOnDiet_togglebutton;
		WebElement ConsultDoctor_togglebutton;
		WebElement ECG_Xray_togglebutton;
		WebElement AdviseForHospital_togglebutton;
		WebElement NeversufferedDisease_chkbox;
		WebElement PhysicalDefect_togglebutton;
		WebElement HealthSymptom_togglebutton;
		WebElement Family_Hist_addbutton;
		WebElement Insurer_Height_Feet;
		WebElement Insurer_Height_Inch;
		WebElement Insurer_Weight;
		WebElement DiagonsedWithDiseases_chkbox;
		WebElement insurability_dec_addbutton;
		WebElement avail_med_ser_button;
		WebElement diagnose_disease_button;
		WebElement diagnose_asthma_button;
		WebElement consult_doctor_button;
		WebElement healthDetails_Agreebutton;
		WebElement Insurer_IAR_MiddleName;
		WebElement Insurer_IAR_NonMedical;
		WebElement Insurer_AgeProof;
		WebElement Insurer_IAR_personallyMet;
		WebElement Insurer_IAR_reference;
		WebElement Insurer_IAR_ClusterMarket;
		WebElement Insurer_IAR_durationinYears;
		WebElement Insurer_IAR_durationinMonths;
		WebElement Insurer_IAR_productoffer;
		WebElement Insurer_IAR_Amountcalculation;
		WebElement IAR_EstimateProposer;
		WebElement  IAR_EstimateInsurer;
		WebElement IAR_investment_Proposer;
		WebElement  IAR_investment_Insurer;
		WebElement IAR_liabilities_Proposer;
		WebElement IAR_liabilities_Insurer;
		WebElement IAR_physicalDefects;
		WebElement IAR_adverseeffects;
		WebElement IAR_Declined_postponed_application;
		WebElement  IAR_FinancialStability;
		WebElement IAR_suspiciousactivity_Report;
		WebElement IAR_other_Remarks;
		WebElement IAR_IAgreebutton;
		WebElement Review_Application_Place;
		WebElement Review_Submitted_button;
		WebElement Review_Enter_OTP;
		WebElement Review_OTP_submit;
		WebElement ID_proof_doc;
		WebElement IDProof_doc_select ;
		WebElement ID_proof_doc_upload;
		WebElement address_proof_doc;
		WebElement AddProof_doc_select;
		WebElement Online_Payment_button;
		WebElement Online_Payment_submit_button;
		WebElement IDProof_agree;
		WebElement IDProof_close;
		WebElement NonMedical_proof_doc;
		WebElement Misc_doc_upload;
		WebElement Photo_upload;
		WebElement  NEFT_doc_upload;
		WebElement cust_Declaration_doc_upload;
		WebElement Central_KYC_doc_upload;
		WebElement ECS_Mandate_doc_upload;
		WebElement NonMed_agree;
		WebElement NonMed_close;
		WebElement PANCard_doc;
		WebElement PANCard_upload;
		WebElement Agree_button;
		WebElement close_button;
		WebElement ABGEmp_doc;
		WebElement ABGEmp_upload;
		WebElement Agree_button_final;
		WebElement close_button_final;
		WebElement Standard_Age_doc;
		WebElement Standard_Age_select;
		WebElement STDage_proof_upload;
		WebElement Agree_button_insurer;
	
		
		
		
			
	@SuppressWarnings("deprecation")
	public void Policy_Tab(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			
			
			//Sales Hierarchy
			Sales_Hierarchy_IAgree=driver.findElement(By.xpath(EApp_LandingPage.Iagree_SalesH)); 	
			Sales_Hierarchy_IAgree.click();
		       Extent_Reporting.Log_Pass("Clicking I agree for Sales Hierarchy","Clicked I agree for Sales Hierarchy");

				Thread.sleep(1000);
				
				//Illustration
				//Scroll
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				Thread.sleep(1000);
				Illustration_IAgree = driver.findElement(By.xpath(EApp_LandingPage.Iagree_Illustration));
				Illustration_IAgree.click();
				Thread.sleep(1000);
			       Extent_Reporting.Log_Pass("Clicking I agree for Illustration","Clicked I agree for Illustration");

				Aadhar_UID = driver.findElement(By.xpath(EApp_LandingPage.Insurer_UID));
				cell = sheet.getRow(6).getCell(57);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String AadharUID = cell.getStringCellValue();
			       System.out.println(AadharUID);	
			       Aadhar_UID.sendKeys(AadharUID);
			
				Thread.sleep(1000);
				Personal_Details = driver.findElement(By.xpath(EApp_LandingPage.personal_Details));
				Personal_Details.click();
				
				Thread.sleep(1000);
				Insurer_MiddleName = driver.findElement(By.xpath(EApp_LandingPage.Insurer_MiddleName));
				cell = sheet.getRow(6).getCell(59);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String InsurerMiddleName = cell.getStringCellValue();
			       System.out.println(InsurerMiddleName);	
			       Insurer_MiddleName.sendKeys(InsurerMiddleName);
		       Extent_Reporting.Log_Pass("Entering Insurer's Middle Name","Entered Insurer's Middle Name");
		       
		       Thread.sleep(1000);
				Marital_Status = driver.findElement(By.xpath(EApp_LandingPage.Insurer_MaritalStatus));
				cell = sheet.getRow(6).getCell(60);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String MaritalStatus = cell.getStringCellValue();
			       System.out.println(MaritalStatus);	
			       Select Marital_Status_Dropdown = new Select(Marital_Status);
			       Marital_Status_Dropdown.selectByValue("Married");
		       Extent_Reporting.Log_Pass("Selecting Marital Status","Selected Marital Status as Married");
		      
		       Thread.sleep(1000);
				Father_Spouse_Name = driver.findElement(By.xpath(EApp_LandingPage.Insurer_FatherName));
				cell = sheet.getRow(6).getCell(61);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String FatherSpouse_Name = cell.getStringCellValue();
			       System.out.println(FatherSpouse_Name);	
			       Father_Spouse_Name.sendKeys(FatherSpouse_Name);
			       Extent_Reporting.Log_Pass("Entering Father/Spouse Name ","Entered Father/Spouse Name as "+FatherSpouse_Name);

			       Thread.sleep(1000);
					Place_Of_Birth_State = driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
					cell = sheet.getRow(6).getCell(62);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String Place_OfBirth_State = cell.getStringCellValue();
				       System.out.println(Place_OfBirth_State);	
				       Place_Of_Birth_State.sendKeys(Place_OfBirth_State);
		       Extent_Reporting.Log_Pass("Entering Place of Birth (State) ","Entered Place of Birth (State) as "+Place_OfBirth_State);
		      
		       Thread.sleep(1000);
				Place_Of_Birth_City = driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
				cell = sheet.getRow(6).getCell(63);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String Place_OfBirth_City = cell.getStringCellValue();
			       System.out.println(Place_OfBirth_City);	
			       Place_Of_Birth_City.sendKeys(Place_OfBirth_City);
	       Extent_Reporting.Log_Pass("Entering Place of Birth (City) ","Entered Place of Birth (City) as "+Place_OfBirth_City);
	      
		       Extent_Reporting.Log_Pass_with_Screenshot("ABG Employee Checkbox Selected", "Entered Employee ID", driver);

		    
		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			e.printStackTrace();
		}
	
}




@SuppressWarnings("deprecation")
public void Policy_Tab_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		
		
		//Sales Hierarchy
		Sales_Hierarchy_IAgree=driver.findElement(By.xpath(EApp_LandingPage.Iagree_SalesH)); 	
		Sales_Hierarchy_IAgree.click();
	       Extent_Reporting.Log_Pass("Clicking I agree for Sales Hierarchy","Clicked I agree for Sales Hierarchy");

			Thread.sleep(1000);
			
			//Illustration
			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			Illustration_IAgree = driver.findElement(By.xpath(EApp_LandingPage.Iagree_Illustration));
			Illustration_IAgree.click();
			Thread.sleep(1000);
		       Extent_Reporting.Log_Pass("Clicking I agree for Illustration","Clicked I agree for Illustration");
		       
		    Existing_Policy = driver.findElement(By.xpath(EApp_LandingPage.Toggle_No_BSLI_Policy));
		    Existing_Policy.click();	
		   
		    
			Aadhar_UID = driver.findElement(By.xpath(EApp_LandingPage.Proposer_UID));
			cell = sheet.getRow(6).getCell(44);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String AadharUID = cell.getStringCellValue();
		       System.out.println(AadharUID);	
		       Aadhar_UID.sendKeys(AadharUID);
		
			Thread.sleep(1000);
			Proposer_Personal_Details = driver.findElement(By.xpath(EApp_LandingPage.personal_Details));
			Proposer_Personal_Details.click();
			
			Thread.sleep(1000);
			Proposer_MiddleName = driver.findElement(By.xpath(EApp_LandingPage.Insurer_MiddleName));
			cell = sheet.getRow(6).getCell(46);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerMiddleName = cell.getStringCellValue();
		       System.out.println(ProposerMiddleName );	
		       Proposer_MiddleName.sendKeys(ProposerMiddleName );
	       Extent_Reporting.Log_Pass("Entering Proposer's Middle Name","Entered Proposer's Middle Name");
	       
	       Thread.sleep(1000);
	      Relationship = driver.findElement(By.xpath(EApp_LandingPage.relationshipwithInsurer));
			cell = sheet.getRow(6).getCell(47);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String Relationship1  = cell.getStringCellValue();
		       System.out.println(Relationship1 );	
		       Select Relationship_Dropdown = new Select(Relationship);
		       Relationship_Dropdown.selectByValue("Parent");
	       Extent_Reporting.Log_Pass("Selecting Relationship with Insurer","Selected Relationship with Insurer as Parent");
	       
	       
	       
	       Thread.sleep(1000);
			Proposer_Marital_Status = driver.findElement(By.xpath(EApp_LandingPage.Proposer_MaritalStatus));
			cell = sheet.getRow(6).getCell(48);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String MaritalStatus = cell.getStringCellValue();
		       System.out.println(MaritalStatus);	
		       Select Proposer_Marital_Status_Dropdown = new Select(Proposer_Marital_Status );
		       Proposer_Marital_Status_Dropdown.selectByValue("Married");
	       Extent_Reporting.Log_Pass("Selecting Marital Status","Selected Marital Status as Married");
	       
	       
	       Proposerholdingcitizenship = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Citizenship_NO));
	       Proposerholdingcitizenship.click();
	       
	       Proposertaxresident =driver.findElement(By.xpath(EApp_LandingPage.Proposer_Tax_Resident_NO));
	       Proposertaxresident.click(); 
	      
	       Thread.sleep(1000);
	       
	       //proposer professional details
	       Proposer_professional_Details=driver.findElement(By.xpath(EApp_LandingPage.proffessional_Details));
	       Proposer_professional_Details.click();
	          
	          //Qualifications
	          Proposer_Qualifications=driver.findElement(By.xpath(EApp_LandingPage.qualification_Dropdown));
	       cell = sheet.getRow(6).getCell(52);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String qualify = cell.getStringCellValue();
	          System.out.println(qualify); 
	          Select qualification1 = new Select( Proposer_Qualifications);
	          qualification1.selectByValue("SSC");
	          Extent_Reporting.Log_Pass("Entering Qualification ","Entered Qualification as "+qualify);
	               
	          //Occupations
	          Proposer_occupations =driver.findElement(By.xpath(EApp_LandingPage.occupation_Dropdown));
	       cell = sheet.getRow(6).getCell(54);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String occupy = cell.getStringCellValue();
	          System.out.println(occupy); 
	          Select occupations1 = new Select(Proposer_occupations);
	          occupations1.selectByValue("Business Owner");
	          Extent_Reporting.Log_Pass("Entering occupations ","Entered occupations as "+occupy);
	          
	          //Name of business
	          Proposer_Nameofbusiness =driver.findElement(By.xpath(EApp_LandingPage.BussEmployerName));
	          cell = sheet.getRow(6).getCell(55);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String Name_business = cell.getStringCellValue();
	          System.out.println(Name_business);
	          Proposer_Nameofbusiness.sendKeys(Name_business);
	          Extent_Reporting.Log_Pass("Entering Name of Business","Entered Name of Business Successfully");
	          
	          //Nature of Business
	          Proposer_Nature_Business =driver.findElement(By.xpath(EApp_LandingPage.NatureofBus));
	          cell = sheet.getRow(6).getCell(56);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String Nature_business = cell.getStringCellValue();
	          System.out.println(Nature_business);
	          Proposer_Nature_Business.sendKeys(Nature_business);
	          Extent_Reporting.Log_Pass("Entering Nature of Business","Entered Nature of Business Successfully");
	          
	          //Type of Organization
	          Proposer_Type_Organization=driver.findElement(By.xpath(EApp_LandingPage.BUsOrganizationType));
	          cell = sheet.getRow(6).getCell(57);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String type_organization = cell.getStringCellValue();
	          System.out.println(type_organization); 
	          Select type_organization1 = new Select(Proposer_Type_Organization);
	          type_organization1.selectByValue("Private Ltd.");
	             Extent_Reporting.Log_Pass("Entering Type_Organization ","Entered Type_Organization as "+type_organization1);
	          
	             //Years in Business
	             Proposer_Years_Business =driver.findElement(By.xpath(EApp_LandingPage.NatureofBus));
	          cell = sheet.getRow(6).getCell(58);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String Years_business = cell.getStringCellValue();
	          System.out.println(Years_business);
	          Proposer_Years_Business.sendKeys(Years_business);
	          Extent_Reporting.Log_Pass("Entering Years of Business","Entered Years of Business Successfully");
	             
	          //Annual Income
	          Proposer_Annual_Income =driver.findElement(By.xpath(EApp_LandingPage.NatureofBus));
	          cell = sheet.getRow(6).getCell(70);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String Annual_income = cell.getStringCellValue();
	          System.out.println(Annual_income);
	          Proposer_Annual_Income.sendKeys(Annual_income);
	          Extent_Reporting.Log_Pass("Entering Annual income","Entered Annual Income Successfully");
	          
	          //PAN
	          Proposer_Pan_Card=driver.findElement(By.xpath(EApp_LandingPage.pan));
	          cell = sheet.getRow(6).getCell(71);
	          cell.setCellType(Cell.CELL_TYPE_STRING);
	          String Pan_card = cell.getStringCellValue();
	          System.out.println(Pan_card);
	          Proposer_Pan_Card.sendKeys(Pan_card);
	          Extent_Reporting.Log_Pass("Entering Pan card","Entered Pan card Successfully");
	          
	        //PAN Card Validate
	          PanCard_Validatebutton = driver.findElement(By.xpath(EApp_LandingPage.validate_Button));
	          PanCard_Validatebutton.click();
	          
	         /*  //Close
	            pan_close =driver.findElement(By.xpath(""));
	            pan_close.click();
	            
	          */
	         
	          
	          
	       //Communication Details
	       Communication_Address = driver.findElement(By.xpath(EApp_LandingPage.Communication_Address));
	       Communication_Address.click();
	       
	       
	       //address1
	       
	       Thread.sleep(1000);
	       Proposer_Address1 = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Address1));
			cell = sheet.getRow(6).getCell(75);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerAddress1  = cell.getStringCellValue();
		       System.out.println(ProposerAddress1);	
		       Proposer_Address1.sendKeys(ProposerAddress1);
	       Extent_Reporting.Log_Pass("Entering Proposer's Address 1","Entered Proposer's Address1");
	       
	     //address2
	       
	       Thread.sleep(1000);
	       Proposer_Address2 = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Address2));
			cell = sheet.getRow(6).getCell(76);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerAddress2  = cell.getStringCellValue();
		       System.out.println(ProposerAddress2);	
		       Proposer_Address2.sendKeys(ProposerAddress2);
	       Extent_Reporting.Log_Pass("Entering Proposer's Address 2","Entered Proposer's Address2");
	       
	       //address3
	       
	       Thread.sleep(1000);
	       Proposer_Address3 = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Address3));
			cell = sheet.getRow(6).getCell(77);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerAddress3  = cell.getStringCellValue();
		       System.out.println(ProposerAddress3);	
		       Proposer_Address3.sendKeys(ProposerAddress3);
	       Extent_Reporting.Log_Pass("Entering Proposer's Address 3","Entered Proposer's Address3");
	       
	       //area
	       Thread.sleep(1000);
	       Proposer_Area= driver.findElement(By.xpath(EApp_LandingPage.Proposer_Area));
			cell = sheet.getRow(6).getCell(78);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerArea  = cell.getStringCellValue();
		       System.out.println(ProposerArea);	
		       Proposer_Area.sendKeys(ProposerArea);
	       Extent_Reporting.Log_Pass("Entering Proposer's Area","Entered Proposer's Area");
	       
	       
	       //city/town/village
	       
	       Thread.sleep(1000);
	       Proposer_City_Town_Village= driver.findElement(By.xpath(EApp_LandingPage.Proposer_city));
			cell = sheet.getRow(6).getCell(79);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerCity  = cell.getStringCellValue();
		       System.out.println(ProposerCity);	
		       Proposer_City_Town_Village.sendKeys(ProposerCity);
	       Extent_Reporting.Log_Pass("Entering Proposer's City","Entered Proposer's City"); 
	       
	       
	       //pin
	       Thread.sleep(1000);
	       Proposer_Pin= driver.findElement(By.xpath(EApp_LandingPage.Proposer_Pin));
			cell = sheet.getRow(6).getCell(80);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerPin  = cell.getStringCellValue();
		       System.out.println(ProposerPin);	
		       Proposer_Pin.sendKeys(ProposerPin);
	       Extent_Reporting.Log_Pass("Entering Proposer's Pin","Entered Proposer's Pin"); 
	       
	       //TelNo/ ResNo
	       
	       Thread.sleep(1000);
	       Proposer_TelNo_ResNo= driver.findElement(By.xpath(EApp_LandingPage.Proposer_Tel_Number));
			cell = sheet.getRow(6).getCell(81);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerTelNo  = cell.getStringCellValue();
		       System.out.println(ProposerTelNo);	
		       Proposer_TelNo_ResNo.sendKeys(ProposerTelNo);
	       Extent_Reporting.Log_Pass("Entering Proposer's Tel No","Entered Proposer's Tel No"); 
	       
	       
	       //mobile no
	       
	       Thread.sleep(1000);
	       Proposer_mobNo= driver.findElement(By.xpath(EApp_LandingPage.Proposer_mobile_Number));
			cell = sheet.getRow(6).getCell(82);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerMobNo  = cell.getStringCellValue();
		       System.out.println(ProposerMobNo);	
		       Proposer_mobNo.sendKeys(ProposerMobNo);
	       Extent_Reporting.Log_Pass("Entering Proposer's Mob No","Entered Proposer's Mob No"); 
	       
	       //alt mob no
	       
	       Thread.sleep(1000);
	       Proposer_AltmobNo = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Alternate_Number));
			cell = sheet.getRow(6).getCell(83);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerAltMobNo  = cell.getStringCellValue();
		       System.out.println(ProposerAltMobNo);	
		       Proposer_AltmobNo.sendKeys(ProposerAltMobNo);
	       Extent_Reporting.Log_Pass("Entering Proposer's Alt Mob No","Entered Proposer's Alt Mob No"); 
	       
	       
	      //emailadd
	       
	       Thread.sleep(1000);
	       Proposer_Email= driver.findElement(By.xpath(EApp_LandingPage.Proposer_emailID));
			cell = sheet.getRow(6).getCell(84);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerEmailid = cell.getStringCellValue();
		       System.out.println(ProposerEmailid);	
		       Proposer_Email.sendKeys(ProposerEmailid);
	       Extent_Reporting.Log_Pass("Entering Proposer's EmailId","Entered Proposer's EmailId"); 
	       
	       
	       Proposer_GetPolicyDoc =driver.findElement(By.xpath(EApp_LandingPage.Get_Email_Toggle1_Yes));
	       Proposer_GetPolicyDoc.click();
	       
	       
	     //EIA Details
	       Thread.sleep(1000);
	       Proposer_EIA_Details = driver.findElement(By.xpath(EApp_LandingPage.EIA_Details));
	       Proposer_EIA_Details.click();   
	       EIA_Details =driver.findElement(By.xpath(EApp_LandingPage.EIA_NO));
	       EIA_Details .click();
	      
	       JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			Proposer_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.IAgree_button));
			Proposer_Agreebutton.click();
	       
			
}
	catch(Exception e)
	{
		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		e.printStackTrace();
	}

}
	
@SuppressWarnings("deprecation")
public void Policy_Tab_tobeinsured_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
			
		 Existing_Policy = driver.findElement(By.xpath(EApp_LandingPage.Toggle_No_BSLI_Policy));
		    Existing_Policy.click();	
		   		
			
		    Thread.sleep(1000);
			Insurer_Personal_Details = driver.findElement(By.xpath(EApp_LandingPage.personal_Details));
			Insurer_Personal_Details.click();
			
			
		//Middle name
			Thread.sleep(1000);
			Insurer_MiddleName = driver.findElement(By.xpath(EApp_LandingPage.Insurer_MiddleName));
			cell = sheet.getRow(6).getCell(93);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String InsurerMiddleName = cell.getStringCellValue();
		       System.out.println(InsurerMiddleName);	
		       Insurer_MiddleName.sendKeys(InsurerMiddleName);
	       Extent_Reporting.Log_Pass("Entering Insurer's Middle Name","Entered Insurer's Middle Name");
	       
	    //place of birthstate
	       
	       Thread.sleep(1000);
			Place_Of_Birth_State = driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
			cell = sheet.getRow(6).getCell(94);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String Place_OfBirth_State = cell.getStringCellValue();
		       System.out.println(Place_OfBirth_State);	
		       Place_Of_Birth_State.sendKeys(Place_OfBirth_State);
      Extent_Reporting.Log_Pass("Entering Place of Birth (State) ","Entered Place of Birth (State) as "+Place_OfBirth_State);
     
      // place of birth city
      
      Thread.sleep(1000);
		Place_Of_Birth_City = driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
		cell = sheet.getRow(6).getCell(95);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String Place_OfBirth_City = cell.getStringCellValue();
	       System.out.println(Place_OfBirth_City);	
	       Place_Of_Birth_City.sendKeys(Place_OfBirth_City);
  Extent_Reporting.Log_Pass("Entering Place of Birth (City) ","Entered Place of Birth (City) as "+Place_OfBirth_City);
 
			//Father/mother name
			
  Insurer_Father_Mother_Name = driver.findElement(By.xpath(EApp_LandingPage.Insurer_FatherName));
	cell = sheet.getRow(6).getCell(96);
     cell.setCellType(Cell.CELL_TYPE_STRING);
     String FatherMother_Name = cell.getStringCellValue();
     System.out.println(FatherMother_Name);	
     Insurer_Father_Mother_Name .sendKeys(FatherMother_Name);
     Extent_Reporting.Log_Pass("Entering Father/Mother Name ","Entered Father/Mother Name as "+FatherMother_Name);
	
     //Nationality
			
     Insurer_Nationality =driver.findElement(By.xpath(EApp_LandingPage.Insurer_Nationality_Dropdown));
     cell = sheet.getRow(6).getCell(97);
     cell.setCellType(Cell.CELL_TYPE_STRING);
     String Nationality = cell.getStringCellValue();
     System.out.println(Nationality); 
     Select Nationality1 = new Select(Insurer_Nationality);
     Nationality1.selectByValue("Indian");
        Extent_Reporting.Log_Pass("Entering Nationality ","Entered Nationality as "+Nationality1);
     	
			//Minor Living with
        
        Insurer_livingwith =driver.findElement(By.xpath(EApp_LandingPage.Insurer_Living_With));
        cell = sheet.getRow(6).getCell(98);
        cell.setCellType(Cell.CELL_TYPE_STRING);
        String Livingwith = cell.getStringCellValue();
        System.out.println(Livingwith); 
        Select Livingwith1 = new Select(Insurer_livingwith);
        Livingwith1.selectByValue("Parents");
       Extent_Reporting.Log_Pass("Entering Insurer living with ","Entered Insurer living with as "+Livingwith);
        	
           JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			
			
		// Insurer Studying in
			
			Insurer_Study = driver.findElement(By.xpath(EApp_LandingPage.Insurer_Study));
			Insurer_Study.click(); 
			cell = sheet.getRow(6).getCell(99);
	        cell.setCellType(Cell.CELL_TYPE_STRING);
	        String StudyPlace = cell.getStringCellValue();
	        System.out.println(StudyPlace); 
	        Extent_Reporting.Log_Pass("Entering Insurer Studied in ","Entered Insurer Studied in as "+StudyPlace);
        	   	
	     //Insurer Class
	        
	       Insurer_Class = driver.findElement(By.xpath(EApp_LandingPage.Insurer_Class));
			cell = sheet.getRow(6).getCell(100);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String InsurerClass = cell.getStringCellValue();
		       System.out.println(InsurerClass);	
		       Insurer_Class.sendKeys(InsurerClass);
	  Extent_Reporting.Log_Pass("Entering Insurer Class","Entered Insurer Class as "+InsurerClass);    
			
	  //Communication Details
      Communication_Address = driver.findElement(By.xpath(EApp_LandingPage.Communication_Address));
      Communication_Address.click();
      
      //TelNo/ ResNo
      
      Thread.sleep(1000);
      Insureer_TelNo_ResNo= driver.findElement(By.xpath(EApp_LandingPage.Insurer_Tel_Res_No));
		cell = sheet.getRow(6).getCell(545);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String InsurerTelNo  = cell.getStringCellValue();
	       System.out.println(InsurerTelNo);	
	       Insureer_TelNo_ResNo.sendKeys(InsurerTelNo);
      Extent_Reporting.Log_Pass("Entering Insurer's Tel No","Entered Insurer's Tel No"); 
      
      
      //mobile no
      
      Thread.sleep(1000);
      Insurer_mobNo= driver.findElement(By.xpath(EApp_LandingPage.Insurer_mobile_Number));
		cell = sheet.getRow(6).getCell(33);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String InsurerMobNo  = cell.getStringCellValue();
	       System.out.println(InsurerMobNo);	
	       Insurer_mobNo.sendKeys(InsurerMobNo);
      Extent_Reporting.Log_Pass("Entering Insurer's Mob No","Entered Insurer's Mob No"); 
      
      //alt mob no
      
      Thread.sleep(1000);
      Insurer_AltmobNo = driver.findElement(By.xpath(EApp_LandingPage.Insurer_AltMob_No));
		cell = sheet.getRow(6).getCell(33);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String InsurerAltMobNo  = cell.getStringCellValue();
	       System.out.println(InsurerAltMobNo);	
	       Insurer_AltmobNo.sendKeys(InsurerAltMobNo  );
      Extent_Reporting.Log_Pass("Entering Proposer's Alt Mob No","Entered Proposer's Alt Mob No"); 
      
    //Other Details
      
      Thread.sleep(1000);
      Insurer_PepToggle = driver.findElement(By.xpath(EApp_LandingPage.Insurer_PEP_Toggle_NO));
      Insurer_PepToggle.click();
      
      //purpose of insurance
      
      Thread.sleep(1000);
      Insurer_Purposeofinsurance = driver.findElement(By.xpath(EApp_LandingPage.Insurer_Purpose_Risk));
      Insurer_Purposeofinsurance.click(); 
		cell = sheet.getRow(6).getCell(114);
      cell.setCellType(Cell.CELL_TYPE_STRING);
      String PurposeofInsurance = cell.getStringCellValue();
      System.out.println(PurposeofInsurance); 
      Extent_Reporting.Log_Pass("Entering Insurer Purpose of insurance is ","Entered Insurer Purpose of insurance is as "+PurposeofInsurance);
  	   	
	//agree button
      
      JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
		Insurer_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.InsurerIAgreeButton));
		Insurer_Agreebutton.click();
	}
	catch(Exception e)
	{
		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		e.printStackTrace();
	}		
		
}


@SuppressWarnings("deprecation")
public void PreviousPolicyDetails_Tab_tobeinsured_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		
		 Existing_Policy_PreviousPolicytab = driver.findElement(By.xpath(EApp_LandingPage.ExistingPolicyAdd));
		 Existing_Policy_PreviousPolicytab.click();	
		 
		 //concurrent policy
		 
		 Thread.sleep(1000);
		 Insured_concurrentPolicy = driver.findElement(By.xpath(EApp_LandingPage.ExistingPolicyNo));
		 Insured_concurrentPolicy.click();
		 Extent_Reporting.Log_Pass("Entering Concurrent Policy ","Entered concurrent policy successfully");
		 Refused_PostponedPolicies =driver.findElement(By.xpath(EApp_LandingPage.PlusSign6));
		 Refused_PostponedPolicies .click();
		
		 //refused policies
		 
		 Thread.sleep(1000);
		 Refused_declined_PostponedPolicy = driver.findElement(By.xpath(EApp_LandingPage.DeclinedPolicyNo));
		 Refused_declined_PostponedPolicy.click();
		 Extent_Reporting.Log_Pass("Entering Postponed_Refused Policy ","Entered Postponed_Refused policy successfully");
		 
// family insurance history

   Thread.sleep(1000);
   Familyinsuranceadd=driver.findElement(By.xpath(EApp_LandingPage.familyinsuranceaddbutton));
   Familyinsuranceadd.click();
   
   
   allchildreninsured_notinsured =driver.findElement(By.xpath(EApp_LandingPage.allinsured));
   allchildreninsured_notinsured.click();
   System.out.println("allchildreninsured");
   Fathersexistingpolicy =driver.findElement(By.xpath(EApp_LandingPage.fathersinsurance));
   Fathersexistingpolicy.click();
   
   Mothersexistingpolicy =driver.findElement(By.xpath(EApp_LandingPage.mothersinsurance));
   Mothersexistingpolicy.click();

   Brothersexistingpolicy =driver.findElement(By.xpath(EApp_LandingPage.brothersinsurance));
   Brothersexistingpolicy.click();

   Sistersexistingpolicy =driver.findElement(By.xpath(EApp_LandingPage.sistersinsurance));
   Sistersexistingpolicy.click();

   JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(1000);
	Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.Iagree3));
	Agreebutton.click();

	}
	catch(Exception e)
	{
		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		e.printStackTrace();
	}

}




@SuppressWarnings("deprecation")
public void BankDetailsTab_Proposer_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		
//PolicyPayoutdetails

		 Thread.sleep(1000);
		 policy_payout_addbutton = driver.findElement(By.xpath(EApp_LandingPage.policypayoutdetailsaddbutton));
		 policy_payout_addbutton.click();
		 
		//Account Holder name
		 Thread.sleep(1000);
	     Account_holder_name = driver.findElement(By.xpath(EApp_LandingPage.AccountHolderNam));
			cell = sheet.getRow(6).getCell(131);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String Accountholdername  = cell.getStringCellValue();
		       System.out.println(Accountholdername);	
		       Account_holder_name.sendKeys(Accountholdername);
	      Extent_Reporting.Log_Pass("Entering Account Holder Name","Entered Account Holder Name" +Accountholdername); 
	      
	      //Account no
	      Thread.sleep(1000);
		     Account_Number = driver.findElement(By.xpath(EApp_LandingPage.AccountNum));
				cell = sheet.getRow(6).getCell(132);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String AccountNo = cell.getStringCellValue();
			       System.out.println(AccountNo);	
			       Account_Number.sendKeys(AccountNo);
		      Extent_Reporting.Log_Pass("Entering Account No","Entered Account No" +AccountNo); 
		   
		   //Account Type 
		      Thread.sleep(1000);
		      Account_Type = driver.findElement(By.xpath(EApp_LandingPage.AccountType));
				cell = sheet.getRow(6).getCell(133);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String AccountType = cell.getStringCellValue();
			       System.out.println(AccountType);	
			       Account_Type.sendKeys(AccountType);
		      Extent_Reporting.Log_Pass("Entering Account Type","Entered Account Type" +AccountType); 
		      
		  //IFSC 
		 Thread.sleep(1000);  
		  IFSC_Code = driver.findElement(By.xpath(EApp_LandingPage.IFSC));
				cell = sheet.getRow(6).getCell(134);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String IFSCCode = cell.getStringCellValue();
			       System.out.println(IFSCCode);	
			       IFSC_Code.sendKeys(IFSCCode);
		      Extent_Reporting.Log_Pass("Entering IFSC Code","Entered IFSC Code" +IFSCCode); 
		         
		 
	// Renewal Premium Payment Details of Proposer
		 
		      
		   Thread.sleep(1000);   
		  Renewal_Policy_addButton = driver.findElement(By.xpath(EApp_LandingPage.PlusSign7));
		  Renewal_Policy_addButton.click();
		  
		  //payment method
		  Thread.sleep(1000);  
		  Payment_Method = driver.findElement(By.xpath(EApp_LandingPage.DirectBill));
				cell = sheet.getRow(6).getCell(136);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String Paymentmethod = cell.getStringCellValue();
			       System.out.println(Paymentmethod);	
			       Payment_Method.sendKeys(Paymentmethod);
		      Extent_Reporting.Log_Pass("Entering Account No","Entered Account No" +Paymentmethod); 
		  
// I agree button

		      JavascriptExecutor jse = (JavascriptExecutor)driver;
		   	jse.executeScript("window.scrollBy(0,250)", "");
		   	Thread.sleep(1000);
		   	BankDetails_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.Iagree4));
		   	BankDetails_Agreebutton.click();

		   	}
		   	catch(Exception e)
		   	{
		   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		   		e.printStackTrace();
		   	}   
		      
}		      



@SuppressWarnings("deprecation")
public void HealthDetailsTab_Proposer_minorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		
		//Personal Details

		 Thread.sleep(1000);
		 PersonalDetailsHealth_addbutton = driver.findElement(By.xpath(EApp_LandingPage.HealthPersonalDetail));
		 PersonalDetailsHealth_addbutton.click();
		 
		//Height in Feet
		 Thread.sleep(1000);
	    Proposer_Height_Feet = driver.findElement(By.xpath(EApp_LandingPage.HeightFt));
			cell = sheet.getRow(6).getCell(143);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String ProposerHeightFeet = cell.getStringCellValue();
		       System.out.println(ProposerHeightFeet);	
		       Proposer_Height_Feet.sendKeys(ProposerHeightFeet);
	      Extent_Reporting.Log_Pass("Entering Proposer Height in Feet","Entered Proposer Height in Feet" +ProposerHeightFeet); 
	      
	    //Height in Inch
			 Thread.sleep(1000);
		    Proposer_Height_Inch = driver.findElement(By.xpath(EApp_LandingPage.HeightInch));
				cell = sheet.getRow(6).getCell(144);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String ProposerHeightInch = cell.getStringCellValue();
			       System.out.println(ProposerHeightInch);	
			       Proposer_Height_Inch.sendKeys(ProposerHeightInch);
		      Extent_Reporting.Log_Pass("Entering Insurer Height in Inch","Entered Insurer Height in Inch" +ProposerHeightInch); 
		     
		      //Weight
	      Thread.sleep(1000);
		     Proposer_Weight = driver.findElement(By.xpath(EApp_LandingPage.Weight));
				cell = sheet.getRow(6).getCell(145);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String InsurerWeight = cell.getStringCellValue();
			       System.out.println(InsurerWeight);	
			       Proposer_Weight.sendKeys(InsurerWeight);
		      Extent_Reporting.Log_Pass("Entering Insurer Weight ","Entered Insurer Weight" +InsurerWeight); 
		   
		      // Toggle for weight change
		      
		      Thread.sleep(1000);
		      WeightChange_ToggleButton = driver.findElement(By.xpath(EApp_LandingPage.Toggle17));
		      WeightChange_ToggleButton.click();	
			       System.out.println("NoWeightchange");	
			       Extent_Reporting.Log_Pass("Entering Weight change","Entered Weight change successfully");       
		      
		         
	      //Lifestyle Information
	      
	      Thread.sleep(1000);
	      lifStyle_Info_addbutton =driver.findElement(By.xpath(EApp_LandingPage.PlusSign8));
	      lifStyle_Info_addbutton.click();
	      
	    //LifeStyle Plus
	      
	      LifestylePlus_Travel=driver.findElement(By.xpath(EApp_LandingPage.Travel));
	      LifestylePlus_Travel.click(); 
	      LifestylePlus_occupation=driver.findElement(By.xpath(EApp_LandingPage.occupation));
	      LifestylePlus_occupation.click();
	      LifestylePlus_narcotic=driver.findElement(By.xpath(EApp_LandingPage.narcotic));
	      LifestylePlus_narcotic.click();
	      LifestylePlus_alcohol=driver.findElement(By.xpath(EApp_LandingPage.alcohol));
	      LifestylePlus_alcohol.click();
	      LifestylePlus_ciagare=driver.findElement(By.xpath(EApp_LandingPage.cigar));
	      LifestylePlus_ciagare.click();
	      
	  //Family Medical History
	      
	      Thread.sleep(1000);
	      Family_MedHist_addbutton =driver.findElement(By.xpath(EApp_LandingPage.PlusSign9));
	      Family_MedHist_addbutton.click();
	      
	      //diagonsed with disease
	      
	      Thread.sleep(1000);  
		  DiagonsedWithDiseases = driver.findElement(By.xpath(EApp_LandingPage.FMHNone));
		  DiagonsedWithDiseases.click();		
		  System.out.println("DiagnosedwithDisease");	
		 Extent_Reporting.Log_Pass("Entering Diagnose with Disease","Entered diagnosed with Disease as none"); 
		   
	    //father age
		 
		 Thread.sleep(1000);  
		  Father_age = driver.findElement(By.xpath(EApp_LandingPage.FatherAge));
				cell = sheet.getRow(6).getCell(157);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String FatherAge = cell.getStringCellValue();
			       System.out.println(FatherAge);	
			       Father_age.sendKeys(FatherAge);
		      Extent_Reporting.Log_Pass("Entering Father age","Entered Father age" +FatherAge); 
		   
	      // father health
		    Father_Health = driver.findElement(By.xpath(EApp_LandingPage.FatherHealthState));
		      cell = sheet.getRow(6).getCell(158);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String FatherHealth = cell.getStringCellValue();
		      System.out.println(FatherHealth); 
		      Select FatherHealth1 = new Select(Father_Health);
		      FatherHealth1.selectByValue("Ok/Good");
		         Extent_Reporting.Log_Pass("Entering Father Health ","Entered Father Health  as "+FatherHealth); 
	      
		 //Mother age
				 
		Thread.sleep(1000);  
		Mother_age = driver.findElement(By.xpath(EApp_LandingPage.MotherAge));
		cell = sheet.getRow(6).getCell(160);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String MotherAge = cell.getStringCellValue();
		System.out.println(MotherAge);	
		Mother_age .sendKeys(MotherAge);
  Extent_Reporting.Log_Pass("Entering Mother age","Entered Mother age" +MotherAge); 
				   
			      // Mother health
				    Mother_Health = driver.findElement(By.xpath(EApp_LandingPage.MotherHealthState));
				      cell = sheet.getRow(6).getCell(161);
				      cell.setCellType(Cell.CELL_TYPE_STRING);
				      String MotherHealth = cell.getStringCellValue();
				      System.out.println(MotherHealth); 
				      Select MotherHealth1 = new Select(Mother_Health);
				      MotherHealth1.selectByValue("Ok/Good");
				         Extent_Reporting.Log_Pass("Entering Mother Health ","Entered Mother Health  as "+MotherHealth); 
			      
	    // brother
				         
	    Having_Brother = driver.findElement(By.xpath(EApp_LandingPage.Toggle23));
	    Having_Brother.click();
	    Extent_Reporting.Log_Pass("Entering Having Brother ","Entered Having Brother as None"); 
	      
	    
	    //Sister
	    
	    Having_Sister =driver.findElement(By.xpath(EApp_LandingPage.ToggleYes));
	    Having_Sister.click();
	    Extent_Reporting.Log_Pass("Entering Having Sister ","Entered Having Sister"); 
	       
	  //Sister age
		 
	  		Thread.sleep(1000);  
	  		Sister_age = driver.findElement(By.xpath(EApp_LandingPage.SisterAge));
	  		cell = sheet.getRow(6).getCell(167);
	  		cell.setCellType(Cell.CELL_TYPE_STRING);
	  		String SisterAge = cell.getStringCellValue();
	  		System.out.println(SisterAge);	
	  		Sister_age .sendKeys(SisterAge);
	    Extent_Reporting.Log_Pass("Entering Sister age","Entered Sister age" +SisterAge); 
	  				   
	  			      // Sister health
	  				    Sister_Health = driver.findElement(By.xpath(EApp_LandingPage.SisterHealthState));
	  				      cell = sheet.getRow(6).getCell(168);
	  				      cell.setCellType(Cell.CELL_TYPE_STRING);
	  				      String SisterHealth = cell.getStringCellValue();
	  				      System.out.println(SisterHealth); 
	  				      Select SisterHealth1 = new Select(Sister_Health);
	  				    SisterHealth1.selectByValue("Ok/Good");
	  				         Extent_Reporting.Log_Pass("Entering Sister Health ","Entered Sister Health  as "+SisterHealth); 
	  			      
		  
	  				         
	  				         //Medical History
	  				         
	  				       Thread.sleep(1000);
	  				      MedicalHistory_addbutton =driver.findElement(By.xpath(EApp_LandingPage.PlusSign10));
	  				    MedicalHistory_addbutton.click();
	  				      		         
	  			// is on diet
	  				  Thread.sleep(1000);
  				      IsOnDiet_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.ToggleNo));
  				    IsOnDiet_togglebutton.click();
  			
  				 // consult doctor
  				    
  				  Thread.sleep(1000);
				      ConsultDoctor_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.consultDoctor_No));
				      ConsultDoctor_togglebutton.click();
				 
				      //ECG/Xray
				      
				      Thread.sleep(1000);
				      ECG_Xray_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.ECG_NO));
				      ECG_Xray_togglebutton.click();
				  
				// advise to admit hospital
				      Thread.sleep(1000);
				      AdviseForHospital_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.Advise_for_Hospital_No));
				      AdviseForHospital_togglebutton.click();
	  				         
	  		//never suffered disease
				      Thread.sleep(1000);
				      NeversufferedDisease_chkbox =driver.findElement(By.xpath(EApp_LandingPage.never_suffered_chkbox));
				      NeversufferedDisease_chkbox.click();   
			//Physical Defect
				      Thread.sleep(1000);
				      PhysicalDefect_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.physicalDefect_No));
				      PhysicalDefect_togglebutton.click();    
	  		//health symptom complaint
				      Thread.sleep(1000);
				      HealthSymptom_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.health_symptom_No));
				      HealthSymptom_togglebutton.click();       
	  		//HIV
				      Thread.sleep(1000);
				      HIV_togglebutton =driver.findElement(By.xpath(EApp_LandingPage.HIV_No));
				      HIV_togglebutton.click();          
		  //Agree button
				      
				      JavascriptExecutor jse = (JavascriptExecutor)driver;
				  	jse.executeScript("window.scrollBy(0,250)", "");
				  	Thread.sleep(1000);
				  	Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.Iagree5));
				  	Agreebutton.click();   
				      
				      
//I agree button

		      JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		   	jse1.executeScript("window.scrollBy(0,250)", "");
		   	Thread.sleep(1000);
		   	BankDetails_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.Iagree4));
		   	BankDetails_Agreebutton.click();

		   	}
		   	catch(Exception e)
		   	{
		   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		   		e.printStackTrace();
		   	}   
		      
}

@SuppressWarnings("deprecation")
public void HealthDetailsTab_ToBeInsured_minorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		
		//Personal Details

		 Thread.sleep(1000);
		 PersonalDetailsHealth_addbutton = driver.findElement(By.xpath(EApp_LandingPage.HealthPersonalDetail));
		 PersonalDetailsHealth_addbutton.click();
		 
		//Height in Feet
		 Thread.sleep(1000);
	    Insurer_Height_Feet = driver.findElement(By.xpath(EApp_LandingPage.HeightFt));
			cell = sheet.getRow(6).getCell(197);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String InsurerHeightFeet = cell.getStringCellValue();
		       System.out.println(InsurerHeightFeet);	
		       Insurer_Height_Feet.sendKeys(InsurerHeightFeet);
	      Extent_Reporting.Log_Pass("Entering Insurer Height in Feet","Entered Insurer Height in Feet" +InsurerHeightFeet); 
	      
	    //Height in Inch
			 Thread.sleep(1000);
		    Insurer_Height_Inch = driver.findElement(By.xpath(EApp_LandingPage.HeightInch));
				cell = sheet.getRow(6).getCell(198);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String InsurerHeightInch = cell.getStringCellValue();
			       System.out.println(InsurerHeightInch);	
			       Insurer_Height_Inch.sendKeys(InsurerHeightInch);
		      Extent_Reporting.Log_Pass("Entering Insurer Height in Inch","Entered Insurer Height in Inch" +InsurerHeightInch); 
		     
		      //Weight
	      Thread.sleep(1000);
		     Insurer_Weight = driver.findElement(By.xpath(EApp_LandingPage.Weight));
				cell = sheet.getRow(6).getCell(199);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String InsurerWeight = cell.getStringCellValue();
			       System.out.println(InsurerWeight);	
			       Insurer_Weight.sendKeys(InsurerWeight);
		      Extent_Reporting.Log_Pass("Entering Insurer Weight ","Entered Insurer Weight" +InsurerWeight); 
		   
		    /*  // Toggle for weight change
		      
		      Thread.sleep(1000);
		      WeightChange_ToggleButton = driver.findElement(By.xpath(EApp_LandingPage.Toggle17));
		      WeightChange_ToggleButton.click();	
			       System.out.println("Weightchange");	
			       Extent_Reporting.Log_Pass("Entering Weight change","Entered Weight change successfully");       
		    */
			       
				   //Weight change past one year
				      Thread.sleep(1000);
				      WeightChange_PastOneYr = driver.findElement(By.xpath(EApp_LandingPage.Weight_Change_inKG));
						cell = sheet.getRow(6).getCell(200);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String Weightchangeoneyear = cell.getStringCellValue();
					       System.out.println(Weightchangeoneyear);	
					       WeightChange_PastOneYr.sendKeys(Weightchangeoneyear);
				      Extent_Reporting.Log_Pass("Entering Weight change for last one year","Entered Weight change for last one year" +Weightchangeoneyear); 
				      
				  //Reasons For change
				 Thread.sleep(1000);  
				  Reason_ChangeofWeight= driver.findElement(By.xpath(EApp_LandingPage.WeightChanDetails));
						cell = sheet.getRow(6).getCell(201);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String ReasonForChange = cell.getStringCellValue();
					       System.out.println(ReasonForChange);	
					       Reason_ChangeofWeight.sendKeys(ReasonForChange);
				      Extent_Reporting.Log_Pass("Entering Reason for weight Change","Entered Reason for weight Change" +ReasonForChange); 
				         
				 
			// Weight At time of Birth
				 
				   Thread.sleep(1000);   
				   Weight_timeofBirth= driver.findElement(By.xpath(EApp_LandingPage.Weight_timeofBirth));
					cell = sheet.getRow(6).getCell(202);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String WeightatTimeofBirth = cell.getStringCellValue();
				       System.out.println( WeightatTimeofBirth );	
				       Weight_timeofBirth.sendKeys( WeightatTimeofBirth );
			      Extent_Reporting.Log_Pass("Entering Weight at the Time of Birth","Entered Weight at the Time of Birth" + WeightatTimeofBirth ); 

			    //Family Medical History
			      
			      Thread.sleep(1000);
			      Family_Hist_addbutton =driver.findElement(By.xpath(EApp_LandingPage.Family_History_addbutton));
			      Family_Hist_addbutton.click();
			      
			      //diagonsed with disease
			      
			      Thread.sleep(1000);  
				  DiagonsedWithDiseases_chkbox = driver.findElement(By.xpath(EApp_LandingPage.None_button));
				  DiagonsedWithDiseases_chkbox.click();		
				  System.out.println("DiagnosedwithDisease");	
				 Extent_Reporting.Log_Pass("Entering Diagnose with Disease","Entered diagnosed with Disease as none"); 
				   
				//insurability declaration
			      
			      Thread.sleep(1000);
			      insurability_dec_addbutton =driver.findElement(By.xpath(EApp_LandingPage.insurability_button));
			      insurability_dec_addbutton.click();	 
				 
			    //avail medical service
			      Thread.sleep(1000);
			      avail_med_ser_button =driver.findElement(By.xpath(EApp_LandingPage.availed_medical_service_no));
			      avail_med_ser_button.click();
			      
			     //diagnose disease
			      Thread.sleep(1000);
			      diagnose_disease_button =driver.findElement(By.xpath(EApp_LandingPage.diagnose_with_disease_no));
			      diagnose_disease_button.click();
			      
			      //diagnose asthma
			      Thread.sleep(1000);
			      diagnose_asthma_button =driver.findElement(By.xpath(EApp_LandingPage.diagnose_asthma_no));
			      diagnose_asthma_button.click();
			      
			      //consult doctor
			      Thread.sleep(1000);
			      consult_doctor_button =driver.findElement(By.xpath(EApp_LandingPage.consult_doctor_no));
			      consult_doctor_button.click();
			      
			      
			      
			      //I agree button

			  					      JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			  					   	jse1.executeScript("window.scrollBy(0,250)", "");
			  					   	Thread.sleep(1000);
			  					   	healthDetails_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.agree_insurer_health));
			  					   	healthDetails_Agreebutton.click();

			  					   	}
			  					   	catch(Exception e)
			  					   	{
			  					   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			  					   		e.printStackTrace();
			  					   	}   		  
}
	
	
	@SuppressWarnings("deprecation")
	public void IARTab_Insurer_minorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			
		//middle name insurer 	
			Thread.sleep(1000);
			Insurer_IAR_MiddleName = driver.findElement(By.xpath(EApp_LandingPage.middleName));
			cell = sheet.getRow(6).getCell(211);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String InsurerIARMiddleName = cell.getStringCellValue();
		       System.out.println(InsurerIARMiddleName);	
		       Insurer_IAR_MiddleName.sendKeys(InsurerIARMiddleName);
	       Extent_Reporting.Log_Pass("Entering Insurer's Middle Name","Entered Insurer's Middle Name" +InsurerIARMiddleName);
	       
	       //non medical
	       Thread.sleep(1000);
			Insurer_IAR_NonMedical = driver.findElement(By.xpath(EApp_LandingPage.nonMedical));
			Insurer_IAR_NonMedical.click();
			   System.out.println(Insurer_IAR_NonMedical);	
		      
	     Extent_Reporting.Log_Pass("Entering Insurer's Non Medical Value","Entered Insurer's Non Medical submitted successfully");
	       
	     
	     // age proof
	     
	     Insurer_AgeProof = driver.findElement(By.xpath(EApp_LandingPage.ageProof_Dropdown));
	      cell = sheet.getRow(6).getCell(214);
	      cell.setCellType(Cell.CELL_TYPE_STRING);
	      String AgeProof = cell.getStringCellValue();
	      System.out.println(AgeProof); 
	      Select AgeProof1 = new Select(Insurer_AgeProof);
	      AgeProof1.selectByValue("Passport");
	         Extent_Reporting.Log_Pass("Entering Age Proof ","Entered Age Proof is as "+AgeProof); 
     
	     //personally met
	         Insurer_IAR_personallyMet = driver.findElement(By.xpath(EApp_LandingPage.Toggle_IAR_Yes));
	         Insurer_IAR_personallyMet.click();
				   System.out.println(Insurer_IAR_personallyMet);	
			      
		     Extent_Reporting.Log_Pass("Entering Insurer personally met for application","Entered Insurer personally met for application submitted successfully");
		       
	//reference 
		     Insurer_IAR_reference = driver.findElement(By.xpath(EApp_LandingPage.applicant_Request));
		     Insurer_IAR_reference.click();
		     System.out.println("Insurer_IAR_Reference");
		     Extent_Reporting.Log_Pass("Entering Insurer Referrence","Entered Insurer Reference" );
		     
		 //cluster market
		     Thread.sleep(1000);
				Insurer_IAR_ClusterMarket = driver.findElement(By.xpath(EApp_LandingPage.clusterName));
				cell = sheet.getRow(6).getCell(217);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String InsurerIARClusterMarket = cell.getStringCellValue();
			       System.out.println(InsurerIARClusterMarket);	
			       Insurer_IAR_ClusterMarket.sendKeys(InsurerIARClusterMarket);
		       Extent_Reporting.Log_Pass("Entering Cluster Market","Entered Cluster Market" +InsurerIARClusterMarket);
		     
		       JavascriptExecutor jse = (JavascriptExecutor)driver;
				   	jse.executeScript("window.scrollBy(0,250)", "");
				   	Thread.sleep(1000);
				       
		  
				   	
		//known insurer in years
				    Thread.sleep(1000);
					Insurer_IAR_durationinYears = driver.findElement(By.xpath(EApp_LandingPage.years));
					cell = sheet.getRow(6).getCell(218);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String InsurerIARdurationyears = cell.getStringCellValue();
				       System.out.println(InsurerIARdurationyears);	
				       Insurer_IAR_durationinYears.sendKeys(InsurerIARdurationyears);
			       Extent_Reporting.Log_Pass("Entering duration of Knowing Insurer in Years","Entered duration of knowing Insurer in Years " +InsurerIARdurationyears);
			     
				   
			  //Known insurer in months      
			       Thread.sleep(1000);
					Insurer_IAR_durationinMonths = driver.findElement(By.xpath(EApp_LandingPage.months));
					cell = sheet.getRow(6).getCell(219);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String InsurerIARdurationmonths = cell.getStringCellValue();
				       System.out.println(InsurerIARdurationmonths);	
				       Insurer_IAR_durationinMonths.sendKeys(InsurerIARdurationmonths);
			       Extent_Reporting.Log_Pass("Entering duration of Knowing Insurer in Months","Entered duration of knowing Insurer in Months " +InsurerIARdurationmonths);
			        	
		     // Product offer
			       Insurer_IAR_productoffer = driver.findElement(By.xpath(EApp_LandingPage.protection));
			       Insurer_IAR_productoffer.click();
				     System.out.println("Insurer_IAR_productoffer");
				     Extent_Reporting.Log_Pass("Entering product offers to Insurer ","Entered product offers to Insurer" +Insurer_IAR_productoffer);
				
			//amount calculation process
				     Thread.sleep(1000);
						Insurer_IAR_Amountcalculation = driver.findElement(By.xpath(EApp_LandingPage.howCalculate));
						cell = sheet.getRow(6).getCell(221);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String InsurerIARAmountCalculation = cell.getStringCellValue();
					       System.out.println(InsurerIARAmountCalculation);	
					       Insurer_IAR_Amountcalculation.sendKeys(InsurerIARAmountCalculation);
				       Extent_Reporting.Log_Pass("Entering calculation process of Amount","Entered calculation process of Amount " +InsurerIARAmountCalculation);
				        	    
			//financial details
				   //Realistic estimate proposer
				       
				       Thread.sleep(1000);
						IAR_EstimateProposer = driver.findElement(By.xpath(EApp_LandingPage.realistic_Estimate_Proposer));
						cell = sheet.getRow(6).getCell(223);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IAREstimateProposer = cell.getStringCellValue();
					       System.out.println(IAREstimateProposer);	
					       IAR_EstimateProposer.sendKeys(IAREstimateProposer);
				       Extent_Reporting.Log_Pass("Entering Realistic Estimate for Proposer","Entered Realistic Estimate for Proposer " +IAREstimateProposer);
				        	    
				    //Realistic estimate insurer   
				       
				       Thread.sleep(1000);
				       IAR_EstimateInsurer = driver.findElement(By.xpath(EApp_LandingPage.realistic_Estimate_Insurer));
						cell = sheet.getRow(6).getCell(224);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IAREstimateInsurer = cell.getStringCellValue();
					       System.out.println(IAREstimateInsurer);	
					       IAR_EstimateInsurer.sendKeys(IAREstimateInsurer);
				       Extent_Reporting.Log_Pass("Entering Realistic Estimate for Insurer","Entered Realistic Estimate for Insurer " +IAREstimateInsurer);
				        	    
				  //Investments proposer
				       Thread.sleep(1000);
						IAR_investment_Proposer = driver.findElement(By.xpath(EApp_LandingPage.Investment_Proposer));
						cell = sheet.getRow(6).getCell(226);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IARInvestmentProposer = cell.getStringCellValue();
					       System.out.println(IARInvestmentProposer);	
					       IAR_investment_Proposer.sendKeys(IARInvestmentProposer);
				       Extent_Reporting.Log_Pass("Entering Investment of Proposer","Entered Investment of Proposer" +IARInvestmentProposer);
				        	    
				       //Investment insurer
				       Thread.sleep(1000);
				       IAR_investment_Insurer= driver.findElement(By.xpath(EApp_LandingPage.Investment_Insurer));
						cell = sheet.getRow(6).getCell(227);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IARInvestmentInsurer = cell.getStringCellValue();
					       System.out.println(IARInvestmentInsurer);	
					       IAR_investment_Insurer.sendKeys(IARInvestmentInsurer);
				       Extent_Reporting.Log_Pass("Entering Insurer's Investments","Entered Insurer's Investments	 " +IARInvestmentInsurer);
				        	  
				       //Liabilities proposer
				       Thread.sleep(1000);
						IAR_liabilities_Proposer = driver.findElement(By.xpath(EApp_LandingPage.liabilities_Proposer));
						cell = sheet.getRow(6).getCell(229);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IARLiabilitiesProposer = cell.getStringCellValue();
					       System.out.println(IARLiabilitiesProposer);	
					       IAR_liabilities_Proposer.sendKeys(IARLiabilitiesProposer);
				       Extent_Reporting.Log_Pass("Entering Liabilities of Proposer","Entered Liabilities of Proposer" +IARLiabilitiesProposer);
				        	    
				       
				       //Liabilities insurer
				       Thread.sleep(1000);
				       IAR_liabilities_Insurer = driver.findElement(By.xpath(EApp_LandingPage.howCalculate));
						cell = sheet.getRow(6).getCell(230);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String IARLiabilitiesInsurer = cell.getStringCellValue();
					       System.out.println(IARLiabilitiesInsurer);	
					       IAR_liabilities_Insurer.sendKeys(IARLiabilitiesInsurer);
				       Extent_Reporting.Log_Pass("Entering Insurer's Liabilities ","Entered Insurer's Liabilities " +IARLiabilitiesInsurer);
				        	    
				//Questions
				       
				       IAR_physicalDefects = driver.findElement(By.xpath(EApp_LandingPage.Toggle2_IAR_No));
				       IAR_physicalDefects.click();
					     System.out.println("IAR_physicalDefects");
					     Extent_Reporting.Log_Pass("Entering Insurer's Physical Defects Information ","Entered Insurer's Physical Defects Information" +IAR_physicalDefects);
					       
				       
					     IAR_adverseeffects = driver.findElement(By.xpath(EApp_LandingPage.Toggle3_IAR_No));
					     IAR_adverseeffects.click();
						     System.out.println("IAR_adverseeffects");
						     Extent_Reporting.Log_Pass("Entering Insurer's adverse Effect Information ","Entered Insurer's adverse Effect Information" +IAR_adverseeffects);
						          
						     IAR_Declined_postponed_application = driver.findElement(By.xpath(EApp_LandingPage.Toggle4_IAR_No));
						     IAR_Declined_postponed_application .click();
							     System.out.println("IAR_Declined_postponed_application ");
							     Extent_Reporting.Log_Pass("Entering Insurer's Declined/postponed application Information ","Entered Insurer's Declined/postponed application Information" +IAR_Declined_postponed_application );
							       
							     IAR_FinancialStability = driver.findElement(By.xpath(EApp_LandingPage.Toggle5_IAR_Yes));
							     IAR_FinancialStability.click();
								     System.out.println("IAR_FinancialStability");
								     Extent_Reporting.Log_Pass("Entering Insurer's Financial stability Information ","Entered Insurer's Financial stability Information" +IAR_FinancialStability);
								       
				       
								     IAR_suspiciousactivity_Report= driver.findElement(By.xpath(EApp_LandingPage.Toggle6_IAR_No));
								     IAR_suspiciousactivity_Report.click();
									     System.out.println(" IAR_suspiciousactivity_Report");
									     Extent_Reporting.Log_Pass("Entering Insurer's Suspicious activity Information ","Entered Insurer's  Suspicious activity  Information" + IAR_suspiciousactivity_Report);
									       
				       //Remarks
						 Thread.sleep(1000);
					 IAR_other_Remarks = driver.findElement(By.xpath(EApp_LandingPage.otherRemarks));
						cell = sheet.getRow(6).getCell(236);
						cell.setCellType(Cell.CELL_TYPE_STRING);
				       String IAROtherRemarks = cell.getStringCellValue();
				      System.out.println(IAROtherRemarks);	
				      IAR_other_Remarks.sendKeys(IAROtherRemarks);
		       Extent_Reporting.Log_Pass("Entering Other Remarks ","Entered Other Remarks " +IAROtherRemarks);
									        	       
				       
				//I agree button       
				       
		       JavascriptExecutor jse1 = (JavascriptExecutor)driver;
				   	jse1.executeScript("window.scrollBy(0,250)", "");
				   	Thread.sleep(1000);
				   	IAR_IAgreebutton = driver.findElement(By.xpath(EApp_LandingPage.IAR_IAgree));
					IAR_IAgreebutton.click();

				   	}
				   	catch(Exception e)
				   	{
				   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
				   		e.printStackTrace();
				   	}   		  
}			       
				       
				       
				       
	@SuppressWarnings("deprecation")
	public void Review_AcceptanceTab_minorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
	// Application place	
			 Thread.sleep(1000);
				Review_Application_Place = driver.findElement(By.xpath(EApp_LandingPage.applicationPlace));
				cell = sheet.getRow(6).getCell(238);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String ApplicationPlace = cell.getStringCellValue();
			       System.out.println(ApplicationPlace);	
			       Review_Application_Place.sendKeys(ApplicationPlace);
		       Extent_Reporting.Log_Pass("Entering Insurer's Application Place","Entered Insurer's Application Place " +ApplicationPlace);
		   
		       //Review & submitted button
		       Thread.sleep(1000);
				Review_Submitted_button = driver.findElement(By.xpath(EApp_LandingPage.final_button));
				Review_Submitted_button.click();
				 Extent_Reporting.Log_Pass("Entering Insurer's Application submission","Entered Insurer's Application submission successfully ");
		
		//Enter otp
				 
				 Thread.sleep(1000);
					Review_Enter_OTP = driver.findElement(By.xpath(EApp_LandingPage.otp_input));
					cell = sheet.getRow(6).getCell(240);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String EnterOTP = cell.getStringCellValue();
				       System.out.println(EnterOTP);	
				       Review_Enter_OTP.sendKeys(EnterOTP);
			       Extent_Reporting.Log_Pass("Entering Application submission OTP","Entered Application submission OTP" +EnterOTP);
			   
			//otp submit
			       Thread.sleep(1000);
					Review_OTP_submit = driver.findElement(By.xpath(EApp_LandingPage.otp_click));
					Review_OTP_submit.click();
					 Extent_Reporting.Log_Pass("Entering OTP submit","Entered OTP submit successfully ");
			   
		}
	   	catch(Exception e)
	   	{
	   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
	   		e.printStackTrace();
	   	}   		  
	}			    
	
@SuppressWarnings("deprecation")
	public void DocumentUploadTab_Proposer_minorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
		
	
	//identity proof
			 Thread.sleep(1000);
				ID_proof_doc = driver.findElement(By.xpath(EApp_LandingPage.identity_Proof));
				ID_proof_doc.click();
				 Extent_Reporting.Log_Pass("Entering ID proof Doc","Entered ID proof");
		
				 //select id proof doc	 
				 Thread.sleep(1000);
					IDProof_doc_select = driver.findElement(By.xpath(EApp_LandingPage.typeOfDocument));
					cell = sheet.getRow(6).getCell(243);
				      cell.setCellType(Cell.CELL_TYPE_STRING);
				      String IDProofDoc = cell.getStringCellValue();
				      System.out.println(IDProofDoc); 
				      Select IDProofDoc1 = new Select(IDProof_doc_select);
				      IDProofDoc1.selectByValue("Passport");
				         Extent_Reporting.Log_Pass("Entering Age Proof ","Entered Age Proof is as "+IDProofDoc); 
			     
					//Browse click
				         Thread.sleep(1000);
							ID_proof_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.browseButton));
							ID_proof_doc_upload.click();
							 Extent_Reporting.Log_Pass("Entering ID proof Doc upload","ID proof doc uploaded successfully");
				//doc find 
				
			Thread.sleep(500);
	  
		StringSelection ss = new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

						      //imitate mouse events like ENTER, CTRL+C, CTRL+V
						      Robot robot = new Robot();
						      robot.delay(250);
						      robot.keyPress(KeyEvent.VK_ENTER);
						      robot.keyRelease(KeyEvent.VK_ENTER);
						      robot.keyPress(KeyEvent.VK_CONTROL);
						      robot.keyPress(KeyEvent.VK_V);
						      robot.keyRelease(KeyEvent.VK_V);
						      robot.keyRelease(KeyEvent.VK_CONTROL);
						      robot.keyPress(KeyEvent.VK_ENTER);
						      robot.delay(50);
						      robot.keyRelease(KeyEvent.VK_ENTER); 
		   	
			//Agree button
						Thread.sleep(1000); 
						IDProof_agree =driver.findElement(By.xpath(EApp_LandingPage.agree_button));
						IDProof_agree.click();
			//close 
						Thread.sleep(1000);
						IDProof_close =driver.findElement(By.xpath(EApp_LandingPage.close_button));
						IDProof_close.click();
	/*					      
						      
    //address proof		
						      Thread.sleep(1000);
								address_proof_doc = driver.findElement(By.xpath(EApp_LandingPage.ageProof));
								address_proof_doc.click();
								 Extent_Reporting.Log_Pass("Entering Address proof Doc","Entered Address proof");
						
								 //select add proof doc	 
								 
								 Thread.sleep(1000);
									ADDProof_doc_select = driver.findElement(By.xpath(EApp_LandingPage.typeOfDocument));
									cell = sheet.getRow(6).getCell(243);
								      cell.setCellType(Cell.CELL_TYPE_STRING);
								      String ADDProofDoc = cell.getStringCellValue();
								      System.out.println(ADDProofDoc); 
								      Select ADDProofDoc1 = new Select(ADDProof_doc_select);
								      ADDProofDoc1.selectByValue("Passport");
								         Extent_Reporting.Log_Pass("Entering Add Proof ","Entered Add Proof is as "+ADDProofDoc); 
							     
									//Browse click
								         Thread.sleep(1000);
											ADD_proof_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.browseButton3));
											ADD_proof_doc_upload.click();
											 Extent_Reporting.Log_Pass("Entering ADD proof Doc upload","ADD proof doc uploaded successfully");
				//Browse doc
											 Thread.sleep(500);
											  
												StringSelection ss1 = new StringSelection("");
												Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

																      //imitate mouse events like ENTER, CTRL+C, CTRL+V
																      Robot robot1 = new Robot();
																      robot1.delay(250);
																      robot1.keyPress(KeyEvent.VK_ENTER);
																      robot1.keyRelease(KeyEvent.VK_ENTER);
																      robot1.keyPress(KeyEvent.VK_CONTROL);
																      robot1.keyPress(KeyEvent.VK_V);
																      robot1.keyRelease(KeyEvent.VK_V);
																      robot1.keyRelease(KeyEvent.VK_CONTROL);
																      robot1.keyPress(KeyEvent.VK_ENTER);
																      robot1.delay(50);
																      robot1.keyRelease(KeyEvent.VK_ENTER); 
					*/							   	
	//non medical requirements
Thread.sleep(1000);
NonMedical_proof_doc = driver.findElement(By.xpath(EApp_LandingPage.nonMedicalRequirements));
NonMedical_proof_doc.click();
Extent_Reporting.Log_Pass("Entering Non medical Doc","Entered Non medical proof");
																														      
			//misc form

Thread.sleep(1000);
Misc_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.miscellaneous_Document));
Misc_doc_upload.click();

Thread.sleep(500);

StringSelection ss2 = new StringSelection("");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

				      //imitate mouse events like ENTER, CTRL+C, CTRL+V
				      Robot robot2 = new Robot();
				      robot2.delay(250);
				      robot2.keyPress(KeyEvent.VK_ENTER);
				      robot2.keyRelease(KeyEvent.VK_ENTER);
				      robot2.keyPress(KeyEvent.VK_CONTROL);
				      robot2.keyPress(KeyEvent.VK_V);
				      robot2.keyRelease(KeyEvent.VK_V);
				      robot2.keyRelease(KeyEvent.VK_CONTROL);
				      robot2.keyPress(KeyEvent.VK_ENTER);
				      robot2.delay(50);
				      robot2.keyRelease(KeyEvent.VK_ENTER); 
   //photograph	
				      Thread.sleep(1000);
				      Photo_upload = driver.findElement(By.xpath(EApp_LandingPage.photograph));
				      Photo_upload.click();

				      Thread.sleep(500);

				      StringSelection ss3 = new StringSelection("");
				      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);

				      				      //imitate mouse events like ENTER, CTRL+C, CTRL+V
				      				      Robot robot3 = new Robot();
				      				      robot3.delay(250);
				      				      robot3.keyPress(KeyEvent.VK_ENTER);
				      				      robot3.keyRelease(KeyEvent.VK_ENTER);
				      				      robot3.keyPress(KeyEvent.VK_CONTROL);
				      				      robot3.keyPress(KeyEvent.VK_V);
				      				      robot3.keyRelease(KeyEvent.VK_V);
				      				      robot3.keyRelease(KeyEvent.VK_CONTROL);
				      				      robot3.keyPress(KeyEvent.VK_ENTER);
				      				      robot3.delay(50);
				      				      robot3.keyRelease(KeyEvent.VK_ENTER); 
		
				      				      
			//NEFT 
				      				 Thread.sleep(1000);
				  				      NEFT_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.neft_Cancelled_Cheque));
				  				    NEFT_doc_upload.click();

				  				      Thread.sleep(500);

				  				      StringSelection ss4 = new StringSelection("");
				  				      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);

				  				      				      //imitate mouse events like ENTER, CTRL+C, CTRL+V
				  				      				      Robot robot4 = new Robot();
				  				      				      robot4.delay(250);
				  				      				      robot4.keyPress(KeyEvent.VK_ENTER);
				  				      				      robot4.keyRelease(KeyEvent.VK_ENTER);
				  				      				      robot4.keyPress(KeyEvent.VK_CONTROL);
				  				      				      robot4.keyPress(KeyEvent.VK_V);
				  				      				      robot4.keyRelease(KeyEvent.VK_V);
				  				      				      robot4.keyRelease(KeyEvent.VK_CONTROL);
				  				      				      robot4.keyPress(KeyEvent.VK_ENTER);
				  				      				      robot4.delay(50);
				  				      				      robot4.keyRelease(KeyEvent.VK_ENTER); 	      				      
	
				 //cust dec form
				  				      				  
				  					  				      				      
				   Thread.sleep(1000);
				 cust_Declaration_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.miscellaneous_Document));
				 cust_Declaration_doc_upload.click();

				Thread.sleep(500);

								  		 StringSelection ss5 = new StringSelection("");
								  			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);

								  				      				      //imitate mouse events like ENTER, CTRL+C, CTRL+V
								  				      				      Robot robot5 = new Robot();
								  				      				      robot5.delay(250);
								  				      				      robot5.keyPress(KeyEvent.VK_ENTER);
								  				      				      robot5.keyRelease(KeyEvent.VK_ENTER);
								  				      				      robot5.keyPress(KeyEvent.VK_CONTROL);
								  				      				      robot5.keyPress(KeyEvent.VK_V);
								  				      				      robot5.keyRelease(KeyEvent.VK_V);
								  				      				      robot5.keyRelease(KeyEvent.VK_CONTROL);
								  				      				      robot5.keyPress(KeyEvent.VK_ENTER);
								  				      				      robot5.delay(50);
								  				      				      robot5.keyRelease(KeyEvent.VK_ENTER); 				      				      
				  	//central KYC
		 Thread.sleep(1000);
		Central_KYC_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.central_KYC_form));
		Central_KYC_doc_upload.click();

	Thread.sleep(500);

 StringSelection ss6= new StringSelection("");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
 
//imitate mouse events like ENTER, CTRL+C, CTRL+V
	      Robot robot6= new Robot();
	      robot6.delay(250);
	      robot6.keyPress(KeyEvent.VK_ENTER);
	      robot6.keyRelease(KeyEvent.VK_ENTER);
	      robot6.keyPress(KeyEvent.VK_CONTROL);
	      robot6.keyPress(KeyEvent.VK_V);
	      robot6.keyRelease(KeyEvent.VK_V);
	      robot6.keyRelease(KeyEvent.VK_CONTROL);
	      robot6.keyPress(KeyEvent.VK_ENTER);
	      robot6.delay(50);
	      robot6.keyRelease(KeyEvent.VK_ENTER);					  												  				   								  				      				           				      
					
	      //ECS mandate			  				      				      
	      Thread.sleep(1000);
			ECS_Mandate_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.ecs_Mandate_Form));
			ECS_Mandate_doc_upload.click();

		Thread.sleep(500);

	 StringSelection ss7= new StringSelection("");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
	 		  				      				      
	//imitate mouse events like ENTER, CTRL+C, CTRL+V
    Robot robot7= new Robot();
    robot7.delay(250);
    robot7.keyPress(KeyEvent.VK_ENTER);
    robot7.keyRelease(KeyEvent.VK_ENTER);
    robot7.keyPress(KeyEvent.VK_CONTROL);
    robot7.keyPress(KeyEvent.VK_V);
    robot7.keyRelease(KeyEvent.VK_V);
    robot7.keyRelease(KeyEvent.VK_CONTROL);
    robot7.keyPress(KeyEvent.VK_ENTER);
    robot7.delay(50);
    robot7.keyRelease(KeyEvent.VK_ENTER);		  				      				      
				  				      				 
  //Agree button
	Thread.sleep(1000); 
	NonMed_agree =driver.findElement(By.xpath(EApp_LandingPage.agree_button));
	NonMed_agree.click();
//close 
	Thread.sleep(1000);
	NonMed_close =driver.findElement(By.xpath(EApp_LandingPage.close_button));
	NonMed_close.click();
    
    //PAN card proof
    
    Thread.sleep(1000);
    PANCard_doc = driver.findElement(By.xpath(EApp_LandingPage.pan_card_Proof));
    PANCard_doc.click();
    
    Thread.sleep(1000);
	PANCard_upload = driver.findElement(By.xpath(EApp_LandingPage.pan_card));
	PANCard_upload.click();

Thread.sleep(500);

StringSelection ss8= new StringSelection("");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
		  	
//imitate mouse events like ENTER, CTRL+C, CTRL+V
Robot robot8= new Robot();
robot8.delay(250);
robot8.keyPress(KeyEvent.VK_ENTER);
robot8.keyRelease(KeyEvent.VK_ENTER);
robot8.keyPress(KeyEvent.VK_CONTROL);
robot8.keyPress(KeyEvent.VK_V);
robot8.keyRelease(KeyEvent.VK_V);
robot8.keyRelease(KeyEvent.VK_CONTROL);
robot8.keyPress(KeyEvent.VK_ENTER);
robot8.delay(50);
robot8.keyRelease(KeyEvent.VK_ENTER);
   

//agree

Thread.sleep(1000);
Agree_button = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
Agree_button.click();

//close 
	Thread.sleep(1000);
	close_button =driver.findElement(By.xpath(EApp_LandingPage.close_button));
	close_button.click();
  
   
	//ABG employee
    
    Thread.sleep(1000);
    ABGEmp_doc = driver.findElement(By.xpath(EApp_LandingPage.ABG_Employee));
    ABGEmp_doc.click();
    
    Thread.sleep(1000);
    ABGEmp_upload = driver.findElement(By.xpath(EApp_LandingPage.ABG_Emp));
    ABGEmp_upload.click();

Thread.sleep(500);

StringSelection ss9= new StringSelection("");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
		  	
//imitate mouse events like ENTER, CTRL+C, CTRL+V
Robot robot10= new Robot();
robot10.delay(250);
robot10.keyPress(KeyEvent.VK_ENTER);
robot10.keyRelease(KeyEvent.VK_ENTER);
robot10.keyPress(KeyEvent.VK_CONTROL);
robot10.keyPress(KeyEvent.VK_V);
robot10.keyRelease(KeyEvent.VK_V);
robot10.keyRelease(KeyEvent.VK_CONTROL);
robot10.keyPress(KeyEvent.VK_ENTER);
robot10.delay(50);
robot10.keyRelease(KeyEvent.VK_ENTER);
   

//agree

Thread.sleep(1000);
Agree_button = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
Agree_button.click();

//close 
	Thread.sleep(1000);
	close_button =driver.findElement(By.xpath(EApp_LandingPage.close_button));
	close_button.click();
  
	//agree

	Thread.sleep(1000);
	Agree_button_final = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
	Agree_button_final.click();
	
	//close 
		Thread.sleep(1000);
		close_button_final =driver.findElement(By.xpath(EApp_LandingPage.close_button));
		close_button_final.click();	
		
		}
		catch(Exception e)
	   	{
	   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
	   		e.printStackTrace();
	   	}   		  
	}		

@SuppressWarnings("deprecation")
public void DocumentUploadTab_tobeinsured_minorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);	
		
		//Standard age proof
		
		Thread.sleep(1000);
		Standard_Age_doc = driver.findElement(By.xpath(EApp_LandingPage.standardAgeProof));
		Standard_Age_doc.click();
		 Extent_Reporting.Log_Pass("Entering standard age proof Doc","Entered standard age proof");

		 //select standard age proof doc	 
		 Thread.sleep(1000);
		 Standard_Age_select = driver.findElement(By.xpath(EApp_LandingPage.typeOfDocument));
			cell = sheet.getRow(6).getCell(252);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String StdageProofDoc = cell.getStringCellValue();
		      System.out.println(StdageProofDoc); 
		      Select StdageProofDoc1 = new Select(Standard_Age_select);
		      StdageProofDoc1.selectByValue("Passport");
		         Extent_Reporting.Log_Pass("Entering Standard Age Proof ","Entered Standar Age Proof is as "+StdageProofDoc); 
		//browse click
		         Thread.sleep(1000);
					STDage_proof_upload = driver.findElement(By.xpath(EApp_LandingPage.browseButton2));
					STDage_proof_upload.click();
						      
					Thread.sleep(500);

					StringSelection ss9= new StringSelection("");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
							  	
					//imitate mouse events like ENTER, CTRL+C, CTRL+V
					Robot robot9= new Robot();
					robot9.delay(250);
					robot9.keyPress(KeyEvent.VK_ENTER);
					robot9.keyRelease(KeyEvent.VK_ENTER);
					robot9.keyPress(KeyEvent.VK_CONTROL);
					robot9.keyPress(KeyEvent.VK_V);
					robot9.keyRelease(KeyEvent.VK_V);
					robot9.keyRelease(KeyEvent.VK_CONTROL);
					robot9.keyPress(KeyEvent.VK_ENTER);
					robot9.delay(50);
					robot9.keyRelease(KeyEvent.VK_ENTER);
				
					//agree

					Thread.sleep(1000);
					Agree_button = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
					Agree_button.click();
					
					
					//close 
					Thread.sleep(1000);
					close_button =driver.findElement(By.xpath(EApp_LandingPage.close_button));
					close_button.click();
					
	
	
	//agree tobe insured
					//agree

					Thread.sleep(1000);
					Agree_button_insurer = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
					Agree_button_insurer.click();
	
	}
		
	catch(Exception e)
   	{
   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
   		e.printStackTrace();
   	}   		  
}		
	
	
	
	
	@SuppressWarnings("deprecation")
		public void PaymentTab_minorIndian(WebDriver driver) throws IOException, InterruptedException {
			try {
			Thread.sleep(1000);					      
			
			//online payment
			
			 Thread.sleep(1000);
				Online_Payment_button = driver.findElement(By.xpath(EApp_LandingPage.online_payment));
				Online_Payment_button.click();
				 Extent_Reporting.Log_Pass("Selecting Online payment option ","Online payment option selected successfully");
			//submit
			
				 Thread.sleep(1000);
					Online_Payment_submit_button = driver.findElement(By.xpath(EApp_LandingPage.online_payment_submit));
					Online_Payment_submit_button.click();
					 Extent_Reporting.Log_Pass("Selecting Online payment submit ","Online payment submitted successfully");
				
			
		}
			
			
			
			catch(Exception e)
		   	{
		   		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		   		e.printStackTrace();
		   	}   		  
		}	
}
			
			
			
			
			
			
			
			
			
			
		