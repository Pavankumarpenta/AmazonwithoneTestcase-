package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	

	// Method to initialize the browser based on parameters passed
	@BeforeTest()
	@Parameters({"os", "browser"})

    // Loading configuration properties from config file
	public void invokeBrowser(String os, String browser) throws IOException {
		FileReader fileReader = new FileReader(".//src/test/resources/config.properties");
		Properties properties = new Properties();
		properties.load(fileReader);
		
	
        // Setting up browser based on input parameter
		if(browser.equalsIgnoreCase("chrome")) {			
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("No Matching Browser");
			return;
		}
        // Configuring driver settings
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(properties.getProperty("Url"));
		
		driver.manage().window().maximize();
	}
	
//     Method to close the browser after test execution
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}

}
