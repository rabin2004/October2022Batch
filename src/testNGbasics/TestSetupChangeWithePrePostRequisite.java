package testNGbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSetupChangeWithePrePostRequisite {
	WebDriver driver;
	String product = "apple";
	String invalidProduct = "@(*&@*$#@#&*(&*23482394823482";
	
	// Assertion -> validation point
		// 1. AssertEquals(actual,expected) -> actual=expected: Passed | if not Failed
		// 2. AssertTrue(booleanOutput) -> true: Passed | if not failed
		// 3. AssertFalse(booleanOutput) -> false: Passed | if not failed

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

	@Test
	public void positiveSearchFunctionalityTest() {
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

	@Test
	public void negativeSearchFunctionalityTest() {
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
