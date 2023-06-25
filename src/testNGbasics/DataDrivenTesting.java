package testNGbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class DataDrivenTesting {
	
	// Data Driven Testing -> 
		// 1. Data providing method -> use @DataProvider
				//	-> Data providing method will handle and return data in Array format
		// 2. Data using test method -> use keyword 
				// if data is defined in the same class -> dataProvider="dataProvidingMethodName"
				// if data is defined in different class in the same package -> dataProviderClass=className.class, dataProvider="dataProvidingMethodName" 
				// if data is defined in the class of the different package -> dataProviderClass=packageName.className.class, dataProvider="dataProvidingMethodName" 
		// 3. Handle data using method parameter
		// 4. Parameter defined can be used in the code
	
	WebDriver driver;
	
	@DataProvider
	public String[] positiveSearchData() {
		String[] data = {	"apple",
							"samsung",
							"pixel",
							"surface",
							"mac"};
		return data;
	}

	@BeforeClass
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@AfterMethod
	public void getBackToHomePage() {
		driver.findElement(By.id("nav-logo-sprites")).click();
	}

	@Test(dataProvider="positiveSearchData")
	public void positiveSearchFunctionalityTest(String product) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(product);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();

		WebElement searchResultHeaderMsg = driver
				.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));

		Assert.assertTrue(searchResultHeaderMsg.isDisplayed());
		String searchResultProduct = searchResultHeaderMsg.getText();
		Assert.assertTrue(searchResultProduct.contains(product));
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Amazon.com : ".concat(product);
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
	
	@Test(dataProviderClass=seleniumBasics.PositiveSearchFunctionalityTestData.class,  
			dataProvider="positiveSearchData")
	public void positiveSearchFunctionalityTestHittingEnterKey(String product) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(product);

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		WebElement searchResultHeaderMsg = driver
				.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));

		Assert.assertTrue(searchResultHeaderMsg.isDisplayed());
		String searchResultProduct = searchResultHeaderMsg.getText();
		Assert.assertTrue(searchResultProduct.contains(product));
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Amazon.com : ".concat(product);
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}

	@Test(dataProviderClass=NegativeSearchFunctionalityTestData.class, dataProvider="negativeSearchData")
	public void negativeSearchFunctionalityTest(String invalidProduct) {
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(invalidProduct);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();

		WebElement noResultHeaderMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		WebElement noResultHeaderProductName = driver.findElement(By.xpath("//span[text()='" + invalidProduct + "']"));

		Assert.assertTrue(noResultHeaderMsg.isDisplayed());
		Assert.assertTrue(noResultHeaderProductName.isDisplayed());
		
		Assert.assertFalse(!noResultHeaderProductName.isDisplayed());
	}
}
