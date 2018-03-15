package com.eapp.Operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eapp.Elements.IChamp_HomePage;
import com.eapp.Elements.IChamp_LoginPage;
import com.eapp.Reporting.Extent_Reporting;

public class IChamp_LoginPage_Operations {
WebDriver driver;
XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFCell cell;
WebElement username_input;
IChamp_HomePage homepage = new IChamp_HomePage();

	@SuppressWarnings("deprecation")
	public void IChamp_Login(WebDriver driver) throws IOException, InterruptedException {
		try {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 300);
		
		   username_input=driver.findElement(By.xpath(IChamp_LoginPage.Uname));
		   String username = "550036";
		   username_input.clear();
		   Thread.sleep(1000);

		   username_input.sendKeys(username);
		   Extent_Reporting.Log_Pass("Entering Username","Entered Username Successfully");

		   Thread.sleep(1000);

		  WebElement password_input=driver.findElement(By.xpath(IChamp_LoginPage.Pwd));
		  String password = "p@$$w0RD4Te$t";
		  password_input.sendKeys(password);
		  Extent_Reporting.Log_Pass("Entering Password","Entered Password Successfully");

WebElement Login_Button=driver.findElement(By.xpath(IChamp_LoginPage.Login));
Login_Button.click();

Extent_Reporting.Log_Pass_with_Screenshot("Login Successful", "Successfully entered Login details", driver);
		}
		catch(Exception e)
		{
			System.out.println("Login Failed");
			Extent_Reporting.Log_Fail("Login Failed","Element is missing", driver);
			e.printStackTrace();
		}
	}
	
}
