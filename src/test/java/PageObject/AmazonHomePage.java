package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AmazonHomePage  extends BasePage {

	public AmazonHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
	@FindBy(xpath= "//a[normalize-space()='Mobiles']")
	public WebElement Mobiles;

	
	@FindBy(xpath= "//span[normalize-space()='Laptops & Accessories']")
	public WebElement LaptopsAccessories;
	
	@FindBy(xpath ="//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img18/Electronics/Megamenu/megamenumar18f.json:subnav-sl-megamenu-2:0\"]/div[2]/div/div[2]/ul[1]/li[2]/a")
	public WebElement apple;
	
	
	//Method to click on mobile
		public void clickMobiles() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", Mobiles);
			Thread.sleep(3000);
		}
	//Method to hover LaptopsAccessories

		public void   ClickLaptopsAccessories() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(LaptopsAccessories).perform();
			Thread.sleep(3000);
		}
		
		//Method to click on apple
		public void clickapple() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", apple);
			Thread.sleep(3000);
		}
	
	
}