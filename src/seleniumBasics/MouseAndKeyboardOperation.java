package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class MouseAndKeyboardOperation {
	WebDriver driver;
	
	MouseAndKeyboardOperation(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void closeApp() {
		driver.quit();
	}
	
	void mouseKeyboardOperation() throws InterruptedException {
		// Actions class -> pass driver in constructor of Actions class instance
		// Steps: 1. identify element | 2. define action/s | 3. build() then perform()

		driver.get("https://www.amazon.com");
		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));

		Actions action = new Actions(driver);

		Thread.sleep(3000);
//		action.moveToElement(searchTxtBox).build().perform();
//		Thread.sleep(3000);
//		action.click().build().perform();
//		Thread.sleep(3000);
//		action.sendKeys("apple").build().perform();
//		Thread.sleep(3000);
		
		String product = "apple";
		action.moveToElement(searchTxtBox).click().sendKeys(product).build().perform();
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		if(driver.getTitle().contains(product)) {
			System.out.println("Positive Search Functionality with Enter key: Passed");
		}else {
			System.out.println("Positive Search Functionality with Enter key: Failed");
		}
		
		// StaleElementReferenceException: stale element reference: stale element not found
		searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchTxtBox).doubleClick().build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		action.sendKeys("samsung").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		if(driver.getTitle().contains("samsung")) {
			System.out.println("Positive Search Functionality with Enter key: Passed");
		}else {
			System.out.println("Positive Search Functionality with Enter key: Failed");
		}
	}
	
	void dynamicDropDown() throws InterruptedException {
		driver.get("https://www.amazon.com");
		WebElement acountList = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(acountList).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("Account"))).click().build().perform();
		Thread.sleep(3000);
		
		if(driver.getTitle().contains("Your Account")) {
			System.out.println("Positive account link test from acountlink dynamic dropdown: Passed");
		}else {
			System.out.println("Positive account link test from acountlink dynamic dropdown: Failed");
		}
	}
	
	void handlingIframeDragAndDropOperation() {
		driver.get("https://jqueryui.com/droppable/");
		
		// without handling iframe
//		WebElement dragObj = driver.findElement(By.id("draggable"));
		// handle iframe -> 1. index of iframe | 2. iframe webElement | 3. iframe name in String
		driver.switchTo().frame(0);
//		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
//		String iframeTxt = frame.getText();
//		driver.switchTo().frame(frame);
//		driver.switchTo().frame(iframeTxt);
		
		WebElement dragObj = driver.findElement(By.id("draggable"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		// 1.
//		action.dragAndDrop(dragObj, dropLocation).build().perform();
		// 2.
//		action.moveToElement(dragObj).clickAndHold().moveToElement(dropLocation).release()
//		.build().perform();
		// 3.
		action.clickAndHold(dragObj).release(dropLocation).build().perform();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MouseAndKeyboardOperation mak = new MouseAndKeyboardOperation();
//		mak.mouseKeyboardOperation();
//		mak.dynamicDropDown();
		mak.handlingIframeDragAndDropOperation();
		mak.closeApp();
	}

	// Assignment: Practice handling alert/windows/iframe/Mouse & Keyboard operation including past assignments
}
