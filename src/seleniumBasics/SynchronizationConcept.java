package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class SynchronizationConcept {
	static String product = "amazon basics";
	static String invalidUsername = "test12@gmail.com";
	static String invalidPassword = "test@12345";

	// Synchronization -> synch between application loading and automation execution
	
			// Types of synchronization:
				// 1. Static wait -> pause in execution, Thread.sleep(5000);
			
				// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
						// a. Implicit wait: -> global wait, defined once applicable for all elements where action is going to be performed -> implicitlyWait()
						// b. Explicit wait: -> defined for a specific element -> WebDriverWait class
								
								// Fluent wait: -> polling/frequency of search can be adjusted -> FluentWait class
		// E.g
		//Implicit wait -> 15 seconds -> default frequency of search every 5 seconds
		//Explicit wait -> 30 seconds -> default frequency of search every 5 seconds
		// 0-5-10-15-20-25-30 -> 1 element 16th sec - 4 sec wastage
		// Fluent wait -> 30 seconds/polling:2sec ->
			// 0-2-4-6-8-10.... -> 1 element 16th sec - no wastage
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(invalidUsername);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(invalidPassword);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		// Explicit wait
//		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
//		WebElement loginErrorMsg = driver.findElement(By.id("auth-error-message-box"));
//		explicitWait.until(ExpectedConditions.visibilityOf(loginErrorMsg));
		
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("auth-error-message-box")));
		// org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: auth-error-message-box (tried for 20 second(s) with 500 milliseconds interval)
		
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(20))
									.pollingEvery(Duration.ofSeconds(5))
									.ignoring(NoSuchElementException.class);
		fl.until(ExpectedConditions.visibilityOfElementLocated(By.id("auth-error-message-box")));
		// org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: auth-error-message-box (tried for 20 second(s) with 5000 milliseconds interval)
		
//		if(loginErrorMsg.isDisplayed()) {
		if(driver.findElement(By.id("auth-error-message-box")).isDisplayed()) {
			System.out.println("Negative Login functionality test: Passed");
		}else {
			System.err.println("Negative Login functionality test: failed");
		}
		
		driver.quit();
		
		// Assignment: 1. Practice Handling config file/cross browser/screenshot/synchronization for 1 app and multile features
	}
}
