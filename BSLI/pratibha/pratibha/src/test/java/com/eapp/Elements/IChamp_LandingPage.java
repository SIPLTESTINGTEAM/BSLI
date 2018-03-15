package com.eapp.Elements;

public class IChamp_LandingPage {
	//Home
	//lifeinsured details
		public static String fname="//input[@id='liFirstName']";
		public static String Lname="//input[@id='liLastName']";
		public static String Dob="//input[@id='liDOB']";
		public static String Age="//*[@id='liAge']";

		public static String Gender_Male="//*[@id='liDetailsHome']/div[4]/div[1]/div/div[1]";
		public static String Gender_Female="//*[@id='liDetailsHome']/div[4]/div[1]/div/div[2]";
		public static String Illustrate="//a[@title='Submit']";
		
		
		//Product List
		public static String Protection_Solution="//*[@id='planSelectorPort']/div/ul/li[1]/div/div[2]/select";
		public static String Children_Future_Solution="//*[@id='planSelectorPort']/div/ul/li[2]/div/div[2]/select";
		public static String Wealth_With_Protection_Solution="//*[@id='planSelectorPort']/div/ul/li[3]/div/div[2]/select";
		public static String Savings_With_Protection="//*[@id='planSelectorPort']/div/ul/li[4]/div/div[2]/select";
		public static String Health_Wellness_Solution="//*[@id='planSelectorPort']/div/ul/li[5]/div/div[2]/select";
		public static String Retirement_Solution="//*[@id='planSelectorPort']/div/ul/li[6]/div/div[2]/select";
		public static String Next="//a[text()='Next']";	
		
		//Details
		//client
		public static String NRI_Checkbox="//*[@id='isInsNRIToggle']";
		public static String NRI_Dropdown="//*[@id='insNriType']";
		public static String ProposerState="//input[@id='propState']";
		public static String AdviserState="//input[@id='advState']";
		public static String State1="//li[text()='MAHARASHTRA']";
		public static String State3="//li[text()='GUJRAT']";
		public static String State2="//li[text()='BIHAR']";
		public static String AdvisorState="//input[@id='advState']";
		public static String insured_Proposer_Checkbox="//*[@id='proposeToggle']";
		public static String Proposer_First_Name="//*[@id='proFirstName']";
		public static String Proposer_Last_Name="//*[@id='proLastName']";
		public static String Proposer_DOB="//*[@id='proDOB']";
		public static String Proposer_Gender_Male="//*[@id='genderMaleImg']";
		public static String Proposer_Gender_Female="//*[@id='genderFemaleImg']";
		public static String Joint_Life_Checkbox="//*[@id='jointLifeToggle']";
		public static String sec_fname="//*[@id='secInsFname']";
		public static String sec_lname="//*[@id='secInsLname']";
		public static String sec_DOB="//*[@id='secInsDOB']";
		public static String sec_Gender_Male="//*[@id='genderMaleImg']";
		public static String sec_Gender_Female="//*[@id='genderFemaleImg']";
		public static String sec_Category="//*[@id='secInsCatagory']";
		public static String Individual_RadioButton="//*[@id='propIndRadio']";
		public static String Company_RadioButton="//*[@id='propIndRadio']";
		public static String Company_Name="//*[@id='propBuisnName']";
		public static String Date_of_incorporation="//*[@id='propBuisnName']";
		public static String ClickTo_Eapp="//*[@id='pagePort']/div[2]/div/div[2]/div[3]/div[4]";
		//Lives INsured 
		public static String LIVINsuredFN="//*[@id='insuredFirstName']";
		public static String LIVINsuredLN="//*[@id='insuredLastName']";
		public static String LIVINsuredDOB="//*[@id='insuredsDOB']";
		public static String LIVINsuredRelation="//*[@id='proposerReltn']";
		public static String LIVINsuredAdd="//*[@id='addInsureds']/div[3]/div[3]/div[2]/div/a";
		
		//policy
		public static String policy_Tab="//*[@id='mainTab']/div[1]/div/div[2]/div/a/span";

		public static String Category="//*[@id='category']";
		public static String Plan_Option="//*[@id='saOption']";
		public static String Increasing_Level="//*[@id='increasingLevel']";
		public static String Policy_Term="//*[@id='policyTerm']";
		public static String Pay_Mode="//*[@id='payMode']";
		public static String PPT="//*[@id='ppt']";
		public static String ECS="//*[@id='ecsToggle']";
		public static String PollicyTab="(//a[@class='stepLink'])[2]";
		public static String EmpId="//input[@id='abgEmployeeId']";
		public static String ABGEmployeeCheckbox="//input[@id='abgEmpToggle']";
		public static String IncomeBenefit="//*[@id='incomeBenefit']";
		
		
		
				//rider
				public static String RiderTab="(//a[@class='stepLink'])[3]";
				public static String Waiver_Of_Premium_checkbox="//input[@id='waiverPremiumToggle']";
				public static String Death_Benefit_Checkbox="//input[@id='ADBPToggle']";
				public static String AccDeath="//input[@id='txtADD']";
				public static String criticalIll="//input[@id='txtCI']";
				public static String SurgCare="//input[@id='txtSC']";
				public static String HospCare="//input[@id='txtHC']";
				public static String Calculate="//a[text()='Calculate']";
				public static String GenerateIllu="//a[text()='Generate Illustration']";
				public static String Click_Eapp="//a[text()='Click! to proceed EAPP']";
				public static String NoteCheck1="//input[@id='addOnRiderBCS']";
				public static String NoteCheck2="//input[@id='addOnRiderBCR']";
				public static String NoteSkip="//input[@id='typBtnSkipRider']";	
				public static String btnIagree="//input[contains(@id,'btnIagree')]";
		
		//alternate scenarios
		public static String withdraw_In_Successive_Years_yes="//*[@id='pxTabAltScnario']/div[2]/div[1]/div/label[1]";
		public static String withdraw_In_Successive_Years_no="//*[@id='pxTabAltScnario']/div[2]/div[1]/div/label[2]";
		public static String added_In_Successive_Years_yes="//*[@id='pxTabAltScnario']/div[2]/div[3]/div/label[1]";
		public static String added_In_Successive_Years_no="//*[@id='pxTabAltScnario']/div[2]/div[3]/div/label[2]";
		public static String interest_rate="//*[@id='interestRate']";
		public static String reduced_paidup="//*[@id='reducedPaidUpToggle']";
		public static String reduced_paidup_year="//*[@id='reducedPaidUpYear']";
		public static String fixed_withdrawal_amount="//*[@id='fxdWlAmt']";
		public static String fixed_withdrawal_start_year="//*[@id='fxdWlStrtYr']";
		public static String fixed_withdrawal_end_year="//*[@id='fxdWlEndYr']";
		public static String fixed_topups_amount="//*[@id='fxdTpAmt']";
		public static String fixed_topups_start_year="//*[@id='fxdTpStrtYr']";
		public static String fixed_topups_end_year="//*[@id='fxdTpEndYr']";	
		
		//reports
		public static String basic_illustration="//*[@id='basicIllustrationToggle']";
		public static String key_features="//*[@id='keyFeaturesToggle']";
		public static String summary_illustration="//*[@id='summaryIllustrationToggle']";
		public static String alternate_scenario="//*[@id='altScenarioToggle']";
		public static String rpu_scenario="//*[@id='rpuScenarioToggle']";
		public static String fund_performance="//*[@id='fundPerToggle']";
		public static String current_rate="//*[@id='currentRateToggle']";
		public static String preTax_vs_postTax="//*[@id='prePostTaxToggle']";
		public static String sv="//*[@id='svToggle']";
		public static String ssv="//*[@id='ssvToggle']";
		
		//RecentCases
		public static String RecentCase="//*[@id='recentCasesTab']";
		public static String ProceedEapp="//*[@id='pagePort']/div[2]/div/div[2]/div[1]/a";
		
		
		
	
}
