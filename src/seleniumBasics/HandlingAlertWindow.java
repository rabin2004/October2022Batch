package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertWindow {
	WebDriver driver;
	
	HandlingAlertWindow(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	void closeApp() {
		driver.quit(); // quit() -> close all the window opened by browser instance
	}
	
	void handlingAlert(String cusID) throws InterruptedException {
		// alert/pop-up/java pop-up -> switchTo().alert() -> 1. capture msg txt | 2. accept	| 3. dismiss
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerIDtxtBox = driver.findElement(By.name("cusid"));
		customerIDtxtBox.sendKeys(cusID);
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		// pop should appear
		// without handling pop-up -> UnhandledAlertException: unexpected alert open: {Alert text : Do you really want to delete this Customer?}
//		WebElement resetBtn = driver.findElement(By.name("res"));
//		resetBtn.click();
		
		// after handling pop-up
//		driver.switchTo().alert();
		String actualFirstAlertMsg = driver.switchTo().alert().getText();
		String expectedFirstAlertMsg = "Do you really want to delete this Customer?";
		String expectedSecondAlertMsg = "Customer Successfully Delete!";
		
		if(actualFirstAlertMsg.equals(expectedFirstAlertMsg)) {
//			driver.switchTo().alert().accept();
			driver.switchTo().alert().dismiss();
			// trying to handle alert which is not present -> NoAlertPresentException: no such alert
			String actualSecondAlertMsg = driver.switchTo().alert().getText();
			if(actualSecondAlertMsg.equals(expectedSecondAlertMsg)) {
				driver.switchTo().alert().accept();	
				Thread.sleep(3000);
				WebElement resetBtn = driver.findElement(By.name("res"));
				resetBtn.click();
			}else {
				System.err.println("Second Alert msg is not as expected: Test Failed");
				System.out.println("Actual Second alert msg: "+actualSecondAlertMsg);
				System.out.println("Expected Second alert msg: "+expectedSecondAlertMsg);
			}
		}else {
			System.err.println("First Alert msg is not as expected: Test Failed");
			System.out.println("Actual First alert msg: "+actualFirstAlertMsg);
			System.out.println("Expected First alert msg: "+expectedFirstAlertMsg);
		}
	}
	
	void windowHandling() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();
		
		// without switching to new window - if tried to identify element in new window -> will fail
//		WebElement newWindowHeader = driver.findElement(By.xpath("//h3[text()='New Window']"));
//		System.out.println("New window header: "+newWindowHeader.getText());
		
		// getWindowHandle() | getWindowHandles()
//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println("Parent Window handle: "+parentWindowHandle);
		
		clickHereLink.click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of window: "+handles.size());
		System.out.println(handles);
		
		// switchTo().window(handle)
		Iterator<String> it = handles.iterator();
//		while(it.hasNext()) {
//			String handle = it.next();
//			driver.switchTo().window(handle);
//			System.out.println("Window handle: "+handle);
//			System.out.println("Window Title: "+driver.getTitle());
//			System.out.println("Window Url: "+driver.getCurrentUrl());
//			Thread.sleep(3000);
//			driver.close(); // close() -> will close only the window on focus
//		}
		
		String parentWindowHandle = it.next();
		String firstChildWindowHandle = it.next();
		String secondChildWindowHandle = it.next();
		
		driver.switchTo().window(firstChildWindowHandle);
		driver.close();
//		System.out.println(driver.getTitle()); // NoSuchWindowException: no such window: target window already closed
		driver.switchTo().window(secondChildWindowHandle);
		System.out.println(driver.getTitle()); 
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle()); 
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		HandlingAlertWindow haw = new HandlingAlertWindow();
//		haw.handlingAlert("ks123");
		
		haw.windowHandling();
		
//		haw.closeApp();
	}

}
