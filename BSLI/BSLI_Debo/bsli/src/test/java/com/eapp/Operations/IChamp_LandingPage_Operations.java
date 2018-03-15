package com.eapp.Operations;

import java.io.File;
import java.io.FileInputStream;
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

import com.eapp.Elements.IChamp_LandingPage;
import com.eapp.Reporting.Extent_Reporting;

public class IChamp_LandingPage_Operations {
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	String desiredPath = "./Datasheet_2.3.xlsx"; 				
	File src = new File(desiredPath);
	IChamp_LandingPage landing_Page = new IChamp_LandingPage();
	WebElement first_Name;
	WebElement last_Name;
	WebElement DoB;
	WebElement Select_Gender;
	WebElement Click_Illustration;
	WebElement Product_Dropdown;
	WebElement Next_Button;
	WebElement Proposer_State;
	WebElement Proposer_State2;
	WebElement Advisor_State;
	WebElement Advisor_State2;
	WebElement Proposer_first_Name;
	WebElement Policy_Tab;
	WebElement ABG_Employee_Checkbox;
	WebElement Employee_ID;
	WebElement Rider_Tab;
	WebElement Death_Disability_Input;
	WebElement Death_Benefit_Checkbox;
	WebElement Critical_Illness_Input;
	WebElement Surgical_Care_Input;
	WebElement Hospital_Care_Input;
	WebElement Calculate;
	WebElement Generate_Illustration;
	WebElement CancerShield_Checkbox;
	WebElement CritiShield_Checkbox;
	WebElement Skip_button;
	WebElement Proceed_Eapp;

	
//IChamp Life Insured Details
	@SuppressWarnings("deprecation")
	public void IChamp_Life_Insured_Details(WebDriver driver) throws IOException, InterruptedException {
		try {
			  FileInputStream finput = new FileInputStream(src);
			  workbook = new XSSFWorkbook(finput);
			  sheet= workbook.getSheetAt(1);
			//Thread.sleep(1000);
			//Enter First Name
			   first_Name=driver.findElement(By.xpath(IChamp_LandingPage.fname));
			   cell = sheet.getRow(6).getCell(3);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String firstName = cell.getStringCellValue();
		       System.out.println(firstName);	
		       first_Name.sendKeys(firstName);
		       Extent_Reporting.Log_Pass("Enterng FirstName","Entered FirstName Successfully");
			
			//Enter Last Name
		       last_Name=driver.findElement(By.xpath(IChamp_LandingPage.Lname));
			   cell = sheet.getRow(6).getCell(4);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String lastName = cell.getStringCellValue();
		       System.out.println(lastName);
		       last_Name.sendKeys(lastName);
		       Extent_Reporting.Log_Pass("Enterng LastName","Entered LastName Successfully");
		       
		     //Enter Date Of Birth
		       DoB=driver.findElement(By.xpath(IChamp_LandingPage.Dob));
			   cell = sheet.getRow(6).getCell(5);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String DateofBirth = cell.getStringCellValue();
		       System.out.println(DateofBirth);
		       DoB.sendKeys(DateofBirth);
		       Extent_Reporting.Log_Pass("Enterng Date Of Birth","Entered Date Of Birth Successfully"); 
		       
		     //Select Gender
		       Thread.sleep(1000);
		       last_Name.click();
		       Thread.sleep(1000);

		       Select_Gender=driver.findElement(By.xpath(IChamp_LandingPage.Gender_Female));
			   cell = sheet.getRow(6).getCell(6);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String Gender = cell.getStringCellValue();
		       System.out.println(Gender);
		       Select_Gender.click();
		       Extent_Reporting.Log_Pass("Selecting Gender","Female Gender Selected");
		       
		     //Click Illustration
		       Click_Illustration=driver.findElement(By.xpath(IChamp_LandingPage.Illustrate));
		       Click_Illustration.click();
				Thread.sleep(1000);

		       Extent_Reporting.Log_Pass("Clicking Illustration","Illustration Clicked");
		       Extent_Reporting.Log_Pass_with_Screenshot("Login Successful", "Successfully entered the Login details", driver);

		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			e.printStackTrace();
		}
	}
	// Product Select
		@SuppressWarnings("deprecation")
		public void Select_Product(WebDriver driver) throws IOException, InterruptedException {
			try {
				
				//Select Product
				Product_Dropdown=driver.findElement(By.xpath(IChamp_LandingPage.Savings_With_Protection));
				   cell = sheet.getRow(6).getCell(8);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String product = cell.getStringCellValue();
			       System.out.println(product);	
			       Select product_Dropdown = new Select(Product_Dropdown);
			       product_Dropdown.selectByValue("BSLI Income Assured Plan");
			       Extent_Reporting.Log_Pass("Selecting Product","Selected BSLI Income Assured Plan");
				
				//Click Next
			       Next_Button=driver.findElement(By.xpath(IChamp_LandingPage.Next));
			       Next_Button.click();
					Thread.sleep(1000);

			       Extent_Reporting.Log_Pass("Clicking Next","Clicked Next");
			       Extent_Reporting.Log_Pass_with_Screenshot("Product Selected", "Selected BSLI Income Assured Plan", driver);

			}
			catch(Exception e)
			{
				Extent_Reporting.Log_Fail("Product Not Selected","Element not found", driver);
				e.printStackTrace();
			}
		}
		//Client Tab

			@SuppressWarnings("deprecation")
			public void Client_Tab(WebDriver driver) throws IOException, InterruptedException {
				try {
					Thread.sleep(1000);

					//Scroll
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,250)", "");
					Thread.sleep(1000);

					//Enter Proposer State
					Proposer_State=driver.findElement(By.xpath(IChamp_LandingPage.ProposerState));
					   cell = sheet.getRow(6).getCell(12);
				       cell.setCellType(Cell.CELL_TYPE_STRING);
				       String proposerState = cell.getStringCellValue();
				       System.out.println(proposerState);	
				       Proposer_State.sendKeys(proposerState);
						Thread.sleep(1000);
				       Proposer_State = driver.findElement(By.xpath("//li[text()='MAHARASHTRA']"));
				       Proposer_State.click();
						Thread.sleep(1000);
				       Extent_Reporting.Log_Pass("Entering Proposer State","Entered Proposer State");
					
				     //Enter Advisor State
				       Advisor_State=driver.findElement(By.xpath(IChamp_LandingPage.AdvisorState));
						   cell = sheet.getRow(6).getCell(13);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String advisorState = cell.getStringCellValue();
					       System.out.println(advisorState);	
					       Advisor_State.sendKeys(advisorState);
							Thread.sleep(1000);
					       Advisor_State2 = driver.findElement(By.xpath("//li[text()='MAHARASHTRA']"));
					       Advisor_State2.click();
							Thread.sleep(1000);
					       Extent_Reporting.Log_Pass("Entering Advisor State","Entered Advisor State");
				       Extent_Reporting.Log_Pass_with_Screenshot("Entering Client Details", "Entered Client Details", driver);

				}
				catch(Exception e)
				{
					Extent_Reporting.Log_Fail("Client Details not entered","Element not found", driver);
					e.printStackTrace();
				}
			
	}
			//Policy Tab

			@SuppressWarnings("deprecation")
			public void Policy_Tab_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
				try {
					Thread.sleep(1000);
					
					
					//ABG Employee
					Policy_Tab=driver.findElement(By.xpath(IChamp_LandingPage.policy_Tab));
					   	
					Policy_Tab.click();
						Thread.sleep(1000);
						//Scroll
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollBy(0,250)", "");
						Thread.sleep(1000);
						ABG_Employee_Checkbox = driver.findElement(By.xpath(IChamp_LandingPage.ABGEmployeeCheckbox));
						ABG_Employee_Checkbox.click();
						Thread.sleep(1000);

						Employee_ID = driver.findElement(By.xpath(IChamp_LandingPage.EmpId));
						cell = sheet.getRow(6).getCell(30);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String EmployeeID = cell.getStringCellValue();
					       System.out.println(EmployeeID);	
					       Employee_ID.sendKeys(EmployeeID);
					
						Thread.sleep(1000);
				       Extent_Reporting.Log_Pass("Entering ABG Employee ID","Entered ABG Employee ID");
				       Extent_Reporting.Log_Pass_with_Screenshot("ABG Employee Checkbox Selected", "Entered Employee ID", driver);

				    
				}
				catch(Exception e)
				{
					Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
					e.printStackTrace();
				}
			
	}
			//Rider Tab
			@SuppressWarnings("deprecation")
			public void Rider_Tab(WebDriver driver) throws IOException, InterruptedException {
				try {
					Thread.sleep(1000);
					
					
					//ABG Employee
					Rider_Tab=driver.findElement(By.xpath(IChamp_LandingPage.RiderTab));		   	
					Rider_Tab.click();
						Thread.sleep(1000);			
						Death_Disability_Input = driver.findElement(By.xpath(IChamp_LandingPage.AccDeath));				
						cell = sheet.getRow(6).getCell(39);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String death_disability = cell.getStringCellValue();
					       System.out.println(death_disability);	
						Death_Disability_Input.sendKeys(death_disability);
						Thread.sleep(1000);			
						Death_Benefit_Checkbox = driver.findElement(By.xpath(IChamp_LandingPage.Death_Benefit_Checkbox));	
					       Death_Benefit_Checkbox.click();	
						Thread.sleep(1000);
						Critical_Illness_Input = driver.findElement(By.xpath(IChamp_LandingPage.criticalIll));				
						cell = sheet.getRow(6).getCell(43);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String Critical_IllnessInput = cell.getStringCellValue();
					       System.out.println(Critical_IllnessInput);	
					       Critical_Illness_Input.sendKeys(Critical_IllnessInput);
						Thread.sleep(1000);
						Surgical_Care_Input = driver.findElement(By.xpath(IChamp_LandingPage.SurgCare));				
						cell = sheet.getRow(6).getCell(45);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String Surgical_CareInput = cell.getStringCellValue();
					       System.out.println(Surgical_CareInput);	
					       Surgical_Care_Input.sendKeys(Surgical_CareInput);
						Thread.sleep(1000);
						Hospital_Care_Input = driver.findElement(By.xpath(IChamp_LandingPage.HospCare));				
						cell = sheet.getRow(6).getCell(47);
					       cell.setCellType(Cell.CELL_TYPE_STRING);
					       String Hospital_CareInput = cell.getStringCellValue();
					       System.out.println(Hospital_CareInput);	
					       Hospital_Care_Input.sendKeys(Hospital_CareInput);
						Thread.sleep(1000);
						Calculate = driver.findElement(By.xpath(IChamp_LandingPage.Calculate));				
						Calculate.click();
						Thread.sleep(1000);
						Generate_Illustration = driver.findElement(By.xpath(IChamp_LandingPage.GenerateIllu));				
						Generate_Illustration.click();
						Thread.sleep(1000);
						CancerShield_Checkbox = driver.findElement(By.xpath(IChamp_LandingPage.NoteCheck1));				
						CancerShield_Checkbox.click();
						Thread.sleep(1000);
						CritiShield_Checkbox = driver.findElement(By.xpath(IChamp_LandingPage.NoteCheck2));				
						CritiShield_Checkbox.click();
						Thread.sleep(1000);
						Skip_button = driver.findElement(By.xpath(IChamp_LandingPage.NoteSkip));				
						Skip_button.click();
						Thread.sleep(2000);
						Proceed_Eapp = driver.findElement(By.xpath(IChamp_LandingPage.ProceedEapp));				
						Proceed_Eapp.click();
						Thread.sleep(3000);
				       Extent_Reporting.Log_Pass("Entering ABG Employee ID","Entered ABG Employee ID");
				       Extent_Reporting.Log_Pass_with_Screenshot("ABG Employee Checkbox Selected", "Entered Employee ID", driver);			    
				}
				catch(Exception e)
				{
					Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
					e.printStackTrace();
				}
			
			}
			


//Ichamp_MinorIndian_InsuredDetails


@SuppressWarnings("deprecation")
public void IChamp_Life_Insured_Details_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
	try {
		  FileInputStream finput = new FileInputStream(src);
		  workbook = new XSSFWorkbook(finput);
		  sheet= workbook.getSheetAt(4);
		  
		//Enter First Name
		   first_Name=driver.findElement(By.xpath(IChamp_LandingPage.fname));
		   cell = sheet.getRow(6).getCell(3);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String firstName = cell.getStringCellValue();
	       System.out.println(firstName);	
	       first_Name.sendKeys(firstName);
	       Extent_Reporting.Log_Pass("Enterng FirstName","Entered FirstName Successfully");
		
		//Enter Last Name
	       last_Name=driver.findElement(By.xpath(IChamp_LandingPage.Lname));
		   cell = sheet.getRow(6).getCell(4);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String lastName = cell.getStringCellValue();
	       System.out.println(lastName);
	       last_Name.sendKeys(lastName);
	       Extent_Reporting.Log_Pass("Enterng LastName","Entered LastName Successfully");
	       
	     //Enter Date Of Birth
	       DoB=driver.findElement(By.xpath(IChamp_LandingPage.Dob));
		   cell = sheet.getRow(6).getCell(5);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String DateofBirth = cell.getStringCellValue();
	       System.out.println(DateofBirth);
	       DoB.sendKeys(DateofBirth);
	       Extent_Reporting.Log_Pass("Enterng Date Of Birth","Entered Date Of Birth Successfully"); 
	       
	     //Select Gender
	       Thread.sleep(1000);
	       last_Name.click();
	       Thread.sleep(1000);

	       Select_Gender=driver.findElement(By.xpath(IChamp_LandingPage.Gender_Male));
		   cell = sheet.getRow(6).getCell(6);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String Gender = cell.getStringCellValue();
	       System.out.println(Gender);
	       Select_Gender.click();
	       Extent_Reporting.Log_Pass("Selecting Gender","Male Gender Selected");
	       
	     //Click Illustration
	       Click_Illustration=driver.findElement(By.xpath(IChamp_LandingPage.Illustrate));
	       Click_Illustration.click();
			Thread.sleep(1000);

	       Extent_Reporting.Log_Pass("Clicking Illustration","Illustration Clicked");
	       Extent_Reporting.Log_Pass_with_Screenshot("Login Successful", "Successfully entered the Login details", driver);

	}
	catch(Exception e)
	{
		Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
		e.printStackTrace();
	}
}
// Product Select
	@SuppressWarnings("deprecation")
	public void Select_Product_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			
			//Select Product
			Product_Dropdown=driver.findElement(By.xpath(IChamp_LandingPage.Savings_With_Protection));
			   cell = sheet.getRow(6).getCell(11);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String product = cell.getStringCellValue();
		       System.out.println(product);	
		       Select product_Dropdown = new Select(Product_Dropdown);
		       product_Dropdown.selectByValue("BSLI Vision Life Secure Plan");
		       Extent_Reporting.Log_Pass("Selecting Product","Selected BSLI Vision Life Secure Plan");
			
			//Click Next
		       Next_Button=driver.findElement(By.xpath(IChamp_LandingPage.Next));
		       Next_Button.click();
				Thread.sleep(1000);

		       Extent_Reporting.Log_Pass("Clicking Next","Clicked Next");
		       Extent_Reporting.Log_Pass_with_Screenshot("Product Selected", "Selected BSLI Income Assured Plan", driver);

		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Product Not Selected","Element not found", driver);
			e.printStackTrace();
		}
	}
	
	//Client Tab

	@SuppressWarnings("deprecation")
	public void Client_Tab_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);

			//Scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);

			//Enter Proposer State
			Proposer_State=driver.findElement(By.xpath(IChamp_LandingPage.ProposerState));
			   cell = sheet.getRow(6).getCell(15);
		       cell.setCellType(Cell.CELL_TYPE_STRING);
		       String proposerState = cell.getStringCellValue();
		       System.out.println(proposerState);	
		       Proposer_State.sendKeys(proposerState);
				Thread.sleep(1000);
		       Proposer_State = driver.findElement(By.xpath("//li[text()='MAHARASHTRA']"));
		       Proposer_State.click();
				Thread.sleep(1000);
		       Extent_Reporting.Log_Pass("Entering Proposer State","Entered Proposer State");
			
		     //Enter Advisor State
		       Advisor_State=driver.findElement(By.xpath(IChamp_LandingPage.AdvisorState));
				   cell = sheet.getRow(6).getCell(16);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String advisorState = cell.getStringCellValue();
			       System.out.println(advisorState);	
			       Advisor_State.sendKeys(advisorState);
					Thread.sleep(1000);
			       Advisor_State2 = driver.findElement(By.xpath("//li[text()='GUJARAT']"));
			       Advisor_State2.click();
					Thread.sleep(1000);
			       Extent_Reporting.Log_Pass("Entering Advisor State","Entered Advisor State");
		       Extent_Reporting.Log_Pass_with_Screenshot("Entering Client Details", "Entered Client Details", driver);

	
		//Scroll
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);

	//Enter Proposer Details
		
		//Enter proposerFirst Name
		   first_Name=driver.findElement(By.xpath(IChamp_LandingPage.Proposer_First_Name));
		   cell = sheet.getRow(6).getCell(17);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String proposerfirstName = cell.getStringCellValue();
	       System.out.println(proposerfirstName);	
	       first_Name.sendKeys(proposerfirstName);
	       Extent_Reporting.Log_Pass("Enterng ProposerFirstName","Entered ProposerFirstName Successfully");
		
		//Enter proposer Last Name
	       last_Name=driver.findElement(By.xpath(IChamp_LandingPage.Proposer_Last_Name));
		   cell = sheet.getRow(6).getCell(18);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String proposerlastName = cell.getStringCellValue();
	       System.out.println(proposerlastName);
	       last_Name.sendKeys(proposerlastName);
	       Extent_Reporting.Log_Pass("Enterng LastName","Entered LastName Successfully");
	       
	     //Enter Date Of Birth
	       DoB=driver.findElement(By.xpath(IChamp_LandingPage.Proposer_DOB));
		   cell = sheet.getRow(6).getCell(19);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String DateofBirth = cell.getStringCellValue();
	       System.out.println(DateofBirth);
	       DoB.sendKeys(DateofBirth);
	       Extent_Reporting.Log_Pass("Enterng Date Of Birth","Entered Date Of Birth Successfully"); 
	       
	     //Select Gender
	       Thread.sleep(1000);
	       last_Name.click();
	       Thread.sleep(1000);

	       Select_Gender=driver.findElement(By.xpath(IChamp_LandingPage.Proposer_Gender_Male));
		   cell = sheet.getRow(6).getCell(20);
	       cell.setCellType(Cell.CELL_TYPE_STRING);
	       String Gender = cell.getStringCellValue();
	       System.out.println(Gender);
	       Select_Gender.click();
	       Extent_Reporting.Log_Pass("Selecting Gender","Male Gender Selected");
	}
		
	       catch(Exception e)
			{
				Extent_Reporting.Log_Fail("Client Details not entered","Element not found", driver);
				e.printStackTrace();
			}	
		
		
	
	}
	
	//Policy Tab

	@SuppressWarnings("deprecation")
	public void Policy_Tab(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			
			
			//ABG Employee
			Policy_Tab=driver.findElement(By.xpath(IChamp_LandingPage.policy_Tab));
			   	
			Policy_Tab.click();
				Thread.sleep(1000);
				//Scroll
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
				Thread.sleep(1000);
				ABG_Employee_Checkbox = driver.findElement(By.xpath(IChamp_LandingPage.ABGEmployeeCheckbox));
				ABG_Employee_Checkbox.click();
				Thread.sleep(1000);

				Employee_ID = driver.findElement(By.xpath(IChamp_LandingPage.EmpId));  
				cell = sheet.getRow(6).getCell(27);
			       cell.setCellType(Cell.CELL_TYPE_STRING);
			       String EmployeeID = cell.getStringCellValue();
			       System.out.println(EmployeeID);	
			       Employee_ID.sendKeys(EmployeeID);
			
				Thread.sleep(1000);
		       Extent_Reporting.Log_Pass("Entering ABG Employee ID","Entered ABG Employee ID");
		       Extent_Reporting.Log_Pass_with_Screenshot("ABG Employee Checkbox Selected", "Entered Employee ID", driver);

		    
		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			e.printStackTrace();
		}
	
}
		  
	//Rider Tab
	@SuppressWarnings("deprecation")
	public void Rider_Tab_MinorIndian(WebDriver driver) throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			
			
			//ABG Employee
			Rider_Tab=driver.findElement(By.xpath(IChamp_LandingPage.RiderTab));		   	
			Rider_Tab.click();
				Thread.sleep(1000);			
				Thread.sleep(1000);
				Calculate = driver.findElement(By.xpath(IChamp_LandingPage.Calculate));				
				Calculate.click();
				Thread.sleep(1000);
				Generate_Illustration = driver.findElement(By.xpath(IChamp_LandingPage.GenerateIllu));				
				Generate_Illustration.click();
				Thread.sleep(1000);
				Thread.sleep(2000);
				Proceed_Eapp = driver.findElement(By.xpath(IChamp_LandingPage.ProceedEapp));				
				Proceed_Eapp.click();
				Thread.sleep(3000);
		       Extent_Reporting.Log_Pass("Entering ABG Employee ID","Entered ABG Employee ID");
		       Extent_Reporting.Log_Pass_with_Screenshot("ABG Employee Checkbox Selected", "Entered Employee ID", driver);			    
		}
		catch(Exception e)
		{
			Extent_Reporting.Log_Fail("Details not entered","Element not found", driver);
			e.printStackTrace();
		}
	
	}
}
	
	
	
	
	