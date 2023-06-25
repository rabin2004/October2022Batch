package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SetupTest {

	public static void main(String[] args) throws InterruptedException {
		// 1. set property -> which driver? | location of driver
			// for chrome driver -> key | location as value
			// driver path -> windows: provide file.exe, \\ needed | mac: no need .exe, / needed
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); 
		
		// 2. Create instance of ChromeDriver class, referring to WebDriver
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		// 3. to load web application
		driver.get("https://www.amazon.com");
		
		Thread.sleep(5000);
		
		// 4. Close browser
		driver.quit();
	}
	
	// Assignment: 	1. Complete last Java assignment with remaing OOPS concept
				//	2. Get Selenium jar files & Chrome driver - test setup

}
