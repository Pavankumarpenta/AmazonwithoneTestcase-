package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptManager {
	
		JavascriptExecutor jse;
		// Method to scroll into view of an element
		public void scrollIntoView(WebDriver driver, WebElement element) {
			jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", element);

		}
		
	}

