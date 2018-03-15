package com.eapp.Operations;

import java.awt.AWTException;
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
		WebElement Aadhar_UID;
		WebElement Personal_Details;
		WebElement Insurer_MiddleName;
		WebElement Marital_Status;
		WebElement Father_Spouse_Name;
		WebElement Place_Of_Birth_State;
		WebElement Place_Of_Birth_City;
		WebElement Relationship_Dropdown;
		WebElement Proposer_Nature_Business;
		WebElement Adhar_No;
		WebElement Existing_Policy;
		WebElement personal_details;
		WebElement Proposer_mname;
		WebElement MaritalStatus_Dropdown;
		WebElement Citizenship;
		WebElement TaxResidence;
		WebElement Proposer_professional_Details;
		WebElement Proposer_occupations;
		WebElement Proposer_Qualifications;
		WebElement Proposer_Type_Organization;
		WebElement Proposer_Nameofbusiness;
		WebElement Proposer_Years_Business;
		WebElement Proposer_Annual_Income;
		WebElement Proposer_Pan_Card;
		WebElement PanCard_Validatebutton;
		WebElement pan_close;
		WebElement Communication_Address;
		WebElement Proposer_Address1;
		WebElement Proposer_Address2;
		WebElement Proposer_Address3;
		WebElement Proposer_Area;
		WebElement Proposer_City_Town_Village;
		WebElement Proposer_Pin;
		WebElement Proposer_TelNo_ResNo;
		WebElement Proposer_mobNo;
		WebElement Proposer_AltmobNo;
		WebElement Proposer_GetPolicyDoc;
		WebElement Proposer_Email;
		WebElement Proposer_EIA_Details;
		WebElement EIA_Details;
		WebElement Proposer_Agreebutton;
		WebElement Birth_State;
		WebElement PlaceOfBirth;
		WebElement Birth_State2;
		WebElement first_Name;
		WebElement Fathermothername;
		WebElement Minorliving_Dropdown;
		WebElement Nationality_Dropdown;
		WebElement Studyingin_Radiobutton;
		WebElement Proposer_Address_Radiobutton;
		WebElement Exposed_Radiobutton;
		WebElement Purpose_Radiobutton;
		WebElement Agree;
		WebElement Existingpoliciplus;
		WebElement ExisistingToggle;
		WebElement Refusedplus;
		WebElement RefusedToggle;
		WebElement ExistingPolicyOfFather;
		WebElement ChildrenInsured;
		WebElement ExistingPolicyOfSister;
		WebElement ExistingPolicyOfMother;
		WebElement ExistingPolicyOfBrother;
		WebElement Iagree;
		WebElement holder_Name;
		WebElement account_no;
		WebElement Acc_type;
		WebElement Premium_pay;
		WebElement ifsc_code;
		WebElement Direct_bill;
		WebElement Iagree4;
		WebElement Hight_feet;
		WebElement Weight;
		WebElement Hight_inch;
		WebElement Weightchange;
		WebElement weightChangetoggle;
		WebElement Travel_Outside;
		WebElement lifestyleclick;
		WebElement Occupation;
		WebElement Consume;
		WebElement Consume_cigaratte;
		WebElement Consume_alcohol;
		WebElement familyclick;
		WebElement FatherAge;
		WebElement Fatherhealth_State;
		WebElement Diseasenone;
		WebElement motherage;
		WebElement Motherhealth_State;
		WebElement Sisterhealth_State;
		WebElement Havesis;
		WebElement Havebrother;
		WebElement sisterage;
		WebElement MedicalHistoryClick;
		WebElement Medicine_never;
		WebElement Medicine_defects;
		WebElement weightchange;
		WebElement Medicine;
		WebElement Add;
		WebElement Medicine_ECG;
		WebElement Medicine_cold;
		WebElement familyhistory;
		WebElement Medicine_admit;
		WebElement Medicine_symptoms;
		WebElement Medicine_HIV;
		WebElement Medicine_agree;
		WebElement Reason;
		WebElement Weightathetimeofbirth;;
		WebElement normalcareatbirth;
		WebElement dignosed;
		WebElement none;
		WebElement shortnessofbreath;
		WebElement complaint;
		WebElement declarationIAgree;
		WebElement Insurer_IAR_MiddleName;
		WebElement Insurer_IAR_NonMedical;
		WebElement Insurer_IAR_reference;
		WebElement Insurer_AgeProof;
		WebElement Insurer_IAR_personallyMet;
		WebElement Insurer_IAR_ClusterMarket;
		WebElement healthDetails_Agreebutton;
		WebElement Protection;
		WebElement Insurer_IAR_durationinYears;
		WebElement Insurer_IAR_durationinMonths;
		WebElement Insurer_IAR_productoffer;
		WebElement Insurer_IAR_Amountcalculation;
		WebElement IAR_EstimateProposer;
		WebElement IAR_EstimateInsurer;
		WebElement IAR_investment_Proposer;
		WebElement IAR_investment_Insurer;
		WebElement IAR_liabilities_Proposer;
		WebElement IAR_liabilities_Insurer;
		WebElement IAR_physicalDefects;
		WebElement IAR_adverseeffects;
		WebElement IAR_Declined_postponed_application;
		WebElement IAR_other_Remarks;
		WebElement IAR_FinancialStability;
		WebElement IAR_suspiciousactivity_Report;
		WebElement IAR_IAgreebutton;
		WebElement documentuploadclick;
		WebElement Typeofdoc;
		WebElement RAbutton;
		WebElement Typeof_doc;
		WebElement Browse;
		WebElement IAgree;
		WebElement DUclose;
		WebElement Review_Enter_OTP;
		WebElement Review_OTP_submit;
		WebElement Submit;
		WebElement ID_proof_doc;
		WebElement Non_Medical;
		WebElement IDProof_doc_select;
		WebElement ID_proof_doc_upload;
		WebElement ID_proof_doc_agree;
		WebElement Neft_Cancelled_Cheque;
		WebElement ID_proof_doc_close;
		WebElement Miscellaneous_Document;
		WebElement Photograph;
		WebElement Eapp_Customer_Declaration_Form;

		
		
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
	public void Basic_Details_BSLIVisionLifeSecurePlan(WebDriver driver) throws InterruptedException
	{
		
		try {
		  Existing_Policy=driver.findElement(By.xpath(EApp_LandingPage.Toggle_No_BSLI_Policy));
		  Existing_Policy.click();
	     
			Thread.sleep(1000);

		
	      Extent_Reporting.Log_Pass("Entering Advisor basic details ","Entered Advisor basic details");
	  Extent_Reporting.Log_Pass_with_Screenshot("Entering Client Details", "Entered Client Details", driver);
	  	
	  Adhar_No=driver.findElement(By.xpath(EApp_LandingPage.Proposer_UID));
	  cell = sheet.getRow(6).getCell(45);
	  cell.setCellType(Cell.CELL_TYPE_STRING);
	  String Adharno = cell.getStringCellValue();
	  System.out.println(Adharno);	
	  Adhar_No.sendKeys(Adharno);
		Thread.sleep(1000);
		Adhar_No= driver.findElement(By.xpath(EApp_LandingPage.Proposer_UID));
		Adhar_No.click();
		Thread.sleep(1000);
	  Extent_Reporting.Log_Pass("Entering Proposer adharcardno","Entered Proposer adharcardno");
	  personal_details=driver.findElement(By.xpath(EApp_LandingPage.personal_Details));
	  personal_details.click();
		
	  Proposer_mname=driver.findElement(By.xpath(EApp_LandingPage.middleName));
	  cell = sheet.getRow(6).getCell(47);
	  cell.setCellType(Cell.CELL_TYPE_STRING);
	  String proposerlname = cell.getStringCellValue();
	  System.out.println(proposerlname);	
	  Proposer_mname.sendKeys(proposerlname);
		Thread.sleep(1000);
	  Proposer_mname= driver.findElement(By.xpath(EApp_LandingPage.middleName));
	  Proposer_mname.click();
		Thread.sleep(1000);
	  Extent_Reporting.Log_Pass("Entering Proposer mname","Entered Proposer mname");
	  
	  
	  
	  Relationship_Dropdown=driver.findElement(By.xpath(EApp_LandingPage.Relationship));
	  
	  cell = sheet.getRow(6).getCell(48);
	  cell.setCellType(Cell.CELL_TYPE_STRING);
	  String relationship = cell.getStringCellValue();
	  System.out.println(relationship);	
	  Select relationship_Dropdown1 = new Select(Relationship_Dropdown);
	  relationship_Dropdown1.selectByValue("Parent");
	  Extent_Reporting.Log_Pass("Selecting Product","Selected BSLI Income Assured Plan");
	  
	  

	  
		MaritalStatus_Dropdown=driver.findElement(By.xpath(EApp_LandingPage.Marital_dropdown));
		   cell = sheet.getRow(6).getCell(49);
	    cell.setCellType(Cell.CELL_TYPE_STRING);
	    String maritalstatus = cell.getStringCellValue();
	    System.out.println(maritalstatus);	
	    Select maritalStatus_Dropdown1 = new Select(MaritalStatus_Dropdown);
	    maritalStatus_Dropdown1.selectByValue("Married");
	    Extent_Reporting.Log_Pass("Selecting Product","Selected Married");
	    
	    
	    Citizenship=driver.findElement(By.xpath(EApp_LandingPage.Proposer_Citizenship_NO));
	    Citizenship.click();
	    Extent_Reporting.Log_Pass("Selecting status","Selected Married");
	    
	    TaxResidence=driver.findElement(By.xpath(EApp_LandingPage.Proposer_Tax_Resident_NO));
	    TaxResidence.click();
		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			e.printStackTrace();
		}
	
	}

	 //proposer professional details
	    
	    
	    @SuppressWarnings("deprecation")
		public void prof_details_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
		{
	    	
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
	           
	            //Close
	             pan_close =driver.findElement(By.xpath("EApp_LandingPage.pan_close"));
	             pan_close.click();
	    
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
		        
		        //document 
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
			   Proposer_Agreebutton = driver.findElement(By.xpath(EApp_LandingPage.i_agree));
			   Proposer_Agreebutton.click();
			
		}
	 
	   
		
	   @SuppressWarnings({ "deprecation", "unused" })
	public void To_be_insured_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
		{
		   try
		   {
		
		   //to be insured
		   Proposer_mname=driver.findElement(By.xpath(EApp_LandingPage.Insurer_MiddleName));
		   cell = sheet.getRow(6).getCell(47);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   String insurerMiddleName = cell.getStringCellValue();
		   System.out.println(insurerMiddleName);	
		   Proposer_mname.sendKeys(insurerMiddleName);
		 	Thread.sleep(1000);
		 	Insurer_MiddleName= driver.findElement(By.xpath(EApp_LandingPage.Insurer_MiddleName));
		   Proposer_mname.click();
		 	Thread.sleep(1000);
		   Extent_Reporting.Log_Pass("Entering insured mname","Entered insured mname");
		   
		   
		   
		   Birth_State=driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
		   cell = sheet.getRow(6).getCell(13);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   String birthstate = cell.getStringCellValue();
		   System.out.println(birthstate);	
		   Birth_State.sendKeys(birthstate);
			Thread.sleep(1000);
			Birth_State2 = driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthState));
			Birth_State2.click();
			Thread.sleep(1000);
		   Extent_Reporting.Log_Pass("Entering Birth State","Entered Birth State");
		Extent_Reporting.Log_Pass_with_Screenshot("Entering Client Details", "Entered Client Details", driver);
		   
	
	
	
	
		PlaceOfBirth=driver.findElement(By.xpath(EApp_LandingPage.Insurer_BirthCity));
		cell = sheet.getRow(6).getCell(3);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String place = cell.getStringCellValue();
		System.out.println(place);	
		first_Name.sendKeys(place);
		Extent_Reporting.Log_Pass("Enterng place","Entered place Successfully");
	
	
	
	
		Fathermothername=driver.findElement(By.xpath(EApp_LandingPage.Insurer_FatherName));
		cell = sheet.getRow(6).getCell(3);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String fathermothername = cell.getStringCellValue();
		System.out.println(fathermothername);	
		first_Name.sendKeys(fathermothername);
		Extent_Reporting.Log_Pass("Enterng fathermothername","Entered fathermothername Successfully");
	
		//Select nationality
		Nationality_Dropdown=driver.findElement(By.xpath(EApp_LandingPage.Nationality));
		   cell = sheet.getRow(6).getCell(8);
		   cell.setCellType(Cell.CELL_TYPE_STRING);
		   String nationality = cell.getStringCellValue();
		   System.out.println(nationality);	
		   Select nationality_Dropdown = new Select(Nationality_Dropdown);
		   nationality_Dropdown.selectByValue("Indian");
		   Extent_Reporting.Log_Pass("Selecting Nationality","Selected Nationality");
		   
		   //minor living with
			Minorliving_Dropdown=driver.findElement(By.xpath(EApp_LandingPage.Minorlivingwith));
			   cell = sheet.getRow(6).getCell(8);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String minor = cell.getStringCellValue();
		      System.out.println(minor);	
		      Select minorliving_Dropdown = new Select(Minorliving_Dropdown);
		      minorliving_Dropdown.selectByValue("Parents");
		      Extent_Reporting.Log_Pass("Selecting Minorlivingwith","Selected Minorlivingwith");
		      
		//studying in
		      Studyingin_Radiobutton=driver.findElement(By.xpath(EApp_LandingPage.Studyin));
			   cell = sheet.getRow(6).getCell(8);
		     cell.setCellType(Cell.CELL_TYPE_STRING);
		     String studying = cell.getStringCellValue();
		     System.out.println(studying);	
		     Studyingin_Radiobutton.sendKeys(studying);
		     Extent_Reporting.Log_Pass("Enterng studying","Entered studying Successfully");
	
		     //comm add
	
		     
		     Thread.sleep(1000);
		     Proposer_Address_Radiobutton= driver.findElement(By.xpath(EApp_LandingPage.CommunicationAddRadiobutton));
		cell = sheet.getRow(6).getCell(81);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String proposer_Address  = cell.getStringCellValue();
		      System.out.println(proposer_Address); 
		      Select proposer_Address_Radiobutton = new Select(Proposer_Address_Radiobutton);
		      minorliving_Dropdown.selectByValue("Yes");
		     Extent_Reporting.Log_Pass("Selecting radiobutton","Selected"); 
		     /*
		     
		     //mobile no
		     
		     Thread.sleep(1000);
		     Proposer_mobNo= driver.findElement(By.xpath(EApp_LandingPage.Proposer_mobile_Number));
		cell = sheet.getRow(6).getCell(82);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String proposerMobNo  = cell.getStringCellValue();
		      System.out.println(ProposerMobNo); 
		      Proposer_mobNo.sendKeys(ProposerMobNo);
		     Extent_Reporting.Log_Pass("Entering Proposer's Mob No","Entered Proposer's Mob No"); 
		     
		     //alt mob no
		     
		     Thread.sleep(1000);
		     Proposer_AltmobNo = driver.findElement(By.xpath(EApp_LandingPage.Proposer_Alternate_Number));
		cell = sheet.getRow(6).getCell(83);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String proposerAltMobNo  = cell.getStringCellValue();
		      System.out.println(ProposerAltMobNo); 
		      Proposer_AltmobNo.sendKeys(ProposerAltMobNo);
		     Extent_Reporting.Log_Pass("Entering Proposer's Alt Mob No","Entered Proposer's Alt Mob No"); 
		     //iagee
		     
		     */
		     
		     
		     //concurrent app
		     
		     
		     
		  Exposed_Radiobutton= driver.findElement(By.xpath(EApp_LandingPage.Insurer_PEP_Toggle_NO));
		cell = sheet.getRow(6).getCell(88);
		      cell.setCellType(Cell.CELL_TYPE_STRING);
		      String exposed_Radiobutton  = cell.getStringCellValue();
		      System.out.println(exposed_Radiobutton); 
		      Select Exposed_Radio= new Select(Exposed_Radiobutton);
		      minorliving_Dropdown.selectByValue("No");
		     Extent_Reporting.Log_Pass("Selecting radiobutton","Selected"); 
		     
	     
	     //purpose
	     
	     Purpose_Radiobutton= driver.findElement(By.xpath(EApp_LandingPage.Insurer_Purpose_Risk));
	     cell = sheet.getRow(6).getCell(88);
	           cell.setCellType(Cell.CELL_TYPE_STRING);
	           String purpose_Radio  = cell.getStringCellValue();
	           System.out.println(purpose_Radio); 
	           Select Purpose_Radio= new Select(Purpose_Radiobutton);
	           Purpose_Radio.selectByValue("Risk");
	          Extent_Reporting.Log_Pass("Selecting radiobutton","Selected"); 
	          
	          
	          
	          Agree= driver.findElement(By.xpath(EApp_LandingPage.Iagree4));
	          Agree.click();
	          //Existing policies
		   }
	      	catch(Exception e)
			{
				Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
				e.printStackTrace();
			}
		}
		   public void previous_details_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
			{
			   try
			   {
	          
	          Existingpoliciplus = driver.findElement(By.xpath(EApp_LandingPage.Existingpoliciplus));
	          Existingpoliciplus.click();
			Thread.sleep(1000);
		   	ExisistingToggle = driver.findElement(By.xpath(EApp_LandingPage.ExistingPolicyNo));
	      	ExisistingToggle.click();
	      	
	      	Refusedplus=driver.findElement(By.xpath(EApp_LandingPage.PlusSign6));
	      	Refusedplus.click();
			
	      	RefusedToggle=driver.findElement(By.xpath(EApp_LandingPage.DeclinedPolicyNo));
	      	
	      	RefusedToggle.click();
	      	
	      	//family insured history
	          ChildrenInsured=driver.findElement(By.xpath(EApp_LandingPage.childreninsuredYes));
	          
	          ChildrenInsured.click();
	          
	          
	          ExistingPolicyOfFather=driver.findElement(By.xpath(EApp_LandingPage.Existingpolicyfatherno));
	          ExistingPolicyOfFather.click();
	          
	          ExistingPolicyOfMother=driver.findElement(By.xpath(EApp_LandingPage.ExistingPolicyMotherNo));
	          ExistingPolicyOfMother.click();
	          
	          ExistingPolicyOfBrother=driver.findElement(By.xpath(EApp_LandingPage.Existingpolicybrono));
	          ExistingPolicyOfBrother.click();
	          
	          ExistingPolicyOfSister=driver.findElement(By.xpath(EApp_LandingPage.Existingpolicysisno));
	          ExistingPolicyOfSister.click();
	          
	          
	          Iagree=driver.findElement(By.xpath(EApp_LandingPage.i_agree));
	          Iagree.click();
			   }
	      	catch(Exception e)
			{
				Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
				e.printStackTrace();
			}
			   }
	          
	          
	          @SuppressWarnings("deprecation")
			public void Bank_details_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
	  		{
	  		   try
	  		   {
	          //bank Details
	          
	          holder_Name=driver.findElement(By.xpath(EApp_LandingPage.AccountHolderNam));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String holdername = cell.getStringCellValue();
		       System.out.println(holdername);	
		       first_Name.sendKeys(holdername);
		       Extent_Reporting.Log_Pass("Enterng holdername","Entered holdername Successfully");
	          
		       account_no=driver.findElement(By.xpath(EApp_LandingPage.AccountNum));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String accno = cell.getStringCellValue();
		       System.out.println(accno);	
		       first_Name.sendKeys(accno);
		       Extent_Reporting.Log_Pass("Enterng accno","Entered accno Successfully");
		       
		       Acc_type=driver.findElement(By.xpath(EApp_LandingPage.AccountType))	;
		       Acc_type.click();
		       
		       
		       ifsc_code=driver.findElement(By.xpath(EApp_LandingPage.IFSC));
		  		   cell = sheet.getRow(6).getCell(3);
		  	       cell.setCellType(Cell.CELL_TYPE_STRING);
		  	       String ifsccode = cell.getStringCellValue();
		  	       System.out.println(ifsccode);	
		  	       first_Name.sendKeys(ifsccode);
		  	       Extent_Reporting.Log_Pass("Enterng IFSC","Entered IFSC Successfully");
	          
	          
	          Premium_pay=driver.findElement(By.xpath(EApp_LandingPage.PlusSign7));
	          Premium_pay.click();
	          
	          
	          Direct_bill=driver.findElement(By.xpath(EApp_LandingPage.DirectBill));
	          Direct_bill.click();
	          
	          
	          
	          Iagree4=driver.findElement(By.xpath(EApp_LandingPage.Iagree4));
	          Iagree4.click();
	  		   }
	      	catch(Exception e)
			{
				Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
				e.printStackTrace();
			}
	          
	          
	  		   }
	  		   
	          //Health details tab
	          @SuppressWarnings("deprecation")
			public void Health_details_Prop_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
		  		{
		  		   try
		  		   { 
	          
	          //proposer
	          
	          Hight_feet=driver.findElement(By.xpath(EApp_LandingPage.HeightFt));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String hight_feet = cell.getStringCellValue();
		       System.out.println(hight_feet);	
		       Hight_feet.sendKeys(hight_feet);
		       Extent_Reporting.Log_Pass("Enterng hight in feet","Entered hight Successfully");
		       
		       Hight_inch=driver.findElement(By.xpath(EApp_LandingPage.HeightInch));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String Hightinch = cell.getStringCellValue();
		       System.out.println(Hightinch);	
		       Hight_inch.sendKeys(Hightinch);
		       Extent_Reporting.Log_Pass("Enterng hight in inch","Entered hight Successfully");
		       
		       Weight=driver.findElement(By.xpath(EApp_LandingPage.Weight));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String weight = cell.getStringCellValue();
		       System.out.println(weight);	
		       Weight.sendKeys(weight);
		       Extent_Reporting.Log_Pass("Enterng weight","Entered weight Successfully");
		       
		       weightChangetoggle=driver.findElement(By.xpath(EApp_LandingPage.Toggle17));
		       weightChangetoggle.click();
	          
	          
		       
		      
			       
					Weightchange=driver.findElement(By.xpath(EApp_LandingPage.WeightChanDetails));
					   cell = sheet.getRow(6).getCell(49);
				    cell.setCellType(Cell.CELL_TYPE_STRING);
				    String weightchange = cell.getStringCellValue();
				    System.out.println(weightchange);	
				    Weightchange.sendKeys(weight);
				       Extent_Reporting.Log_Pass("Enterng weight","Entered weight Successfully");
				    //life style information
			       lifestyleclick=driver.findElement(By.xpath(EApp_LandingPage.PlusSign8));
			       lifestyleclick.click();
		       
		   
		       
		    		   Travel_Outside=driver.findElement(By.xpath(EApp_LandingPage.travelno));
		    		   Travel_Outside.click();
		    		
		    		    Extent_Reporting.Log_Pass("Selecting Traveloutside","Selected Traveloutside");
		    		    
		    		    
		    	  		

		    		    Occupation=driver.findElement(By.xpath(EApp_LandingPage.occupation));
		    		    Occupation.click();
		    		    Extent_Reporting.Log_Pass("Selecting Occupation","Selected Occupation");
		    		    
		    		    
		    		    Consume=driver.findElement(By.xpath(EApp_LandingPage.consume));
		    		    Consume.click();
		    		    Extent_Reporting.Log_Pass("Selecting consume","Selected consume");
		    		    
		    		    
		    		    Consume_alcohol=driver.findElement(By.xpath(EApp_LandingPage.consume));
		    		    Consume_alcohol.click();
		    		    Extent_Reporting.Log_Pass("Selecting Consume_alcohol","Selected Consume_alcohol");
		    		    
		    		    
		    		    
		    		    Consume_cigaratte=driver.findElement(By.xpath(EApp_LandingPage.consume));
		    		    Consume_cigaratte.click();
		    		    Extent_Reporting.Log_Pass("Selecting Consume_cigaratte","Selected Consume_cigaratte");
		    		    
		    		    
		    		    //family medical history
		    		    
		    		   familyclick=driver.findElement(By.xpath(EApp_LandingPage.PlusSign9));
		    		   familyclick.click();
		    		   
		    		   Diseasenone=driver.findElement(By.xpath(EApp_LandingPage.FMHNone));
		    		   Diseasenone.click();
		    		   
		    		   
		    		   //sisage
		    		   FatherAge=driver.findElement(By.xpath(EApp_LandingPage.FatherAge));
					   cell = sheet.getRow(6).getCell(3);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String fatherAge = cell.getStringCellValue();
				       System.out.println(fatherAge);	
				       first_Name.sendKeys(fatherAge);
				       Extent_Reporting.Log_Pass("Enterng father age","Entered father age Successfully");
		    		   
						Fatherhealth_State=driver.findElement(By.xpath(EApp_LandingPage.FatherHealthState));
						   cell = sheet.getRow(6).getCell(15);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String fhealthState = cell.getStringCellValue();
					       System.out.println(fhealthState);	
					  
							Thread.sleep(1000);
							Fatherhealth_State = driver.findElement(By.xpath(EApp_LandingPage.Fhealthstateok));
							Fatherhealth_State.click();
							Thread.sleep(1000);
					       Extent_Reporting.Log_Pass("Entering father health State","Entered health State");
		    		    
					       
					       
					       
						  motherage=driver.findElement(By.xpath(EApp_LandingPage.MotherAge));
						   cell = sheet.getRow(6).getCell(3);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String motherage = cell.getStringCellValue();
					       System.out.println(motherage);	
					       first_Name.sendKeys(motherage);
					       Extent_Reporting.Log_Pass("Enterngmotherage","Enteredmotherage Successfully");
			    		   
							Motherhealth_State=driver.findElement(By.xpath(EApp_LandingPage.MotherHealthState));
							   cell = sheet.getRow(6).getCell(15);
						       cell.setCellType(Cell.CELL_TYPE_STRING);
						       String mhealthState = cell.getStringCellValue();
						       System.out.println(mhealthState);	
						    
								Thread.sleep(1000);
								Motherhealth_State = driver.findElement(By.xpath(EApp_LandingPage.MotherHealthStateok));
								Motherhealth_State.click();
								Thread.sleep(1000);
						       Extent_Reporting.Log_Pass("Entering mother healthState","Entered mother healthState State");
						       
						       
						       //brother
						       Havebrother=driver.findElement(By.xpath(EApp_LandingPage.Toggle23));
						       Havebrother.click();
						       //sister
						       
						       Havesis=driver.findElement(By.xpath(EApp_LandingPage.Toggle24));
						       Havesis.click();
						       
						       
								  sisterage=driver.findElement(By.xpath(EApp_LandingPage.SisterAge));
								   cell = sheet.getRow(6).getCell(3);
							       cell.setCellType(Cell.CELL_TYPE_STRING);
							       String sisterage = cell.getStringCellValue();
							       System.out.println(sisterage);	
							       first_Name.sendKeys(sisterage);
							       Extent_Reporting.Log_Pass("Enterngsisterage","Enteredsisterage Successfully");
						    		   
						       
							   	Sisterhealth_State=driver.findElement(By.xpath(EApp_LandingPage.SisterHealthState));
								   cell = sheet.getRow(6).getCell(15);
							       cell.setCellType(Cell.CELL_TYPE_STRING);
							       String shealthState = cell.getStringCellValue();
							       System.out.println(shealthState);	
							
									Thread.sleep(1000);
									Sisterhealth_State = driver.findElement(By.xpath(EApp_LandingPage.SisterHealthStateok));
									Sisterhealth_State.click();
									Thread.sleep(1000);
							       Extent_Reporting.Log_Pass("Entering sister health State","Entered sister healthState");
						       
						       
						       Add=driver.findElement(By.xpath(EApp_LandingPage.Add));
						       Add.click();
		    	
		    		    //medical history
						       
						       MedicalHistoryClick=driver.findElement(By.xpath(EApp_LandingPage.PlusSign10));
					              MedicalHistoryClick.click();
					          // Are you on diet or any other medicine of any kind as prescribed by a doctor?
					              Medicine=driver.findElement(By.xpath(EApp_LandingPage.medicine));
					              Medicine.click();
					              //Consulted any doctor or health practitioner except for common cold, influenza lasting less than 4 days?
					              Medicine_cold=driver.findElement(By.xpath(EApp_LandingPage.medicine1));
					              Medicine_cold.click();
					             // Submitted to an ECG, X- rays, blood tests or any other tests?
					              Medicine_ECG=driver.findElement(By.xpath(EApp_LandingPage.medicine2));
					              Medicine_ECG.click();
					              //Admitted /been advised to be admitted to any hospital or a medical facility for medical management or surgical procedure?
					              Medicine_admit=driver.findElement(By.xpath(EApp_LandingPage.medicine3));
					              Medicine_admit.click();
					              // No I Have never sought advice or suffered from any of the above? 
					              Medicine_never=driver.findElement(By.xpath(EApp_LandingPage.never));
					              Medicine_never.click();
					              //Do you have any physical defects, impairment, deformities and / or any condition affecting mobility, sight and / or hearing?
					              Medicine_defects=driver.findElement(By.xpath(EApp_LandingPage.defects));
					              Medicine_defects.click();
					              //Do you have any health symptoms or complaints for which a physician has not been consulted or treatment received? (persistent fever, unexplained weight loss, loss of appetite, pain, swelling etc.)
					              Medicine_symptoms=driver.findElement(By.xpath(EApp_LandingPage.symptoms));
					              Medicine_symptoms.click();
					              //Have you or your spouse received any medical advice, testing or treatment for any sexually transmitted disease or HIV Infection / AIDS?
					              Medicine_HIV=driver.findElement(By.xpath(EApp_LandingPage.HIV));
					              Medicine_HIV.click();
					              //I Agree
					              Medicine_agree=driver.findElement(By.xpath(EApp_LandingPage.agree));
					              Medicine_agree.click();
						      
								}
		  			catch(Exception e)
		  			{
		  				Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		  				e.printStackTrace();
		  			}
		  		}
	          
		  		   
		  		 @SuppressWarnings("deprecation")
				public void Health_details_Tobeinsured_BSLI_life_secure_plan(WebDriver driver) throws InterruptedException
			  		{
			  		   try
			  		   { 
						       	//Health details to be insured
						       
			
						           Hight_feet=driver.findElement(By.xpath(EApp_LandingPage.HeightFt));
								   cell = sheet.getRow(6).getCell(3);
							       cell.setCellType(Cell.CELL_TYPE_STRING);
							       String hight_feet = cell.getStringCellValue();
							       System.out.println(hight_feet);	
							       first_Name.sendKeys(hight_feet);
							       Extent_Reporting.Log_Pass("Enterng hight in feet","Entered hight Successfully");
							       
							       Hight_inch=driver.findElement(By.xpath(EApp_LandingPage.HeightInch));
								   cell = sheet.getRow(6).getCell(3);
							       cell.setCellType(Cell.CELL_TYPE_STRING);
							       String Hight_inch = cell.getStringCellValue();
							       System.out.println(Hight_inch);	
							       first_Name.sendKeys(Hight_inch);
							       Extent_Reporting.Log_Pass("Enterng hight in inch","Entered hight Successfully");
							       
							       Weight=driver.findElement(By.xpath(EApp_LandingPage.Weight));
								   cell = sheet.getRow(6).getCell(3);
							       cell.setCellType(Cell.CELL_TYPE_STRING);
							       String weight = cell.getStringCellValue();
							       System.out.println(weight);	
							       first_Name.sendKeys(weight);
							       Extent_Reporting.Log_Pass("Enterng weight","Entered weight Successfully");
							  
							       
									Weightchange=driver.findElement(By.xpath(EApp_LandingPage.WeightChanDetails));
									   cell = sheet.getRow(6).getCell(49);
								    cell.setCellType(Cell.CELL_TYPE_STRING);
								    String weightchange = cell.getStringCellValue();
								    System.out.println(weightchange);	
								    Weightchange.sendKeys(weight);
								       Extent_Reporting.Log_Pass("Enterng weight","Entered weight Successfully");
							       
								       
										Reason=driver.findElement(By.xpath(EApp_LandingPage.reason));
										   cell = sheet.getRow(6).getCell(49);
									    cell.setCellType(Cell.CELL_TYPE_STRING);
									    String reason = cell.getStringCellValue();
									    System.out.println(reason);	
									    Reason.sendKeys(reason);
									       Extent_Reporting.Log_Pass("Enterng Reason","Entered Reason Successfully");
								   
								       Weightathetimeofbirth=driver.findElement(By.xpath(EApp_LandingPage.Weight_timeofBirth));
									   cell = sheet.getRow(6).getCell(3);
								       cell.setCellType(Cell.CELL_TYPE_STRING);
								       String Weightathetimeofbirth = cell.getStringCellValue();
								       System.out.println(Weightathetimeofbirth);	
								       first_Name.sendKeys(Weightathetimeofbirth);
								       Extent_Reporting.Log_Pass("Enterng weight","Entered weight Successfully");
								       
								       familyhistory=driver.findElement(By.xpath(EApp_LandingPage.familyhistoryplus));
								       familyhistory.click();
								       none=driver.findElement(By.xpath(EApp_LandingPage.none));
								       none.click();
								       
								       //insurability declaration
								       normalcareatbirth=driver.findElement(By.xpath(EApp_LandingPage.normalcareatbirth));
								       normalcareatbirth.click();
								       dignosed=driver.findElement(By.xpath(EApp_LandingPage.dignosed));
								       dignosed.click();
								       
								       
								       shortnessofbreath=driver.findElement(By.xpath(EApp_LandingPage.shortnessofbreath));
								       shortnessofbreath.click();
								       
								       complaint=driver.findElement(By.xpath(EApp_LandingPage.complaints));
								       complaint.click();
								       
								       
								       declarationIAgree=driver.findElement(By.xpath(EApp_LandingPage.DeclarationIagree));
								       declarationIAgree.click();
								       
			  		   }
								       
								   	catch(Exception e)
									{
										Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
										e.printStackTrace();
									}
						       
						       
						       
						       }	
						       @SuppressWarnings("deprecation")
							public void Basic_Details_BSLIVisionLifeSecurePlan_IAR(WebDriver driver) throws InterruptedException 
						       {
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
						    	           Extent_Reporting.Log_Pass("Entering Insurer's Investments","Entered Insurer's Investments  " +IARInvestmentInsurer);
						    	               
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
							public void Basic_Details_BSLIVisionLifeSecurePlan_ReviewandAcceptance(WebDriver driver) throws InterruptedException

						   	{ 
						   		try
						   		{
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
						         
						  
						   	 RAbutton=driver.findElement(By.xpath(EApp_LandingPage.RAbutton));
							   	RAbutton.click();
						   	}
						   	  catch(Exception e)
				    	        {
				    	         Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
				    	         e.printStackTrace();
				    	        }
	
						   	}
			
						
							
							public void Basic_Details_BSLIVisionLifeSecurePlan_Paymentgateway(WebDriver driver) throws InterruptedException, AWTException
							{
								try
								{
									
									Submit=driver.findElement(By.xpath(EApp_LandingPage.Submit));
									Submit.click();
									
									
									
									
								}
								catch(Exception e)
								{
					    	         Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
					    	         e.printStackTrace();
					    	        }
							}
						   	
						   		
							 @SuppressWarnings("deprecation")
							public void Minor_Basic_Details_BSLIVisionLifeSecurePlan_DocumentUploadTab(WebDriver driver) throws IOException, InterruptedException {
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
								          
								       //Upload doc
								               Thread.sleep(1000);
								               //Browse Click
								         ID_proof_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.browseButton));
								         ID_proof_doc_upload.click();
								          Extent_Reporting.Log_Pass("Entering ID proof Doc upload","ID proof doc uploaded successfully");
								      //doc find 
								          
								     
								              Thread.sleep(500);
								            StringSelection ss = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
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
								              robot.keyRelease(KeyEvent.VK_ENTER) ;
								              
								              ID_proof_doc_agree = driver.findElement(By.xpath(EApp_LandingPage.agree_button));
								           ID_proof_doc_agree.click();
								           ID_proof_doc_close = driver.findElement(By.xpath(EApp_LandingPage.close_button));
								           ID_proof_doc_close.click();
								              
								              
								   /*   //address proof  
								              Thread.sleep(1000);
								          address_proof_doc = driver.findElement(By.xpath(EApp_LandingPage.ageProof));
								          address_proof_doc.click();
								           Extent_Reporting.Log_Pass("Entering Address proof Doc","Entered Address proof");
								         //select id proof doc  
								        Thread.sleep(1000);
								        IDProof_doc_select = driver.findElement(By.xpath(EApp_LandingPage.typeOfDocument));
								        cell = sheet.getRow(6).getCell(243);
								             cell.setCellType(Cell.CELL_TYPE_STRING);
								             String IDProofDoc12 = cell.getStringCellValue();
								             System.out.println(IDProofDoc); 
								             Select IDProofDoc123 = new Select(IDProof_doc_select);
								             IDProofDoc123.selectByValue("Passport");
								                Extent_Reporting.Log_Pass("Entering Age Proof ","Entered Age Proof is as "+IDProofDoc12); 
								           
								        //Upload doc
								                Thread.sleep(1000);
								           
								           //Browse Click
								          ID_proof_doc_upload = driver.findElement(By.xpath(EApp_LandingPage.browseButton));
								          ID_proof_doc_upload.click();
								           Extent_Reporting.Log_Pass("Entering ID proof Doc upload","ID proof doc uploaded successfully");
								       //doc find
								               Thread.sleep(500);
								             StringSelection ss1 = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
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
								               robot1.keyRelease(KeyEvent.VK_ENTER) ;*/
								               
								               // non medical requirement
								               
								               Non_Medical =driver.findElement(By.xpath(EApp_LandingPage.nonMedicalRequirements));
								               Non_Medical.click();
								               //Miscellaneous_Document
								               Miscellaneous_Document = driver.findElement(By.xpath(EApp_LandingPage.miscellaneous_Document));
								               Miscellaneous_Document.click();
								               StringSelection ss2 = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
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
								               robot2.keyRelease(KeyEvent.VK_ENTER) ;
								               
								               //neft_Cancelled_Cheque
								              Neft_Cancelled_Cheque =driver.findElement(By.xpath(EApp_LandingPage.neft_Cancelled_Cheque));
								              Neft_Cancelled_Cheque.click();
								              StringSelection ss3 = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
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
								               robot3.keyRelease(KeyEvent.VK_ENTER) ;
								               //photograph
								               Photograph =driver.findElement(By.xpath(EApp_LandingPage.photograph));
								               Photograph.click();
								               StringSelection ss4 = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
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
								               robot4.keyRelease(KeyEvent.VK_ENTER) ;
								               //eapp_Customer_Declaration_Form
								               Eapp_Customer_Declaration_Form=driver.findElement(By.xpath(EApp_LandingPage.eapp_Customer_Declaration_Form));
								               Eapp_Customer_Declaration_Form.click();
								               StringSelection ss5 = new StringSelection("D:\\Subhojeet\\VAPT.pdf");
								               Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);							
							
							
						   	}
								    
								   	catch(Exception e)
									{
										Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
										e.printStackTrace();
									}
						       
						       
						       
						       }	   
								    
							 }
						   	

