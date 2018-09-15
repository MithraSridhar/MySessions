package session9;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="CreateLead";
		testDescription="Creating Leads";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Mithra";
	}
	
	
	//@Parameters({"CN","FN","LN"})
	//@Test
	@Test(dataProvider="fetchData")
	public void testCase1(String CN,String FN, String LN) {
		invokeApp(browserName);
		enterById("Login.UserName.Id", username);
		enterById("Login.Password.Id", password);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("CreateLead.Company.Id", CN);
		enterById("CreateLead.FirstName.Id", FN);
		enterById("CreateLead.LastName.Id", LN);	
		selectIndexById("createLeadForm_dataSourceId", "2");
		selectIndexById("createLeadForm_marketingCampaignId", "2");
		enterById("CreateLead.Phonenumber.Id", "9551308775");
		enterById("CreateLead.Email.Id", "mithugopal30@gmail.com");
		clickByXpath("//input[@class='smallSubmit']");
		System.out.println(getTextById("viewLead_companyName_sp"));
		//closeBrowser();
		//quitBrowser();
	}

		
}
