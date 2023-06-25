package testNGbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGsetup {
	WebDriver driver;
	String product = "apple";
	String invalidProduct = "@(*&@*$#@#&*(&*23482394823482";
	String invalidUsername = "test@gmail.com";
	String invalidPassword = "test12";
	
	// Annotations: 1. Test annotation -> @Test
				//	2. Pre-requisite annotations -> @Before...
				// 	3. Post-requisite annotations -> @After...
	
	@BeforeMethod
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
  @Test // Test annotation -> test method to write automation script for specific test case
  public void positiveSearchFunctionalityTest() {
	  // Pre-requisite
//	  	WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");

		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(product);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
	
		WebElement searchResultHeaderMsg = driver.findElement(By.
				xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));
		
		// Verification point
//		if(searchResultHeaderMsg.isDisplayed()) {
//			String searchResultProduct = searchResultHeaderMsg.getText();
//			if(searchResultProduct.contains(product)) {
//				System.out.println("Search functionality test: Passed");
//			}else {
//				System.err.println("Search functionality test failed: Text doesn't match with product");
//			}
//		}else {
//			System.err.println("Search functionality test failed: Element not visible");
//		}
		
		// Validation point -> Assertion
		Assert.assertTrue(searchResultHeaderMsg.isDisplayed());
		String searchResultProduct = searchResultHeaderMsg.getText();
		Assert.assertTrue(searchResultProduct.contains(product));
		
		// Post-requisite
//		driver.quit();
  }
  
  @Test
  public void negativeSearchFunctionalityTest() {
	// Pre-requisite
//	  	WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
		
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(invalidProduct);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		WebElement noResultHeaderMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		WebElement noResultHeaderProductName = driver.findElement(By
				.xpath("//span[text()='"+invalidProduct+"']"));
		
		// Validation point -> Assertion
		Assert.assertTrue(noResultHeaderMsg.isDisplayed());
		Assert.assertTrue(noResultHeaderProductName.isDisplayed());
		Assert.assertTrue(false);
		
	// Post-requisite
//		driver.quit();
  }
  
  @Test
  public void negativeLoginFunctionalityTest() {
	  	driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(invalidUsername);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(invalidPassword);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement loginErrorMsg = driver.findElement(By.id("auth-error-message-box"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
  }
}
