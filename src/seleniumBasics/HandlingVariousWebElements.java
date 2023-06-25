package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingVariousWebElements {
	static String product = "amazon basics";
	static String invalidUsername = "test12@gmail.com";
	static String invalidPassword = "test@12345";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// Positive Search functionality testing
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtBox.sendKeys(product);
		
//		WebElement searchBtn = driver.findElement(By.className("nav-input nav-progressive-attribute"));
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
//		WebElement searchResultHeaderMsg = driver.findElement(By.className("a-color-state a-text-bold"));
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
		
		// Negative login functionality test
//		driver.findElement(By.linkText("Hello, sign in")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys(invalidUsername);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(invalidPassword);
		
		// handling checkbox
		WebElement keepMeSignedInCheckBx = driver.findElement(By.name("rememberMe"));
		Thread.sleep(3000);
		keepMeSignedInCheckBx.click();
		Thread.sleep(3000);
		keepMeSignedInCheckBx.click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement loginErrorMsg = driver.findElement(By.id("auth-error-message-box"));
		if(loginErrorMsg.isDisplayed()) {
			System.out.println("Negative Login functionality test: Passed");
		}else {
			System.err.println("Negative Login functionality test: failed");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
