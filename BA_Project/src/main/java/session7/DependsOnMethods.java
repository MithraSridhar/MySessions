package session7;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void createLead() {
		System.out.println("createLead");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "session7.DependsOnMethods.createLead", alwaysRun = true)
	public void editLead() {
		System.out.println("editLead");
	}

	@Test(dependsOnMethods = "session7.DependsOnMethods.createLead")
	public void deleteLead() {
		System.out.println("deleteLead");
	}

	@Test(enabled = false)
	public void mergeLead() {
		System.out.println("mergeLead");
	}

}
