package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.GetAppleDetails;
import TestBase.BaseClass;

public class TestCase002GetDetails extends BaseClass  {
	// Test method to click on see all results and get AppleipadDetails
			@Test()
			public void ipaddetails() throws InterruptedException, IOException {
				
				GetAppleDetails GAP = new GetAppleDetails(driver);
				
				GAP.clickSeeallresults();
				
				GAP.AppleipadDetails();
										     
			}
	

}
