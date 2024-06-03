package PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Utils.JavaScriptManager;

public class GetAppleDetails   extends BasePage {
	
	// Initializing utility classes for JavaScript execution
		JavaScriptManager javaScriptManager = new JavaScriptManager();
	
	
	public GetAppleDetails (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
	
	@FindBy(xpath = "//a[normalize-space()='See all results']")
	public WebElement Seeallresults;
	
	
	
	// List of WebElement representing the model names of all the Tabs
	@FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']")
	public List<WebElement> modelNames;
		
		
	// List of WebElement representing the prices of all the Tabs
	@FindBy(xpath = "//a[@class='a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal']/span")
	public List<WebElement> modelprices ;
	
	// List of WebElement representing the Delivery Date of all the Tabs	
	@FindBy(xpath = "//span[@class='a-color-base a-text-bold']")
	public List<WebElement> Delivery;
	
				
	
	
	// Method to locate and click the 'See all results' button
	public void clickSeeallresults() throws InterruptedException {
	// Scrolling to the button
	javaScriptManager.scrollIntoView(driver,Seeallresults );
	Thread.sleep(3000);
	// Clicking on the 'See all results' button using JavaScript executor
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", Seeallresults);
	Thread.sleep(2000);
	
	}
		
		
	// Method to extract Tab details and print  them into console
	public void AppleipadDetails() throws IOException {
    //So, the size variable will hold the smallest size among the three lists.
	//This is useful to prevent IndexOutOfBoundsException
	    int size = Math.min(Math.min(modelNames.size(), modelprices.size()), Delivery.size());

	    for (int i = 0; i < size; i++) {
	        String ipadName = modelNames.get(i).getText();
	        String price = modelprices.get(i).getText();
	        String Deliverytime = Delivery.get(i).getText();
	        System.out.println("****************************");
	        System.out.println("Name of the ipad " +(i+1)+":" + ipadName + "\n" +"Price:" +  price + "\n" +"Expected Delivery Day:" +  Deliverytime);
	        System.out.println("****************************");
	    }
	    System.out.println("Total ipads "+ size);
	}

		

}
