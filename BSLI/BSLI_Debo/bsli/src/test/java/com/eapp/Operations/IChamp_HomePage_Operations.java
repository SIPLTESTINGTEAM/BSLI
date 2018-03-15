package com.eapp.Operations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eapp.Elements.IChamp_HomePage;
import com.eapp.Reporting.Extent_Reporting;

public class IChamp_HomePage_Operations {
	IChamp_HomePage homepage = new IChamp_HomePage();
	WebElement IChamp_Button;
	public void IChamp_Click(WebDriver driver) throws IOException, InterruptedException {
		try {
		 IChamp_Button =driver.findElement(By.xpath(IChamp_HomePage.iChamp_Link));
		 IChamp_Button.click();
		 Extent_Reporting.Log_Pass("Clicking IChamp Link","IChamp Link Clicked");
		 Extent_Reporting.Log_Pass_with_Screenshot("IChamp Link Clicked", "Successfully Clicked IChamp Link", driver);

		}

		catch(Exception e)
		{
			Extent_Reporting.Log_Fail( "IChamp Link does not Exist","IChamp Link does not Exist", driver);
			e.printStackTrace();
		}
	}
}