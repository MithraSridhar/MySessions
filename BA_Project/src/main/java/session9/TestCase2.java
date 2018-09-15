package session9;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 extends ProjectWrappers {
	
	@BeforeClass
	public void setData() {
		testCaseName="EditLead";
		testDescription="Editing Leads";
		browserName="chrome";
		dataSheetName="TC002";
		category="Sanity";
		authors="Mithra";
	}
	
	@Test(dataProvider="fetchData")
	public void testCase2(String ECN,String editedCN) throws InterruptedException {
		invokeApp("Chrome");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("//input[@id='ext-gen248']", "Mithra");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		Thread.sleep(3000);
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		Thread.sleep(3000);
		enterById("updateLeadForm_companyName", ECN);
		clickByClassName("smallSubmit");
		Thread.sleep(3000);
		verifyTextById("viewLead_companyName_sp", editedCN);
		//closeBrowser();
	}
}
