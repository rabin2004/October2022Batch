package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class HandlingConfigFileTakingScreenShot {
	
	WebDriver driver;
	Properties prop;
	
	HandlingConfigFileTakingScreenShot(){
	// Handling Config file (.properties file)
		// 1. Instance of Properties class
		try {
			prop = new Properties();
			// 2. Read config file - FileInputStream class
			FileInputStream fis = new FileInputStream(
					new File("C:\\Users\\User\\eclipse-workspace\\October2022Batch\\src\\seleniumBasics"
							+ "\\config.properties"));
			// 3. Load file ready into Properties class instance
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	void loadApp() {
		String browser = prop.getProperty("browserName");
		
		// cross browser testing
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default: 
				System.out.println("Invalid brower selected.");
		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("workingUrl"));
	}
	
	void validateSiteNotReachedMsg() {
		WebElement siteNotReached = driver.findElement(By.
				xpath("//*[text()='This site can’t be reached']"));
		String actualSiteNotReachedMsg = siteNotReached.getText();
		String expectedSiteNotReachedMsg = prop.getProperty("siteNotReachedMsg");
		if(siteNotReached.isDisplayed()) {
			if(actualSiteNotReachedMsg.equals(expectedSiteNotReachedMsg)) {
				System.out.println("Invalid test url: Passed");
			}else {
				System.err.println("Invalid test url (Error message don't matach): Failed");
				System.out.println("Actual msg: "+actualSiteNotReachedMsg);
				System.out.println("Expected msg: "+expectedSiteNotReachedMsg);
			}
		}else {
			System.err.println("Invalid test url: Failed");
		}
	}
	
	void postivieSearchFunctionality() {
		String product = prop.getProperty("validProduct");
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(product);
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		WebElement searchResultHeaderMsg = driver.findElement(By.
				xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));
		
		if(searchResultHeaderMsg.isDisplayed()) {
			String searchResultProduct = searchResultHeaderMsg.getText();
			if(searchResultProduct.contains(product)) {
				System.out.println("Search functionality test: Passed");
			}else {
				System.err.println("Search functionality test failed: Text doesn't match with product");
			}
		}else {
			System.err.println("Search functionality test failed: Element not visible");
		}
	}
	
	// Taking screenshots -> needs apache common.io jars
		// 1. sreenshot of an element | 2. screenshot of the page -> getScreenshotAs()
	void negativeLoginFunctionalityTest() {
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("invalidUsername"));
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("invalidPassword"));
		
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement loginErrorMsg = driver.findElement(By.id("auth-warning-message-box"));
		if(loginErrorMsg.isDisplayed()) {
			System.out.println("Negative Login functionality test: Passed");
		// 2. screenshot of the page
			try {
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\User\\eclipse-workspace\\October2022Batch"
						+ "\\src\\seleniumBasics\\loginErrorMsgPage.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		// 1. sreenshot of an element
			try {
				File src2 = loginErrorMsg.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src2, new File("C:\\Users\\User\\eclipse-workspace"
						+ "\\October2022Batch\\src\\seleniumBasics\\loginErrorMsg.png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.err.println("Negative Login functionality test: failed");
		}
	}
	
	void closeApp() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		HandlingConfigFileTakingScreenShot hcf = new HandlingConfigFileTakingScreenShot();
		hcf.loadApp();
//		hcf.validateSiteNotReachedMsg();
//		hcf.postivieSearchFunctionality();
		hcf.negativeLoginFunctionalityTest();
		hcf.closeApp();
	}

}
