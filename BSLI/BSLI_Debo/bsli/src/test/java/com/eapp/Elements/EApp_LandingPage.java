package com.eapp.Elements;

public class EApp_LandingPage {

	//hirarchy
	public static String Iagree_SalesH="//a[@id='btnIagree']";
	public static String Iagree_Illustration="//a[@title='I Agree']";
	
	//EApps_Customer_Details_Basic details
		public static String Toggle_Yes_BSLI_Policy="//*[@id='basicDetailsPart']/div/div[1]/div[1]/div/div/span[2]";
		public static String Toggle_No_BSLI_Policy="//*[@id='basicDetailsPart']/div/div[1]/div[1]/div/div/span[1]";
		public static String Proposer_Policy_Number="//*[@id='propPolicy']";
		public static String Insurer_Policy_Number="//*[@id='insPolicy']";
		public static String Proposer_Policy_Number_Validate="//*[@id='propShowHideExistingPolicy']/div[3]/a/img";	
		public static String Insurer_Policy_Number_Validate="//*[@id='insShowHideExistingPolicy']/div[3]/a/img";	
		public static String Proposer_UID="//*[@id='propUID']";
		public static String Insurer_UID="//*[@id='insUID']";
		
		//Personal Details
		public static String personal_Details="//*[@id=\"environAccord\"]/li[1]/div[1]";
		public static String Title="//*[@id=\"insTitle\"]";
		public static String Proposer_MiddleName="//*[@id='propMName']";
		public static String Insurer_MiddleName="//*[@id='insMName']";
		public static String relationshipwithInsurer="//*[@id='propReltn']";
		public static String Proposer_MaritalStatus = "//*[@id='propMaritalStatus']";
		public static String Insurer_MaritalStatus="//*[@id='insMaritalStatus']";
		public static String Insurer_FatherName="//*[@id='insFatherName']";
		public static String Insurer_BirthState="//*[@id='insBirthState']";
		public static String Insurer_Living_With ="//*[@id='minorLivingWith']";
		public static String Insurer_Study ="//*[@id='SCHOOL']";
		public static String Insurer_Study_2ndoption ="//*[@id='COLLEGE']";
		public static String Insurer_Class ="//*[@id='classStudyingIn']";
		public static String Insurer_Tel_Res_No ="//*[@id='insComTelNo']";
		public static String Insurer_Mob_No ="//*[@id='insComMobNo']";
		public static String Insurer_AltMob_No ="//*[@id='insComAltNo']";	
		public static String Insurer_State="//*[@id='ui-id-81']";
		public static String Insurer_BirthCity="//*[@id='insBirthCity']";
		public static String Insurer_Nationality_Dropdown="//*[@id='insNationality']";
		public static String Insurer_Nationality_Other="//*[@id='insNationalityOthers']";
		public static String Proposer_Citizenship_Yes="//*[@id='propNationalityNRI']/div[1]/div[1]/div[1]/div/div/span[2]";
		public static String Insurer_Citizenship_Yes="//*[@id='insNationalityNRI']/div[1]/div[1]/div[1]/div/div/span[2]";
		public static String Proposer_Country_Name="//*[@id='propCitizenOthersCountryName']";
		public static String Insurer_Country_Name="//*[@id='insCitizenOthersCountryName']";
		public static String Proposer_Citizenship_NO="//*[@id='propNationalityNRI']/div[1]/div[1]/div[1]/div/div/span[1]";
		public static String Insurer_Citizenship_NO="//*[@id='insNationalityNRI']/div[1]/div[1]/div[1]/div/div/span[1]";
		public static String Proposer_Tax_Resident_Yes="//*[@id='propNationalityNRI']/div[2]/div[1]/div[1]/div/div/span[2]";
		public static String Insurer_Tax_Resident_Yes="//*[@id='insNationalityNRI']/div[2]/div[1]/div[1]/div/div/span[2]";
		public static String Proposer_Tax_Resident_NO="//*[@id='propNationalityNRI']/div[2]/div[1]/div[1]/div/div/span[1]";
		public static String Insurer_Tax_Resident_NO="//*[@id='insNationalityNRI']/div[2]/div[1]/div[1]/div/div/span[1]";
		public static String Proposer_Unique_Tax_Indentification_Number="//*[@id='propTaxIdenNo']";
		public static String Insurer_Unique_Tax_Indentification_Number="//*[@id='insTaxIdenNo']";
		public static String Toggle6="//*[@id=\"insNationalityNRI\"]/div[2]/div[1]/div[1]/div/div/span[1]";
		
		//Proffessional Details
		public static String proffessional_Details="//*[@id='environAccord']/li[2]/div[1]";
		public static String qualification_Dropdown="//select[@id='propQualification']";
		public static String Other_qualification="//*[@id='propOtherQualification']";
		public static String occupation_Dropdown="//select[@id='propOccupation']";


		//option:Business
				public static String BussEmployerName="(//input[@id='propNameOfEmployer'])[1]";
				public static String NatureofBus="//*[@id='propNatureBusiness']";
				public static String BUsOrganizationType="(//*[@id='propTypeOrg'])[1]";
				public static String BusExperience="(//*[@id='propExperience'])[1]";
				public static String BusAnnualIncome="(//*[@id='propAnnualIncome'])[1]";
				
				
				//option:Service
				public static String SerEmployerName="(//input[@id='propNameOfEmployer'])[2]";
				public static String designation="(//*[@id='propDesignation'])[1]";
				public static String SerOrganizationType="(//*[@id='propTypeOrg'])[2]";
				public static String SerNatureOfDuty="//*[@id='propNatureDuties']";
				public static String SerExperience="(//*[@id='propExperience'])[2]"; 
				public static String SerAnnualIncome="(//*[@id='propAnnualIncome'])[2]";
				
				//option:Professional
				public static String ProEmployerName="(//input[@id='propNameOfEmployer'])[3]";
				public static String Prodesignation="(//*[@id='propDesignation'])[2]";
				public static String ProOrganizationType="(//*[@id='propTypeOrg'])[3]";
				public static String ProNatureOfDuty="(//*[@id='propNatureDuties'])[2]";
				public static String ProExperience="(//*[@id='propExperience'])[3]"; 
				public static String ProAnnualIncome="(//*[@id='propAnnualIncome'])[3]";
		
		
		//Driver Mandate Form
				public String passwordPM="//*[@id='propDriverQuestionnire']/div/a";
				public String Truck="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[2]/div[2]/div[1]/label";
				public String Taxi="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[2]/div[2]/div[2]/label";
				public String Driving_License="//*[@id='drivingLicNumInput']";
				public String Long_Distance="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[4]/div[2]/label";
				public String Short_Distance="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[4]/div[3]/label";
				public String License_Suspended="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[5]/div[2]/div/label";
				public String Met_With_An_Accident="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[5]/div[3]/div/label";
				public String Reckless_Driving="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[5]/div[4]/div/label";
				public String Influence_Of_Alcohol="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[5]/div[5]/div/label";
				public String Aditional_Information_Toggle_No="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[6]/div[2]/div/div/span[1]";
				public String Aditional_Information_Toggle_Yes="//*[@id='drivingQuePopup']/div/div/div/div[2]/div/div[6]/div[2]/div/div/span[2]";
				public String Aditional_Information_Input="//*[@id='addDrivingInfoInput']";
				public String Armed_Forces="//*[@id='propArmedQuestionnire']/div/a/span";
				
				//Armed Forces Mandate Form
				public String Armed_Forces_Form="//*[@id='propArmedQuestionnire']/div/a/span";
				public String Navy_Radio_Button="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/label";
				public String AirForce_Radio_Button="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/label";
				public String CoastGuard_Radio_Button="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[4]/label";
				public String Rank_Designation="//*[@id='armRankDes']";
				public String Present_Posting="//*[@id='armPresPost']";
				public String Unusual_Hazards_Toggle_NO="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[1]";
				public String Unusual_Hazards_Toggle_Yes="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[2]";
				public String AirCrew_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[1]/label";
				public String OrdnanceHandling_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[2]/label";
				public String ParaTrooper_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[3]/label";
				public String MinesClearing_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[5]/label";
				public String OverseasDuties_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[6]/label";
				public String Submarines_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[7]/label";
				public String Divers_Checkbox="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[4]/div[9]/label";
				public String Without_Explosives_Radio_Button="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[5]/div[5]/div[1]/div[2]/label";
				public String Additional_Information_Toggle_NO="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[1]";
				public String Additional_Information_Toggle_Yes="//*[@id='armedForcePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[2]";
				public String Additional_Information_Input="//*[@id='armAddInput']";


				//Retired
				public static String Spouse_annual_Income="//*[@id='propParentsAnnualIncome']";
				
		
				//Other Occupation
				public static String Other_Occupation="//*[@id='propOtherOccupation']";

		//PAN
				public static String pan="//input[@id='propPAN']";
				public static String validate_Button="//*[@id='pancardParent']/div[2]/div";
				
		//Communication Address
		public static String Communication_Address="//*[@id='environAccord']/li[3]/div[1]";	
		public static String Proposer_Address1="//*[@id='propComAddr1']";
		public static String Proposer_Address2="//*[@id='propComAddr2']";
		public static String Proposer_Address3="//*[@id='propComAddr3']";		
		public static String Insurer_Address1="//*[@id='insComAddr1']";
		public static String Insurer_Address2="//*[@id='insComAddr2']";
		public static String Insurer_Address3="//*[@id='insComAddr3']";	
		public static String Proposer_Area="//*[@id='propCommArea']";
		public static String Insurer_Area="//*[@id='insCommArea']";
		public static String Proposer_city="//*[@id='propCommCity']";
		public static String Insurer_city="//*[@id='insCommCity']";
		public static String Proposer_Pin="//input[@id='propComPIN']";
		public static String Insurer_Pin="//input[@id='insComPIN']";
		public static String Proposer_Tel_Number="//*[@id='propComTelNo']";
		public static String Insurer_Tel_Number="//*[@id='insComTelNo']";
		public static String Proposer_mobile_Number="//*[@id='propComMobNo']";
		public static String Insurer_mobile_Number="//*[@id=\"insComMobNo\"]";
		public static String Proposer_Alternate_Number="//*[@id='propComAltNo']";
		public static String Insurer_Alternate_Number="//*[@id='insComAltNo']";
		public static String Proposer_emailID="//*[@id='propComEmail']";
		public static String Insurer_emailID="//*[@id=\"secondaryComEmail\"]";	
		public static String Get_Email_Toggle1_Yes="//*[@id='environAccord']/li[3]/div[2]/div/div[5]/div[1]/div/div/span[2]";
		public static String Get_Email_Toggle1_NO="//*[@id='environAccord']/li[3]/div[2]/div/div[5]/div[1]/div/div/span[1]";
		public static String Get_Email_Toggle2_Yes="//*[@id='environAccord']/li[3]/div[2]/div/div[6]/div[1]/div/div/span[2]";
		public static String Get_Email_Toggle2_NO="//*[@id='environAccord']/li[3]/div[2]/div/div[6]/div[1]/div/div/span[1]";
		public static String Get_Email_Toggle3_Yes="//*[@id='environAccord']/li[3]/div[2]/div/div[7]/div[1]/div/div/span[2]";
		public static String Get_Email_Toggle3_NO="//*[@id='environAccord']/li[3]/div[2]/div/div[7]/div[1]/div/div/span[1]";

		//EIA Details
		public static String EIA_Details="//*[@id='insEIADetails']/div[1]";
		public static String EIA_NO="//*[@id='insEIADetails']/div[2]/div/div[1]/div[1]/div/label[2]";
		public static String EIANum="//*[@id='propEIANumber']";
		public static String EIAEmail="//*[@id='propIREmail']";
		
		//Other Details
		public static String Proposer_Other_Details="//*[@id='propOtherDetails']/div[1]";
		public static String Insurer_Other_Details="//*[@id='insOtherDetails']/div[1]";
		public static String Proposer_PEP_Toggle_Yes="//*[@id='propOtherDetails']/div[2]/div/div[1]/div[2]/div/div/span[2]";
		public static String Insurer_PEP_Toggle_Yes="//*[@id='insOtherDetails']/div[2]/div/div[1]/div[2]/div/div/span[2]";
		public static String PEP_Details="//*[@id='isPEPDetailsInpt']";
		public static String Proposer_PEP_Toggle_NO="//*[@id='propOtherDetails']/div[2]/div/div[1]/div[2]/div/div/span[1]";
		public static String Insurer_PEP_Toggle_NO="//*[@id='insOtherDetails']/div[2]/div/div[1]/div[2]/div/div/span[1]";
		public static String Insurer_Purpose_Risk="//*[@id='insPurposeOfIns']/div[2]/label[1]";
		public static String Insurer_Purpose_Savings="//*[@id='insPurposeOfIns']/div[2]/label[2]";
		public static String Insurer_Purpose_Others="//*[@id='insPurposeOfIns']/div[2]/label[3]";
		
		public static String IAgree_button ="//*[@id='basicDetailsPart']/div/div[5]/a";
		public static String InsurerIAgreeButton="//*[@id='basicDetailsPart']/div/div[4]/a";
		
		//EApps_Customer_Details_Basic details_Nominee Details
		public static String NomineeFirstNam="//*[@id='nomineeFName']";
		public static String NomineeLastNam="//*[@id='nomineeLName']";
		public static String NomineeDOB="//*[@id='nomineeDOB']";
		public static String Relationship="//*[@id='nomineeReltn']";
		public static String NomineeShare="//*[@id='nomineeShare']";
		public static String NomineeContact="//*[@id='nomineeContact']";
		public static String NomineeAdd="//*[@id='addNominee']/div[3]/div[4]/span/img";
		
		
		//Previous Policy Details
		public static String Toggle13="(//input[@name='check-2'])";
		public static String Toggle14="//input[@id='isPrvPolicy']";
		public static String existingpolicyadd="//*[@id=environAccord']/li[1]/div[1]/i[1]";
		public static String ExistingPolicyNo="//*[@id='prvPolicyNo']";
		public static String ExistingInsuredName="//*[@id='prvPolicyInsurer']";
		public static String ExistingPolicyDate="//*[@id='prvPolicyDateAppl']";
		public static String ExistingPolicyIssueDate="//*[@id='prvPolicyIssueDate']";
		public static String ExistingPolicySum="//*[@id='prvPolicySumAssured']";
		public static String ExistingPolicyAdd="//*[@id='addPrvPolicy']/div[2]/div[3]/span/img";
		public static String PlusSign6="//*[@id='environAccord']/li[2]/div[1]/i[1]";
		public static String Toggle15="//input[@id='isPrvPolicyDeclined']";
		public static String Toggle16="//input[@name='check-1']";
		public static String DeclinedPolicyNo="//*[@id='declPolicyNo']";
		public static String DeclinedInsuredName="//*[@id='declPolicyInsurer']";
		public static String DeclinedPolicyDate="//*[@id='declPolicyDateAppl']";
		public static String DeclinedPolicyIssueDate="//*[@id='declPolicyIssueDate']";
		public static String DeclinedPolicySum="//*[@id='declPolicySumAssured']";
		public static String DeclinedPolicyReason="//*[@id='declPolicyReason']";
		public static String DeclinedPolicyAdd="//*[@id='addDeclPolicy']/div[2]/div[4]/span/img";
		public static String familyinsuranceaddbutton="//*[@id='environAccord']/li[3]/div[1]/i[1]";
		public static String brotherno= "//*[@id='brothersNo']";
		public static String sisterno= "//*[@id='sistersNo']";
		public static String allinsured= "//*[@id='allInsured']";
		public static String allrnotinsured= "//*[@id='allInsuredNot']";
		public static String fathersinsurance= "//input[@name='check-2']";
		public static String mothersinsurance="//*[@id='motherInsurence']/div[1]/div/div[1]/div/div/span[1]";
		public static String brothersinsurance="//*[@id='brotherInsurence']/div[1]/div/div[1]/div/div/span[1]";
		public static String sistersinsurance="//*[@id='sisterInsurence']/div[1]/div/div[1]/div/div/span[1]";
		public static String Iagree3="//a[@title='I Agree']";
		
		//Bank Details
		public static String policypayoutdetailsaddbutton ="//*[@id='environAccord']/li[1]/div[1]/i[1]";
		public static String AccountHolderNam="//*[@id='payOutAccountHolder']";
		public static String AccountNum="//*[@id='payOutAccountNo']";
		public static String AccountType="//*[@id='payOutSavings']";
		public static String AccountType1="//*[@id='payOutCurrent']";
		public static String IFSC="//*[@id='IFSCCode']";
		public static String PlusSign7="//*[@id='environAccord']/li[2]/div[1]/i[1]";
		public static String DirectBill="//*[@id='ecsDirectDebit']";
		public static String Iagree4="//a[@title='I Agree']";
		
		//Bank Details
				//ECS Form
				public String ECS_Radio_Button="//*[@id='paymentMethodSelect']/label[2]";
				public String SB_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[1]/label";
				public String CA_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[2]/label";
				public String CC_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[3]/label";
				public String SB_NRE_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[4]/label";
				public String SB_NRO_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[5]/label";
				public String Others_Radio_Button="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div[3]/div[3]/div[6]/label";
				public String Other_Method="//*[@id='otherMethodName']";
				public String Name_Bank_Records="//*[@id='personName']";
				public String Account_Number="//*[@id='accNo']";
				public String IFSC_Code="//*[@id='IFSCCode']";
				public String MICR_Code="//*[@id='MICRNo']";

				//Preferred Draw Date
				public String Draw_Date_8th="//*[@id='preferedDraw']/div/label[3]";
				public String Draw_Date_15th="//*[@id='preferedDraw']/div/label[4]";
				public String Draw_Date_22nd="//*[@id='preferedDraw']/div/label[5]";


		
		
		//Health Details
		//PersonalDetails
		public static String HealthPersonalDetail = "//*[@id='environAccord']/li[1]/div[1]/i[1]";		
		public static String HeightFt="//*[@id='heightFt']";
		public static String HeightInch="//*[@id='heightIn']";
		public static String Weight="//*[@id='weight']";
		public static String Toggle17="//input[@id='isWeightChanged']";
		public static String Weight_Change_inKG="//*[@id='weightChangeLastYear']";
		
		//if Toggle Yes
		public static String WeightChanDetails="//*[@id='weightChangeDetail']";
		
		public static String Weight_timeofBirth="//*[@id='weightAtBirth']";
		//LifeStyle Information
		public static String PlusSign8="//*[@id='environAccord']/li[2]/div[1]/i[1]";
		public static String Toggle18="//*[@id='isTravelPlan']";
		
		
		//to be insured Health tab
		public static String Family_History_addbutton="//*[@id='environAccord']/li[2]/div[1]/i[1]";
		public static String None_button="//*[@id='fMedicNone']";
		public static String insurability_button="//*[@id='environAccord']/li[3]/div[1]/i[1]";
		public static String availed_medical_service_no="//*[@id='minorQuestion1Container']/div/div/span[1]";
		public static String availed_medical_service_yes="//*[@id='minorQuestion1Container']/div/div/span[2]";
		public static String diagnose_with_disease_no="//*[@id='minorQuestion2Container']/div/div/span[1]";
		public static String diagnose_with_disease_yes="//*[@id='minorQuestion2Container']/div/div/span[2]";
		public static String diagnose_asthma_no="//*[@id='minorQuestion3Container']/div/div/span[1]";
		public static String diagnose_asthma_yes="//*[@id='minorQuestion3Container']/div/div/span[2]";
		public static String consult_doctor_no="//*[@id='minorQuestion4Container']/div/div/span[1]";
		public static String consult_doctor_yes="//*[@id='minorQuestion4Container']/div/div/span[2]";
		public static String agree_insurer_health="//*[@id='healthDetailsTab']/div/a";
		
		
		
	//////////////////////////////////////////////////////////////	
		//Travel Overseas Mandate form_Toggle Yes
		public static String TravelReasonVacation="//*[@id='reasonTravelVacation']";
		public static String TravelReasonBus="//*[@id='reasonTravelBusiness']";
		//Travel plan for next 12 month
		public static String NextTravelCountry="//*[@id='nextCountryInput']";
		public static String NextTravelCity="//*[@id='nextCityInput']";
		public static String NextTravelArrDate="//*[@id='nextArrDateInput']";
		public static String NextTravelDepDate="//*[@id='nextDepartDateInput']";
		public static String NextTravelVisaType="//*[@id='nextVisaTypeInput']";
		public static String NextTravelAdd="//*[@id='addtravelNextInfo']/div[6]/span/img";
		//Travel plan for past 12 month
		public static String PastTravelCountry="//*[@id='pastCountryInput']";
		public static String PastTravelCity="//*[@id='pastCityInput']";
		public static String PastTravelArrDate="//*[@id='pastArrDateInput']";
		public static String PastTravelDepDate="//*[@id='pastDepartDateInput']";
		public static String PastTravelVisaType="//*[@id='pastVisaTypeInput']";
		public static String pastTravelAdd="//*[@id='addtravelPastInfo']/div[6]/span/img";
		//Travel Questions
		public static String Nationality="//*[@id='overSeaNationality']";
		public static String Toggle_Yes1="//input[@id='propCheck']";
		public static String PropertyInOtherCountry="//*[@id='properyInput']";
		public static String Toggle_Yes2="//input[@id='resiePlanCheck']";
		public static String ResidentType="//*[@id='resiType']";
		public static String ResidentAdd="//*[@id='resiAddr']";
		public static String ResidentMedical="//*[@id='resiMedical']";
		public static String Toggle_Yes3="//input[@id='travelPrpsCheck']";
		//Business travel
		public static String TravelComDate="//*[@id='travelComDate']";
		public static String TravelBusNam="//*[@id='travelName']";
		public static String TravelBusRem="//*[@id='travelRemu']";
		public static String TravelBusHealthCare="//*[@id='travelHealthCare']";
		public static String TravelBusPrecaution="//*[@id='travelPrec']";
		public static String TravelBusMode="//*[@id='travelMode']";
		public static String TravelRespDuties="//*[@id='travelRespDuties']";
		//Business Travel Contract
		public static String Toggle_Yes4="//input[@id='contrctInfo']";
		public static String TravelContractComDate="//*[@id='contComDate']";
		public static String TravelContractComDuration="//*[@id='contComDuration']";
		//Travel Additional
		public static String Toggle_Yes5="//input[@id='additInfo']";
		public static String TravelAddInfo="//*[@id='additInput']";
	////////////////////////////////////////////////////////////////////////////	
		
		//Diving Mandate Form_Toggle19 yes
		
		public static String Toggle19="//*[@id='isHezardousOccupation']";
		//free diving selected
		public static String FreeDivingSelection ="//*[@id='divinTruck']";
		//By default if we select free diving,non competitive is enabled
		public static String FreeDivingCompetitiveSel ="//*[@id='partNoneCompetive']";
		public static String FreeDivingLoc ="//*[@id='freeLocation']";
		public static String FreeDivingDate ="//*[@id='freeDate']";
		public static String FreeDivingFreq ="//*[@id='freeFreq']";
		public static String FreeDivingIntention ="//*[@id='freeIntention']";
		//Skin Diving
		public static String SkinDivingLoc ="//*[@id='skinLocation']";
		public static String SkinDivingDate ="//*[@id='skinDate']";
		public static String SkinDivingFreq ="//*[@id='skinFreq']";
		public static String SkinDivingIntention ="//*[@id='skinIntention']";
		//By default if we select Scuba diving,150 feet is enabled
		public static String ScubaDiving45To100Sel ="//*[@id='45To100Meters']";
		public static String ScubaDiving1000 ="//*[@id='1000Meters']";
		public static String ScubaDivingLoc ="//*[@id='scubaLocation']";
		public static String ScubaDivingDate ="//*[@id='scubaDate']";
		public static String ScubaDivingFreq ="//*[@id='scubaFreq']";
		public static String ScubaDivingIntention ="//*[@id='scubaIntention']";
		//By default if we select Cliff diving,less than 15 meters is enabled
		public static String CliffDivingMoreThan15Sel ="//*[@id='15MetersSec']";
		public static String CliffDivingLoc ="//*[@id='cliffLocation']";
		public static String CliffDivingDate ="//*[@id='cliffDate']";
		public static String CliffDivingFreq ="//*[@id='cliffFreq']";
		public static String CliffDivingIntention ="//*[@id='cliffIntention']";
		//By default if we select Platform,Recreational is enabled
		public static String PlatformComp ="//*[@id='competitive']";
		public static String PlatformLoc ="//*[@id='platLocation']";
		public static String PlatformDate ="//*[@id='platDate']";
		public static String PlatformFreq ="//*[@id='platFreq']";
		public static String PlatformIntention ="//*[@id='platIntention']";

		//Diving questions
		public static String Toggle_Yes6="//input[@id='divingCertiCheck']";
		public static String DivingQualification ="//*[@id='certiName']";
		public static String  DivingQualificationObtainedDate ="//*[@id='obtTime']";
		public static String DivingQualificationAdd="//*[@id='addDiveCertiInfo']/div[3]/span/img";
		
		//Diving History
		public static String DivingAvgDepth ="//*[@id='alchoAvgDepth']";
		public static String DivingAvgDepthLoc ="//*[@id='maxDiveLocations']";
		public static String DivingAvgDepthLastMonth ="//*[@id='avdDiveLastMonths']";
		public static String DivingAvgDepthNextMonth ="//*[@id='avdDiveNextMonths']";
		
		public static String DivingMaxDepth ="//*[@id='alchoMaxDepth']";
		public static String DivingMaxDepthLoc ="//*[@id='maxDiveLocations']";
		public static String DivingMaxDepthLastMonth ="//*[@id='maxDiveLastMonths']";
		public static String DivingmaxDepthNextMonth ="//*[@id='maxDiveNextMonths']";
		
		public static String Toggle_Yes7="//input[@id='diveIncidentCheck']";
		public static String DiveIncident ="//*[@id='diveIncidentInput']";
		public static String DiveIncidentDate ="//*[@id='diveIncidentDate']";
		//Additional
		public static String Toggle_Yes8="//input[@id='diveAdditInfo']";
		public static String DiveAddInfo="//*[@id='diveAddInput']";
	////////////////////////////////////////////////////////////////////////////////////	
		
		public static String Toggle20="//*[@id='consumeNarcotics']";
		//If toggle Yes
		public static String NarcoticsInfo="//*[@id='consumeNarcoticsInfo']";
		
	///////////////////////////////////////////////////////////////////////////
		//Alcohol Mandate form
		
		public static String Toggle21="//*[@id='consumeAlcohol']";
		public static String AlcoBeerSel="//*[@id='alchoBeer']";
		public static String AlcoBeerQuant="//*[@id='beerQunt']";
		//By default Daily radio is enabled
		public static String AlcoBeerRadioWeekly="//*[@id='beerWeekly']";
		public static String AlcoBeerRadioOcc="//*[@id='beerOccasionally']";
		
		public static String AlcoWineSel="//*[@id='alchoWine']";
		public static String AlcoWineQuant="//*[@id='wineQunt']";
		//By default Daily radio is enabled
		public static String AlcoWineRadioWeekly="//*[@id='wineWeekly']";
		public static String AlcoWineRadioOcc="//*[@id='wineOccasionally']";
		
		//Alcohol Questions
		public static String Toggle_Yes9="//input[@id='reduceAlcoCheck']";
		public static String AlcoDocNam="//*[@id='docName']";
		public static String AlcoIntakeReason="//*[@id='disName']";
		public static String AlcoTreatmntDate="//*[@id='detectYear']";
		public static String AlcoholTreatmntAdd="//*[@id='addDiseases']/div[4]/span/img";
		
		public static String Toggle_Yes10="//input[@id='recoverAlcoCheck']";
		
		//Additional
		public static String Toggle_Yes11="//input[@id='alcoAdditInfo']";
		public static String AlcoAddInfo="//*[@id='alcoAddInput']";
	/////////////////////////////////////////////////////////////////
		
		//Nicotine Questions
		public static String Toggle22="//*[@id='consumeCigarettes']";
		
		public static String NicotineCigSel="//*[@id='NicotineCigarettes']";
		public static String NicotineCigPerDay="//*[@id='quantityPerDayCigarettes']";
		public static String NicotineCigNoOfYear="//*[@id='noOfYearsCigarettes']";
		
		public static String NicotineBidiSel="//*[@id='NicotineBidi']";
		public static String NicotineBidiPerDay="//*[@id='quantityPerDayBidi']";
		public static String NicotineBidiNoOfYear="//*[@id='noOfYearsBidi']";
		
		public static String NicotinePaanSel="//*[@id='NicotinePaan']";
		public static String NicotinePaanPerDay="//*[@id='quantityPerDayPaan']";
		public static String NicotinePaanNoOfYear="//*[@id='noOfYearsPaan']";
		
		public static String NicotineTobaccoSel="//*[@id='NicotineTabocco']";
		public static String NicotineTobaccoPerDay="//*[@id='quantityPerDayTobacco']";
		public static String NicotineTobaccoNoOfYear="//*[@id='noOfYearsTobacco']";
		
		//lifestyleinfo
	
		  public static String Travel="//*[@id='travelContainer']/div/div/span[1]";
		  public static String occupation="//*[@id='hezardousContainer']/div/div/span[1]";
		  public static String narcotic="//*[@id='narcoticsContainer']/div/div/span[1]";
		  public static String alcohol="//*[@id='alcoholContainer']/div/div/span[1]";
		  public static String cigar="//*[@id='cigarettesContainer']/div/div/span[1]";
		
		//Family Medical History
		public static String PlusSign9="//*[@id='environAccord']/li[3]/div[1]/i[1]";
		
		public static String FMH_Hereditary="//*[@id='fMedicHereditary']";
		public static String FMH_Chronic="//*[@id='fMedicChronic']";
		public static String FMH_Heart="//*[@id='fMedicHeart']";
		public static String FMH_BP="//*[@id='fMedicBlood']";
		public static String FMH_Cancer="//*[@id='fMedicCancer']";
		public static String FMH_Diabetes="//*[@id='fMedicDiabetes']";
		//Give Details is the same for all Disorders except None
		public static String FMH_HereditaryDetails="//*[@id='heridityDisorderDetails']";
		
		public static String FMHNone="//*[@id='fMedicNone']";
		
		//By Default Living is enabled under Father,mother
		public static String FatherAge="//*[@id='familyFatherAge']";
		public static String FatherHealthState="//*[@id='familyFatherAgestat']";
		public static String MotherAge="//*[@id='familyMotherAge']";
		public static String MotherHealthState="//*[@id='familyMotherAgestat']";
		
		//For Father Dead
		public static String FatherDeadRadio="//*[@id='familyFatherDe']";
		public static String FatherDeathAge="//*[@id='familyFatherAgeDe']";
		public static String FatherDeathCause="//*[@id='familyFatherCasDe']";
		
		//For Mother Dead
		public static String MotherDeadRadio="//*[@id='familyMotherDe']";
		public static String MotherDeathAge="//*[@id='familyMotherAgeDe']";
		public static String MotherDeathCause="//*[@id='familyMotherCasDe']";
		
		//Brother 
		public static String Toggle23="//*[@id='brotherCheck']";
		//living
		public static String BrotherAge="//*[@id='brotherAgeInpt']";
		public static String BrotherHealthState="//*[@id='brotherHeaStateInpt']";
		//Dead
		public static String BrotherDeadRadio="//*[@id='familyBrotherDe']";
		public static String BrotherDeathAge="//*[@id='brotherAgeDeInpt']";
		public static String BrotherDeathCause="//*[@id='brotherDethCausInpt']";
		
		//Brother 
		public static String Toggle24="//*[@id='sisterCheck']";
		public static String ToggleYes="//*[@id='environAccord']/li[3]/div[2]/div/div[10]/div[2]/div/div/span[2]";
		//living
		public static String SisterAge="//*[@id='sisterAgeInpt']";
		public static String SisterHealthState="//*[@id='sisterHeaStateInpt']";
		//Dead
		public static String SisterDeadRadio="//*[@id='familySisterDe']";
		public static String SisterDeathAge="//*[@id='sisterAgeDeInpt']";
		public static String SisterDeathCause="//*[@id='sisterDethCausInpt']";
		
		//Medical HIstory
		public static String PlusSign10="//*[@id='environAccord']/li[4]/div[1]/i[1]";
		//Medical Questions
		//Remain Absent(RA) from place of work 
		public static String Toggle25="//*[@id='isRemainAbsent']";
		public static String RACurrentSymp="//*[@id='exectDiag']";
		public static String RADoctorDetail="//*[@id='dtlTreatDoct']";
		public static String RADiagnosisDate="//*[@id='dateDiag1']";
		public static String RALastDateConsult="//*[@id='dateLastDiag1']";
		public static String RADiagnosisDetail="//*[@id='detailDiag']";
		//Undergone Surgery(US)
		public static String Toggle26="//*[@id='isUndergoneSurgery']";
		public static String USCurrentSymp="(//*[@id='exectDiag'])[2]";
		public static String USDoctorDetail="(//*[@id='dtlTreatDoct'])[2]";
		public static String USDiagnosisDate="//*[@id='dateDiag2']";
		public static String USLastDateConsult="//*[@id='dateLastDiag2']";
		public static String USDiagnosisDetail="(//*[@id='detailDiag'])[2]";
		//Is On Diet
		public static String Toggle27="//*[@id='isOnDiet']";
		public static String ToggleNo="//*[@id='environAccord']/li[4]/div[2]/div/div[1]/div/div[1]/div/div/span[1]";
		public static String ToggleYes1="//*[@id='environAccord']/li[4]/div[2]/div/div[1]/div/div[1]/div/div/span[2]";
		public static String DietCurrentSymp="(//*[@id='exectDiag'])[3]";
		public static String DietDoctorDetail="(//*[@id='dtlTreatDoct'])[3]";
		public static String DietDiagnosisDate="//*[@id='dateDiag3']";
		public static String DietLastDateConsult="//*[@id='dateLastDiag3']";
		public static String DietDiagnosisDetail="(//*[@id='detailDiag'])[3]";
		//Undergoing or Intend To undergo Treatment(UT) 
		public static String Toggle28="//*[@id='isIntendTreatment']";
		public static String UTCurrentSymp="(//*[@id='exectDiag'])[4]";
		public static String UTDoctorDetail="(//*[@id='dtlTreatDoct'])[4]";
		public static String UTDiagnosisDate="//*[@id='dateDiag4']";
		public static String UTLastDateConsult="//*[@id='dateLastDiag4']";
		public static String UTDiagnosisDetail="(//*[@id='detailDiag'])[4]";
		//Advised Surgery(AS)
		public static String Toggle29="//*[@id='isAdvisedSurgery']";
		public static String ASCurrentSymp="(//*[@id='exectDiag'])[5]";
		public static String ASDoctorDetail="(//*[@id='dtlTreatDoct'])[5]";
		public static String ASDiagnosisDate="//*[@id='dateDiag5']";
		public static String ASLastDateConsult="//*[@id='dateLastDiag5']";
		public static String ASDiagnosisDetail="(//*[@id='detailDiag'])[5]";
		
		public static String consultDoctor_No="//*[@id='environAccord']/li[4]/div[2]/div/div[5]/div/div[1]/div/div/span[1]";
		public static String consultDoctor_Yes="//*[@id='environAccord']/li[4]/div[2]/div/div[5]/div/div[1]/div/div/span[2]";
		public static String ECG_NO="//*[@id='environAccord']/li[4]/div[2]/div/div[7]/div/div[1]/div/div/span[1]";
		public static String ECG_Yes="//*[@id='environAccord']/li[4]/div[2]/div/div[7]/div/div[1]/div/div/span[2]";
		public static String Advise_for_Hospital_No="//*[@id='environAccord']/li[4]/div[2]/div/div[9]/div/div[1]/div/div/span[1]";
		public static String Advise_for_Hospital_Yes="//*[@id='environAccord']/li[4]/div[2]/div/div[9]/div/div[1]/div/div/span[2]";
		
		//Suffered from any of the disease
		//First row Radio Selection
		public static String ChestPainRadio="//*[@id='medicCp']";
		public static String HighBPRadio="//*[@id='medicBp']";
		public static String HighCholRadio="//*[@id='medicHc']";
		public static String HeartAttkRadio="//*[@id='medicHa']";
		public static String HeartMurRadio="//*[@id='medicHm']";
		public static String HeartDisorderRadio="//*[@id='medicHd']";
		//If Radio Selected
		public static String HeartCurrentSymp="(//*[@id='exectDiag'])[6]";
		public static String HeartDoctorDetail="(//*[@id='dtlTreatDoct'])[6]";
		public static String HeartDiagnosisDate="//*[@id='dateDiag6']";
		public static String HeartLastDateConsult="//*[@id='dateLastDiag6']";
		public static String HeartDiagnosisDetail="(//*[@id='detailDiag'])[6]";
		
		//Chest Pain
		
		public static String Chestpain="//*[@id='environAccord']/li[4]/div[2]/div/div[15]/div/div[2]/div[2]/label[1]";
		public static String tickmark="//*[@id='chestPainQuePopup']/div/div/div/div[1]/div[2]/a";
		public static String CancelPopup="//*[@id='chestPainQuePopup']/div/div/div/div[1]/div[1]/a";
		public static String angina="//input[@id='diagnosis1']";
		public static String Costochondritis="//input[@id='diagnosis2']";
		public static String Esophageal ="//input[@id='diagnosis3']";
		public static String Muscle_strain="//input[@id='diagnosis4']";
		public static String Myocardial_infarction="//input[@id='diagnosis5']";
		public static String Palpitations="//input[@id='diagnosis6']";
		public static String Stress="//input[@id='diagnosis7']";
		public static String Others="//input[@id='diagnosisOther']";
		public static String other_textbox="//*[@id='diagnosisOtherInput']";
		public static String date_ChestPain="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[3]/div[2]/div";
		public static String recurrenceinfo_yes  ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[2]";
		public static String recurrenceinfo_No ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[1]";
		public static String recurrence_notebox="//*[@id='recurrenceInfoInput']";
		public static String investigationsNO ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[1]";
		public static String investigations_yes ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[2]";
		public static String investigation_box ="//*[@id='addInvestigationInput']";
		public static String investigation_date="//*[@id='addInvestigationDate']";
		public static String investigation_results="//*[@id='addInvestigationResult']";
		public static String investigation_add="//*[@id='addInvestigationDetail']";
		public static String investogation_edit="//*[@id='investigationTable']/tbody/tr[2]/td[4]/span[1]/img";
		public static String investogation_remove="//*[@id='investigationTable']/tbody/tr[2]/td[4]/span[2]/img";
		public static String close_alert ="//*[@id='WLdialogBody']/button";
		public static String medication_taken_NO ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[1]";
		public static String medication_taken_Yes ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[2]";
		public static String medication_box ="//*[@id='addMedicationInput']";
		public static String medication_dose ="//*[@id='addMedicationDose']";
		public static String medication_frequency="//*[@id='addMedicationFreq']";
		public static String medication_date ="//*[@id='addMedicationInfo']/div[4]/span";
		public static String medication_ADD="//*[@id='addMedicationDetail']/span/img";
		public static String medication_edit="//*[@id='medicationTable']/tbody/tr[2]/td[5]/span[1]/img";
		public static String medication_remove="//*[@id='medicationTable']/tbody/tr[2]/td[5]/span[2]/img";
		public static String medication_alert_box="//*[@id='WLdialogBody']/button";
		public static String patient_treatmentNo="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/span[1]";
		public static String patient_treatmentYes="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/span[2]";
		public static String admitted_to_hospital_details ="//*[@id='addTreatmentDetails']";
		public static String admitted_to_hospital="//*[@id='addTreatmentName']";
		public static String admitted_date= "//*[@id='addTreatmentInfo']/div[3]/span";
		public static String admitted_add="//*[@id='addTreatmentDetail'/span/img";
		public static String treatment_followup_NO="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[1]";
		public static String treatment_followup_Yes="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[2]";
		public static String treatment_followup_details="//*[@id='moreTreatmentInfoInput']";
		public static String additional_information_No_chestPain ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[1]";
		public static String additional_information_yes_chestPain ="//*[@id='chestPainQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[2]";
		public static String additonal_information_notes="//*[@id='moreChestPainInfoInput']";
		
		//Second row Radio Selection
		public static String AsthmaRadio="//*[@id='medicAs']";
		public static String CoughRadio="//*[@id='medicCc']";
		public static String PneumoniaRadio="//*[@id='medicPn']";
		public static String ShortnessRadio="//*[@id='medicSb']";
		public static String TBRadio="//*[@id='medicTb']";
		public static String OtherRespRadio="//*[@id='medicOr']";
		public static String LungDisorderRadio="//*[@id='medicLd']";
			
		//If Radio Selected
		public static String LungCurrentSymp="(//*[@id='exectDiag'])[7]";
		public static String LungDoctorDetail="(//*[@id='dtlTreatDoct'])[7]";
		public static String LungDiagnosisDate="//*[@id='dateDiag7']";
		public static String LungLastDateConsult="//*[@id='dateLastDiag7']";
		public static String LungDiagnosisDetail="(//*[@id='detailDiag'])[7]";
		
		//Asthma
		public static String tick ="//*[@id='advisorProfilePop']/div/div/div/div[1]/div[2]/a";
		public static String cancel_button="//*[@id='advisorProfilePop']/div/div/div/div[1]/div[1]/a";
		public static String condition="//*[@id='condSuffer']";
		public static String diagnose_date="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[3]/div[2]/span";
		public static String smoker_no ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[1]";
		public static String smoker_Yes ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[2l]";
		public static String smoker_Notes="//*[@id='smokerInfoInpt']";
		public static String frequent_symptons="//*[@id='sympFreq']";
		public static String percipitated_No="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[1]";
		public static String percipitated_Yes ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[2]";
		public static String percipitated_symptomReasonInfo ="//*[@id='symptomReasonInfoInpt']";
		public static String last_sympton_date  ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[7]/div[2]/span";
		public static String other_treatment_No = "//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[1]";
		public static String other_treatment_Yes = "//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[2]";
		public static String other_treatment_medication ="//*[@id='curMedication']";
		public static String other_treatment_Dose ="//*[@id='curDose']";
		public static String other_treatment_frequent="//*[@id='curFrequency']";
		public static String other_treatment_ADD="//*[@id='addcurTreatment']/div[4]/span/img";
		public static String other_treatment_Edit="//*[@id='curTreatmentListTable']/tbody/tr[2]/td[4]/span[1]/img";
		public static String other_treatrment_remove="//*[@id='curTreatmentListTable']/tbody/tr[2]/td[4]/span[2]/img";
		public static String undergone_investigone_No="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[1]";
		public static String undergone_investogone_Yes="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[2]";
		public static String undergone_investigone_notest="//*[@id='investigationCheckInfoInpt']";
		public static String doctors_name="//*[@id='docName']";
		public static String doctors_address= "//*[@id='address']";
		public static String doctors_date="//*[@id='addDoctListBox']/div[3]/span";
		public static String doctors_add="//*[@id='addDoctListBox']/div[4]/span/img";
		public static String time_off_work_No ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[12]/div[2]/div/div/span[1]";
		public static String time_off_work_Yes ="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[12]/div[2]/div/div/span[2]";
		public static String time_off_work_details ="//*[@id='offWorkCondInfoInpt']";
		public static String additional_information_No="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[12]/div[2]/div/div/span[1]";
		public static String additional_information_yes="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[12]/div[2]/div/div/span[2]";
		public static String addtional_information_notes="//*[@id='additionalInfoInfoInpt']";
		
		//Third row Radio Selection
		public static String DiabetesRadio="//*[@id='medicDb']";
		public static String EBloodSugarRadio="//*[@id='medicEbs']";
		public static String SugarInUrineRadio="//*[@id='medicSu']";
		
		public static String never_suffered_chkbox="//*[@id='medicSufferNot']";
		
		

public static String radio1_Iddm="//*[@id='diagnosedIddm']";
public static String radio2_Niddm="//*[@id='diagnosedNiddm']";
public static String radio3_Igt="//*[@id='diagnosedIgt']";
public static String radio4_Gestational="//*[@id='diagnosedGestational']";
public static String detectdate="//*[@id='detectDateInput']";


//smoke
public static String smokeoption_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[1]";
public static String smokeoption_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/span[2]";
public static String radio1_lessThanTen="//*[@id='smokeLess10']";
public static String radio2_TenToTwenty="//*[@id='smoke10-20']";
public static String radio3_OverTwenty="//*[@id='smokeOver20']";

//diet
public static String diet_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[1]";
public static String diet_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[2]";
public static String medication_Name="//*[@id='medicationName']";
public static String dosage="//*[@id='dailyDosage']";
public static String add_button="//*[@id='addDiaContr']/div[3]/span/img";
public static String editbutton="//*[@id='diaContrTable']/tbody/tr[2]/td[3]/span[1]/img";
public static String cancelbutton="//*[@id='diaContrTable']/tbody/tr[2]/td[3]/span[2]/img";


//blood sugar
public static String blood_Sugar_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[1]";
public static String blood_Sugar_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/span[2]";
public static String date_blood_Sugar="//*[@id='bldDateTaken']";
public static String bloodsugarlevel="//*[@id='bldSugarLevel']";
public static String measure_blood_Sugar="//*[@id='bldHbaMeasure']";
public static String add_button_Blood= "//*[@id='adddiaBlood']/div[4]/span/img";
public static String edit_blood_Sugar= "//*[@id='diaBloodTable']/tbody/tr[2]/td[4]/span[1]/img";
public static String cancel_blood_Sugar="//*[@id='diaBloodTable']/tbody/tr[2]/td[4]/span[2]/img";


//questions
public static String checkbox1_HeartDisease="//*[@id='everToldHeart']";
public static String textbox_HeartDisease="//*[@id='diaHeat']";
public static String checkbox2_Albumin="//*[@id='everToldAlbumin']";
public static String textbox_Albumin="//*[@id='diaAlbumin']";
public static String checkbox3_Blood_Pressure="//*[@id='everToldBlood']";
public static String textbox_Blood_Pressure="//*[@id='diaHighBldPre']";
public static String checkbox4_None="//*[@id='everToldNone']";

public static String checkbox5_Eye="//*[@id='everToldEye']";
public static String textbox_Eye="//*[@id='diaeye']";
public static String checkbox6_Kidney="//*[@id='everToldkidney']";
public static String textbox_Kidney="//*[@id='diaKidney']";
public static String checkbox7_ECG="//*[@id='everToldEcg']";
public static String textbox_ECG="//*[@id='diaAbnormal']";


//additional information
public static String add_Info_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[1]";
public static String add_Info_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[2]";
public static String addinfobox="//*[@id='additInput']";

public static String Diabetes_Save_Button="//*div[@class='iconRight']/a";
public static String Diabetes_close_Button="//*div[@class='iconCross advBtnCancel']/a";
		
		//Forth row Radio Selection
		public static String ProteinRadio="//*[@id='medicPro']";
		public static String BloodInUrineRadio="//*[@id='medicUb']";
		public static String VenerealRadio="//*[@id='medicVn']";
		public static String STDRadio="//*[@id='medicStd']";
		
		//If Radio Selected
		public static String ProteinCurrentSymp="(//*[@id='exectDiag'])[9]";
		public static String ProteinDoctorDetail="(//*[@id='dtlTreatDoct'])[9]";
		public static String ProteinDiagnosisDate="//*[@id='dateDiag9']";
		public static String ProteinLastDateConsult="//*[@id='dateLastDiag9']";
		public static String ProteinDiagnosisDetail="(//*[@id='detailDiag'])[9]";
		
		//Fifth row Radio Selection
		public static String UlcerRadio="//*[@id='medicUlc']";
		public static String ColitisRadio="//*[@id='medicCol']";
		public static String CdiarrhoeaRadio="//*[@id='medicChd']";
		public static String HepatitisRadio="//*[@id='medicHep']";
		public static String JaundiceRadio="//*[@id='medicJau']";	
		public static String OtherLiverDisordersRadio="//*[@id='medicOld']";	
		public static String DigestiveDisordersRadio="//*[@id='medicDid']";	
		
		
		//If Radio Selected
		public static String UlcerCurrentSymp="(//*[@id='exectDiag'])[10]";
		public static String UlcerDoctorDetail="(//*[@id='dtlTreatDoct'])[10]";
		public static String UlcerDiagnosisDate="//*[@id='dateDiag10']";
		public static String UlcerLastDateConsult="//*[@id='dateLastDiag10']";
		public static String UlcerDiagnosisDetail="(//*[@id='detailDiag'])[10]";
		
		//Sixth row Radio Selection
			public static String TumourRadio="//*[@id='medicTm']";
			public static String AbnrmalGrwthRadio="//*[@id='medicAg']";
			public static String ThyroidDisorderRadio="//*[@id='medicTds']";
			public static String EnlargedGlandRadio="//*[@id='medicEgl']";
			public static String EnlargedLymphRadio="//*[@id='medicEln']";	
			public static String CancerRadio="//*[@id='medicCel']";	
			
		//If Radio Selected
			public static String TumourCurrentSymp="(//*[@id='exectDiag'])[11]";
			public static String TumourDoctorDetail="(//*[@id='dtlTreatDoct'])[11]";
			public static String TumourDiagnosisDate="//*[@id='dateDiag11']";
			public static String TumourLastDateConsult="//*[@id='dateLastDiag11']";
			public static String TumourDiagnosisDetail="(//*[@id='detailDiag'])[11]";
			
			//thyroid mandate
			public static String fxdTpEndYr="//*[@id='fxdTpEndYr']";
			public static String thyroidDisHypothyroidism="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/label";
			public static String thyroidDisHyperthyroidism="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/label";
			public static String thyroiditis="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/label";
			public static String other="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[2]/div[2]/div[4]/label";
			public static String thyDisOther="//*[@id='thyDisOther']";
			public static String diagnise_date="//*[@id='thyLstDiag']";
			public static String medication_name="//*[@id='treatName']";
			public static String doseTreat="//*[@id='doseTreat']";
			public static String frequencyTreat="//*[@id='freqTreat']";
			public static String treatment_date="//*[@id='dtTreat']";
			public static String addTreat="//*[@id='addThyTreatInfo']/div[5]/span/img";
			public static String surgery_undergo_toggle="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/div";
			public static String surgery_undergo_toggle_no="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[1]";
			public static String surgery_undergo_toggle_yes="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/span[2]";
			public static String thySurgryInput="//*[@id='thySurgryInput']";
			public static String thyfuncTest_date="//*[@id='thyfuncTest']";
			public static String thyDisord_toggle="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/div";
			public static String thyDisord_toggle_no="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/span[1]";
			public static String thyDisord_toggle_yes="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/span[2]";
			public static String thyDisordInput="//*[@id='thyDisordInput']";
			public static String weight_LG_toggle="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/div";
			public static String weight_LG_toggle_no="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[1]";
			public static String weight_LG_toggle_yes="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[2]";
			public static String thyWeightInput="//*[@id='thyWeightInput']";
			public static String add_info_toggle="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/div";
			public static String add_info_toggle_no="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[1]";
			public static String add_info_toggle_yes="//*[@id='thyroidQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[2]";
			public static String additInput="//*[@id='additInput']";

			
		//Seventh row Radio Selection
			public static String AnemiaRadio="//*[@id='medicAnm']";
			public static String BleedingRadio="//*[@id='medicBld']";
			public static String BloodDisorderRadio="//*[@id='medicBdo']";
		
		//If Radio Selected
			public static String AnemiaCurrentSymp="(//*[@id='exectDiag'])[12]";
			public static String AnemiaDoctorDetail="(//*[@id='dtlTreatDoct'])[12]";
			public static String AnemiaDiagnosisDate="//*[@id='dateDiag12']";
			public static String AnemiaLastDateConsult="//*[@id='dateLastDiag12']";
			public static String AnemiaDiagnosisDetail="(//*[@id='detailDiag'])[12]";	
		
		//Eighth row Radio Selection
			public static String DizzinessElipRadio="//*[@id='medicDze']";
			public static String FaintingRadio="//*[@id='medicFsp']";
			public static String ParalysisRadio="//*[@id='medicParalysis']";
			public static String StrokeRadio="//*[@id='medicStroke']";
			public static String MentalDisorderRadio="//*[@id='medicMdis']";	
			public static String EmotionalDisordersRadio="//*[@id='medicEdis']";	
			public static String NeuroDisordersRadio="//*[@id='medicNdis']";	
			
		//If Radio Selected
			public static String ParalysisCurrentSymp="(//*[@id='exectDiag'])[13]";
			public static String ParalysisDoctorDetail="(//*[@id='dtlTreatDoct'])[13]";
			public static String ParalysisDiagnosisDate="//*[@id='dateDiag13']";
			public static String ParalysisLastDateConsult="//*[@id='dateLastDiag13']";
			public static String ParalysisDiagnosisDetail="(//*[@id='detailDiag'])[13]";
			
			//nature of condition

			public static String radiobutton1="//*[@id='condSuffAbsence']";
			public static String radiobutton2="//*[@id='condSuffMyoclonic']";
			public static String radiobutton3="//*[@id='condSuffPartial']";
			public static String radiobutton4="//*[@id='condSuffOthers']";
			public static String radiobutton5="//*[@id='condSuffAtonic']";
			public static String radiobutton6="//*[@id='condSuffTonic']";
			public static String radiobutton7="//*[@id='condSuffComplex']";
			public static String other_Input="//*[@id='natureSuffOthersInput']";

			//medical report
			public static String medical_Report_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div/span[1]";
			public static String medical_Report_Yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div/span[2]";
			public static String firstexp="//*[@id='seizFstExp']";
			public static String often="//*[@id='seizOfExp']";

			//frequency

			public static String radio1_moreFrequent="//*[@id='frequencyMore']";
			public static String radio2_LessFrequent="//*[@id='frequencyLess']";
			public static String radio3_Unchanged="//*[@id='frequencyUnchanged']";


			public static String last_Seizure= "//*[@id='seiLastExp']";

			//Medication details

			public static String medicationname="//*[@id='medicName']";
			public static String current_past="//*[@id='curPastMedic']";
			public static String dose_Medic="//*[@id='doseMedic']";
			public static String frequency_Medic="//*[@id='freqMedic']";
			public static String addbutton_Medic="//*[@id='addSeiMedicInfo']/div[5]/span/img";
			public static String cancel_Medic="//*[@id='seiMedicTable']/tbody/tr[2]/td[5]/span[2]/img";


			public static String tests_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[1]";
			public static String tests_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/span[2]";
			public static String testname="//*[@id='investNameInput']";
			public static String test_date="//*[@id='investDateInput']";
	
			public static String test_result= "//*[@id='investResultInput']";
			public static String add_test= "//*[@id='addSeiInvestInfo']/div[4]/span/img";

			public static String edit_test= "//*[@id='seiInvestTable']/tbody/tr[2]/td[4]/span[1]/img";
			public static String cancel_test="//*[@id='seiInvestTable']/tbody/tr[2]/td[4]/span[2]/img";
			



			public static String admitted_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[1]";
			public static String admitted_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/span[2]";
			public static String doc_name="//*[@id='docName']";
			public static String hospital_add="//*[@id='admitAddr']";
			public static String hospital_date="//*[@id='admitDt']";
			public static String addbutton= "//*[@id='addSeiAdmitInfo']/div[4]/span/img";
			public static String hospital_edit="//*[@id='seiAdmitTable']/tbody/tr[2]/td[4]/span[1]/img";
			public static String hospital_cancel="//*[@id='seiAdmitTable']/tbody/tr[2]/td[4]/span[2]/img";



			public static String treatment_no= "//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[10]/div[2]/div/div/span[1]";
			public static String treatment_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[10]/div[2]/div/div/span[2]";
			public static String treatment_textbox="//*[@id='treatInput']";


			public static String add_info_no="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[11]/div[2]/div/div/span[1]";
			public static String add_info_yes="//*[@id='diabetesQuePopup']/div/div/div/div[2]/div/div/div[11]/div[2]/div/div/span[2]";
			public static String textbox="//*[@id='additInput']";


			public static String ok="//*div[@class='iconRight']/a";
			public static String cancel="//*div[@class='iconCross advBtnCancel']/a";







		
		//Ninth row Radio Selection
			public static String KidneyRadio="//*[@id='medicKidney']";
			public static String UrinaryRadio="//*[@id='medicUrinary']";
			public static String BladderRadio="//*[@id='medicBladder']";
			public static String ReproductiveOrganRadio="//*[@id='medicReor']";
			public static String ProstateRadio="//*[@id='medicPrdis']";	
			
		//If Radio Selected
			public static String KidneyCurrentSymp="(//*[@id='exectDiag'])[14]";
			public static String KidneyDoctorDetail="(//*[@id='dtlTreatDoct'])[14]";
			public static String KidneyDiagnosisDate="//*[@id='dateDiag14']";
			public static String KidneyLastDateConsult="//*[@id='dateLastDiag14']";
			public static String KidneyDiagnosisDetail="(//*[@id='detailDiag'])[14]";

		//Tenth row Radio Selection
			public static String ArthritisRadio="//*[@id='medicKidney']";
			public static String GountPainRadio="//*[@id='medicUrinary']";
			public static String JointPainRadio="//*[@id='medicBladder']";
			public static String MuscleDisorderRadio="//*[@id='medicReor']";
			public static String BoneFractureRadio="//*[@id='medicPrdis']";	
			public static String MusculoskeletalRadio="//*[@id='medicPrdis']";	
					
		//If Radio Selected
			public static String MuscleCurrentSymp="(//*[@id='exectDiag'])[15]";
			public static String MuscleDoctorDetail="(//*[@id='dtlTreatDoct'])[15]";
			public static String MuscleDiagnosisDate="//*[@id='dateDiag15']";
			public static String MuscleLastDateConsult="//*[@id='dateLastDiag15']";
			public static String MuscleDiagnosisDetail="(//*[@id='detailDiag'])[15]";
			
			//Arthtotis
			public static String arthrities="//input[@id='medicArthritis']";

					//condition that you are suffering 
					public static String condRheumatoid="//input[@id='condRheumatoid']";
					public static String condAnkylosing="//input[@id='condAnkylosing']";
					public static String condReitersSyndrome="//input[@id='condReitersSyndrome']";
					public static String condPsoriatic="//input[@id='condPsoriatic']";
					public static String condOthers="//input[@id='condOthers']";
					// When did you first experience symptoms? 
					public static String fstExpSympDate="//input[@id='fstExpSympDate']";
					public static String set="//div[@class='dwb dwb0 dwb-e']";
					public static String Cancel="//div[@class='dwb dwb1 dwb-e']";
					// Are these symptoms ongoing
					public static String sympOnGoingCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/div";
					public static String worseningCheck="//input[@id='worseningCheck']";
					public static String lastExpSympDate="//input[@id='lastExpSympDate']";

					// Which joints are or have been affected 
					public static String affectedJointsInfo="//input[@id='affectedJointsInfo']";

					// Are your daily activities affected or restricted in any way?
					public static String dailyActAffctCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[4]/div[10]/div[2]/div/div/div";
					public static String dailyActAffctInpt="//input[@id='dailyActAffctInpt']";

					//Do you use a walking stick or other mobility aid?
					public static String useWalkStickCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[4]/div[12]/div[2]/div/div/div";
					public static String useWalkStickInpt="//input[@id='useWalkStickInpt']";

					//Have you ever taken or are currently taking medication for this condition
					public static String curTakeMedicineCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/div";
					public static String medication="//input[contains(id,'medication']";
					public static String currentOrPast="//input[@id='currentOrPast']";
					public static String dose="//input[@id='dose']";
					public static String frequency="//input[@id='frequency']";
					public static String addMedicineBox="//*[@id='addCurMedicineBox']/div[5]/img";
					public static String editMedicineTable="//*[@id='curMedicineTable']/tbody/tr[2]/td[5]/span[1]/img";
					public static String deleteMedicineTable="//*[@id='curMedicineTable']/tbody/tr[2]/td[5]/span[2]/img";

					public static String othertreatment="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/div";
					public static String arthritis_treatment="//input[conatins(@id,'treatment']";
					public static String arthritis_location="//input[@id='location']";
					public static String arthritis_treatment_date="//input[@id='date']";
					public static String results="//input[@id='results']";
					public static String arthritis_add="//*[@id='addTreatmentListBox']/div[5]/img";
					public static String arthritis_edit="//*[@id='treatmentListTable']/tbody/tr[2]/td[5]/span[1]/img";
					public static String arthritis_delete="//*[@id='treatmentListTable']/tbody/tr[2]/td[5]/span[2]/img";

					//Have you ever been or have been advised OPD follow up or hospitalization for this condition?
					public static String advisedOPDCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/div";
					public static String advisedOPDInpt="//input[@id='advisedOPDInpt']";
					public static String systemicManifstCheck="//*[@id='advisorProfilePop']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/div";
					public static String systemicManifstInpt="//input[@id='systemicManifstInpt']";
					public static String addInfo="//*[@id='addInfo']";

        //Musculoskeletal mandate form
					
					public static String medicMusDis="//input[@id='medicMusDis']";

					//1. Please advise which joint/s or areas of the body are/were affected
					public static String affBodyAreasInput="//input[@id='affBodyAreasInput']";

					//2. What was the underlying cause (e.g. accident, degeneration, recreational or sporting injury etc.)?
					public static String causeInput="//input[@id='causeInput']";

					//3. When did you first experience symptoms? 
					public static String firstExpDt="//input[@id='firstExpDt']";
					public static String calendarInpt_cursorPointer="//span[@class='calendarInpt23 cursorPointer']";

					//4. a)  Are your symptoms ongoing?  
					public static String symptomsInfo="//input[@id='symptomsInfo']";
					public static String improving="//*[@id='symptomsImprov']";
					public static String Getting_worse="//*[@id='musculoskeletalQuePopup']";
					public static String Unchanged ="//*[@id='musculoskeletalQuePopup']";

					//b) If you are no-longer experiencing symptoms, when did they last occur?   
					public static String lastOccurDt="//input[@id='lastOccurDt']";
					//c) Also advise how often or how many times you have ever experienced symptoms and how long the symptoms have lasted on these occasions? 
					public static String noOfExpSymptoms="//input[@id='noOfExpSymptoms']";

					public static String addMedicationName="//input[@id='addMedicationName']";
					public static String addMedicationDose="//input[@id='addMedicationDose']";
					public static String addMedicationFreq="//input[@id='addMedicationFreq']";
					public static String addMedicationDate="//*[@id='addMedicationInfo']/div[4]/span";
					public static String add_Musculoskeletal="//*[@id='addMedicationDetail']/span/img";
					public static String edit_Musculoskeletal="//*[@id='medicationTable']/tbody/tr[2]/td[5]/span[1]/img";
					public static String delete_Musculoskeletal="//*[@id='medicationTable']/tbody/tr[2]/td[5]/span[2]/img";

					//Have you ever had any tests or investigations carried out in connection to this condition or been advised to do so in future e.g. x-ray, MRI, CT scan etc.? 
					public static String hadtest="//*[@id='musculoskeletalQuePopup']/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/div";
					public static String addInvestigationName="//input[@id='addInvestigationName']";
					public static String calender_Musculoskeletal="//*[@id='addInvestigationInfo']/div[2]/span";
					public static String addInvestigationResult="//input[@id='addInvestigationResult']";
					public static String add_tests="//*[@id='addInvestigationDetail']/span/img";
					public static String edit_tests="//*[@id='investigationTable']/tbody/tr[2]/td[4]/span[1]/img";
					public static String delete_tests="//*[@id='investigationTable']/tbody/tr[2]/td[4]/span[2]/img";

					//7. Have you ever had or have been advised to have OPD follow up or hospitalization for this condition? 
					public static String opd="//*[@id='musculoskeletalQuePopup']/div/div/div/div[2]/div/div/div[8]/div[2]/div/div/div";
					public static String date="//*[@id='addAdviseInfo']/div[1]/span";
					public static String procedure="//*[@id='addAdviseProcedure']";
					public static String loc="//*[@id='addAdviseLoc']";
					public static String result="//*[@id='addAdviseResult']";
					public static String edit="//*[@id='adviseTable']/tbody/tr[2]/td[5]/span[1]/img";
					public static String delete="//*[@id='adviseTable']/tbody/tr[2]/td[5]/span[2]/img";


					//8. Additional information : 
					public static String add="//*[@id='addAdviseDetail']/span/img";
					public static String additionalinfo="//*[@id='musculoskeletalQuePopup']/div/div/div/div[2]/div/div/div[9]/div[2]/div/div/div";
					public static String additionalinformationinput="//*[@id='moreMuscuInfoInput']";

			
		//Eleventh row Radio Selection
			public static String EyeDisorderRadio="//*[@id='medicEyDis']";
			public static String EarDisorderRadio="//*[@id='medicErDis']";
			
		//If Radio Selected
			public static String EyeCurrentSymp="(//*[@id='exectDiag'])[16]";
			public static String EyeDoctorDetail="(//*[@id='dtlTreatDoct'])[16]";
			public static String EyeDiagnosisDate="//*[@id='dateDiag16']";
			public static String EyeLastDateConsult="//*[@id='dateLastDiag16']";
			public static String EyeDiagnosisDetail="(//*[@id='detailDiag'])[16]";	
		
		//Twelveth row Radio Selection
			public static String OtherIllnessRadio="//*[@id='medicOtIll']";
			public static String SurgeryRadio="//*[@id='medicSurgery']";
			public static String InjuryRadio="//*[@id='medicInjury']";
			
		//If Radio Selected
			public static String OtherCurrentSymp="(//*[@id='exectDiag'])[17]";
			public static String OtherDoctorDetail="(//*[@id='dtlTreatDoct'])[17]";
			public static String OtherDiagnosisDate="//*[@id='dateDiag17']";
			public static String OtherLastDateConsult="//*[@id='dateLastDiag17']";
			public static String OtherDiagnosisDetail="(//*[@id='detailDiag'])[17]";	
		
		public static String DiseaseNone="//*[@id='medicSufferNot']";
		
		//Physical Defect(PD)
		public static String Toggle30="//*[@id='isPhysicalDefect']";
		public static String physicalDefect_No="//*[@id='environAccord']/li[4]/div[2]/div/div[14]/div/div[1]/div/div/span[1]";
		public static String physicalDefect_Yes="//*[@id='environAccord']/li[4]/div[2]/div/div[14]/div/div[1]/div/div/span[2]";
		public static String PDCurrentSymp="(//*[@id='exectDiag'])[18]";
		public static String PDDoctorDetail="(//*[@id='dtlTreatDoct'])[18]";
		public static String PDDiagnosisDate="//*[@id='dateDiag18']";
		public static String PDLastDateConsult="//*[@id='dateLastDiag18']";
		public static String PDDiagnosisDetail="(//*[@id='detailDiag'])[18]";
		//Health Symptom complaint
		public static String health_symptom_No= "//*[@id='environAccord']/li[4]/div[2]/div/div[17]/div/div[1]/div/div/span[1]";
		public static String health_symptom_Yes="//*[@id='environAccord']/li[4]/div[2]/div/div[17]/div/div[1]/div/div/span[2]";
		
		
		
		//HIV
		public static String Toggle31="//*[@id='isHIV']";
		public static String HIV_No="//*[@id='environAccord']/li[4]/div[2]/div/div[20]/div/div[1]/div/div/span[1]";
		public static String HIV_Yes ="//*[@id='environAccord']/li[4]/div[2]/div/div[20]/div/div[1]/div/div/span[1]";
		
		public static String HIVCurrentSymp="(//*[@id='exectDiag'])[19]";
		public static String HIVDoctorDetail="(//*[@id='dtlTreatDoct'])[19]";
		public static String HIVDiagnosisDate="//*[@id='dateDiag19']";
		public static String HIVLastDateConsult="//*[@id='dateLastDiag19']";
		public static String HIVDiagnosisDetail="(//*[@id='detailDiag'])[19]";
		
		//Treatment not Received(TNR)
		public static String Toggle32="//*[@id='isTreatmentNotReceived']";
		
		public static String TNRCurrentSymp="(//*[@id='exectDiag'])[20]";
		public static String TNRDoctorDetail="(//*[@id='dtlTreatDoct'])[20]";
		public static String TNRDiagnosisDate="//*[@id='dateDiag20']";
		public static String TNRLastDateConsult="//*[@id='dateLastDiag20']";
		public static String TNRDiagnosisDetail="(//*[@id='detailDiag'])[20]";
		
		//Only for Female: Pregnancy
		public static String Toggle33="//*[@id='isPregnant']";
		public static String PregnantWeek="//*[@id='pregnantWeekInpt']";
		public static String PregCurrentSymp="(//*[@id='exectDiag'])[21]";
		public static String PregDoctorDetail="(//*[@id='dtlTreatDoct'])[21]";
		public static String PregDiagnosisDate="//*[@id='dateDiag21']";
		public static String PregLastDateConsult="//*[@id='dateLastDiag21']";
		public static String PregDiagnosisDetail="(//*[@id='detailDiag'])[21]";
		
		//gynaecologicalProblem	
		public static String Toggle34="//*[@id='gynaecologicalProblem']";
		public static String GPCurrentSymp="(//*[@id='exectDiag'])[22]";
		public static String GPDoctorDetail="(//*[@id='dtlTreatDoct'])[22]";
		public static String GPDiagnosisDate="//*[@id='dateDiag22']";
		public static String GPLastDateConsult="//*[@id='dateLastDiag22']";
		public static String GPDiagnosisDetail="(//*[@id='detailDiag'])[22]";	
		public static String Iagree5="//a[@title='I Agree']";
		
		

		//IAR
		public static String middleName="//*[@id='liMName']";

		public static String nonMedical="//input[@id='nonMedical']";
		public static String ageProof_Dropdown="//select[@id='ageProof']";
		public static String Toggle1_IAR="//*[@id='pagePort']/div[2]/div/div[5]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle_IAR_Yes="//*[@id='pagePort']/div[2]/div/div[5]/div[1]/div[2]/div/div/span[2]";
		public static String applicant_Request="//*[@id='pagePort']/div[2]/div/div[6]/div[1]/div[2]/label[3]";
		public static String clusterName="//*[@id='clusterMarket']";
		public static String years="//*[@id='durKnowLIYears\"]";
		public static String months="//*[@id='durKnowLIMonths']";
		public static String protection="//*[@id='pagePort']/div[2]/div/div[9]/div[1]/div[2]/label[1]";
		public static String howCalculate="//*[@id='howAmtCalc']";
		public static String realistic_Estimate_Insurer="//*[@id='realEstmtLI']";
		public static String realistic_Estimate_Proposer="//*[@id='realEstmtProp']";
		public static String Investment_Proposer ="//*[@id='investProp']";
		public static String Investment_Insurer ="//*[@id='investLI']";
		public static String liabilities_Proposer="//*[@id='liabilitiesProp']";
		public static String liabilities_Insurer="//*[@id='investLI']";
		public static String Toggle2_IAR_No="//*[@id='pagePort']/div[2]/div/div[13]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle2_IAR_Yes="//*[@id='pagePort']/div[2]/div/div[13]/div[1]/div[2]/div/div/span[2]";
		public static String Toggle3_IAR_yes="//*[@id='pagePort']/div[2]/div/div[14]/div[1]/div[2]/div/div/span[2]";
		public static String Toggle3_IAR_No="//*[@id='pagePort']/div[2]/div/div[14]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle4_IAR_Yes="//*[@id='pagePort']/div[2]/div/div[15]/div[1]/div[2]/div/div/span[2]";
		public static String Toggle4_IAR_No="//*[@id='pagePort']/div[2]/div/div[15]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle5_IAR_No="//*[@id='pagePort']/div[2]/div/div[16]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle5_IAR_Yes="//*[@id='pagePort']/div[2]/div/div[16]/div[1]/div[2]/div/div/span[2]";
		public static String Toggle6_IAR_No="//*[@id='pagePort']/div[2]/div/div[17]/div[1]/div[2]/div/div/span[1]";
		public static String Toggle6_IAR_yes="//*[@id='pagePort']/div[2]/div/div[17]/div[1]/div[2]/div/div/span[2]";
		public static String otherRemarks="//*[@id='otherRemarks']";
		public static String IAR_IAgree="//*[@id='pagePort']/div[2]/div/div[20]/a";

		//Review and Acceptance
		public static String applicationPlace="//*[@id='applicationPlace']";
		public static String final_button="//*[@id='simplifiedFormPart']/div/div[3]/a";
		public static String otp_input="//*[@id='otp']";
		public static String otp_click = "//*[@id='simplifiedFormPart']/div/div[4]/div[1]/div[3]/img";
		
		//Document Upload
		public static String identity_Proof="//*[@id='1']";
		public static String typeOfDocument="//select[@id='documentType']";
		public static String browseButton="//*[@id='cat_1']/div[3]/div[1]/a/label";
		public static String agree_button="//*[@id='uploadImg']/a";
		public static String close_button="//*[@id='WLdialogBody']/button";
		public static String standardAgeProof="//*[@id='2']";
		public static String browseButton2="//*[@id='cat_2']/div[3]/div[1]/a/label";
		public static String ageProof="//*[@id='4']";
		public static String browseButton3="//*[@id='cat_4']/div[3]/div[1]/a/label";
		public static String nonMedicalRequirements="//*[@id='10']";
		public static String miscellaneous_Document="//*[@id='111036']/div[1]/div[3]/div[1]/a/label";
		public static String neft_Cancelled_Cheque="//*[@id='111209']/div[1]/div[3]/div[1]/a/label";
		public static String photograph="//*[@id='121210']/div[1]/div[3]/div[1]/a/label";
		public static String eapp_Customer_Declaration_Form="//*[@id='121212']/div[1]/div[3]/div[1]/a/label";
		public static String central_KYC_form="//*[@id='121213']/div[1]/div[3]/div[1]/a/label";
		public static String ecs_Mandate_Form="//*[@id='131001']/div[1]/div[3]/div[1]/a/label";
		public static String pan_card_Proof="//*[@id='12']";
		public static String pan_card="//*[@id='111104']/div[1]/div[3]/div[1]/a/label";
		public static String i_agree="//*[@id='docList']/div[6]/a";
		public static String ABG_Employee="//*[@id='14']";
		public static String ABG_Emp="//*[@id='111202']/div[1]/div[3]/div[1]/a";
		public static String payment_submit="//*[@id='onlinePay']/a";
		public static String dummy_payment_link="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lnkDummy']";
		public static String confirm_checkbox="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_cbDisclaimer']";
		public static String payNow_button="//*[@id='ctl00_m_g_4b5b5f7b_0a8c_4c23_9eda_248459aab3a2_ctl00_btnPay']";
		
		
		
				
				//payment
				public static String payment="//*[@id='mainTab']/div[1]/div/div[5]";

				//online
				public static String online_payment="//*[@id='onlinePaymentLi']/a";
				public static String online_payment_input="//*[@id='payOnline']/div/div[1]/input";
				public static String online_payment_submit="//*[@id='onlinePay']/a";
				public static String online_payment_send_link="//*[@id='onlinePayLink']/a";
				public static String net_banking="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnNetBanking']/span[2]";
				public static String bank_name="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_ddSelectBank']";
				public static String credit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnCreditCard']/span[2]";
				public static String credit_card_paytm="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radSelectPAYTM']";
				public static String hdfc_credit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radSelectHDFC']";
				public static String citi_credit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radSelectCard']";
				public static String american_express_credit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radseleAmexothr']";
				public static String american_eze_credit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radSelectAmexEze']";
				public static String imps="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnImps']/span[2]";
				public static String cust_mobile_number="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_txtMobileNo']";
				public static String customer_mmid="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_txtMmid']";
				public static String click_after_mmid="//*[@id='Span1']/a";
				public static String otp="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_txtOTP']";
				public static String click_after_otp="//*[@id='Span2']/a";
				public static String debit_card="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnTPDC']/span[2]";
				public static String by_techprocess="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_rbtTPDC']";
				public static String by_paytm="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_rbtPaytm']";
				public static String si_oncards="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnSI']/span[2]";
				public static String emi="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnEMI']/span[2]";
				public static String emi_hdfc="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radHDFCEMI']";
				public static String emi_citi="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_radCITIEMI']";
				public static String wallet="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lbtnWallet']/span[2]";
				public static String wallet_paytm="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_rdSelectPaytmWallet']";
				public static String wallet_jio="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_rdSelectJioWallet']";
				public static String dummy_payment="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lnkDummy']";
				public static String i_agree_button="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_cbDisclaimer']";
				public static String online_submit="//*[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_imgbtnSubmit']";
				
				///Cash
				public static String cash_payment="//*[@id='cashPaymentLi']";
				public static String cash_Submit="//*[@id='payCash']/div/div[2]/a";

				
				//cheque
				public static String cheque_payment="//*[@id='chequePaymentLi']";
				public static String pay_cheque="//*[@id='payCheque']/div/div[1]/label[1]";
				public static String pay_dd="//*[@id='payCheque']/div/div[1]/label[2]";
				public static String select_cheque="//*[@id='selectImgDesktop']/a/label";
				public static String select_dd="//*[@id='selectImgDesktopDD']/a/label";
				public static String cheque_number="//*[@id='chequeDDNo']";
				public static String ifsccode="//*[@id='IFSCCode']";
				public static String chequeIssueDate="//*[@id='chequeIssueDate']";
				public static String cheque_submit="//*[@id='payCheque']/div/div[16]/a";

		
		
		
}
