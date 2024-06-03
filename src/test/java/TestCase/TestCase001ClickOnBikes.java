package TestCase;

import TestBase.BaseClass;
import org.testng.annotations.Test;

import PageObject.AmazonHomePage;


public class TestCase001ClickOnBikes extends BaseClass {

	// Test method to click on mobile and navigate to LaptopsAccessories and click on apple
		@Test()
		public void clickmobiles() throws InterruptedException {
			
			AmazonHomePage AHP = new AmazonHomePage(driver);
			AHP.clickMobiles();
			
			AHP.ClickLaptopsAccessories();
			
			AHP.clickapple();
									     
		
		}
	
	
}
