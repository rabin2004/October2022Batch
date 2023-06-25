package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioButtonDropDownElements {
	WebDriver driver;
	
	// pre-requisite
	HandlingRadioButtonDropDownElements(){
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	// post-requisite
	void closeBrowser() {
		driver.quit();
	}
	
	// test method
	void handlingRadioButton() throws InterruptedException {
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		
		WebElement roundTripRadioBtn = driver.findElement(By.xpath("/html/body/div[2]/"
				+ "table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr"
				+ "[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
		WebElement oneWayTripRadioBtn = driver.findElement(By.cssSelector("body > div:nth-child(5) "
				+ "> table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > "
				+ "table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > "
				+ "form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > "
				+ "input[type=radio]:nth-child(2)"));
		
		Thread.sleep(3000);
		oneWayTripRadioBtn.click();
		if(oneWayTripRadioBtn.isSelected()) {
			System.out.println("Radio button interaction passed");
		}else {
			System.err.println("Radio button interaction failed");
		}
		Thread.sleep(3000);
		roundTripRadioBtn.click();
		if(roundTripRadioBtn.isSelected()) {
			System.out.println("Radio button interaction passed");
		}else {
			System.err.println("Radio button interaction failed");
		}
		
		WebElement businessClassRadioBtn = driver.findElement(By.xpath("/html/body/div[2]"
				+ "/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
		
		businessClassRadioBtn.click();
		if(businessClassRadioBtn.isSelected()) {
			System.out.println("Radio button interaction passed");
		}else {
			System.err.println("Radio button interaction failed");
		}
	}
	
	void handlingDropDown() throws InterruptedException {
		// Drop Down: hiding more options -> 1. Static -> click to visualize more options | 2. Dynamic -> hover mouse over to see more options -> Mouse & Keyboard operation
		// Static drop down -> tagName -> select -> Select class
				// 1. by index	2. value	3. visible text
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		
		WebElement passCountDropDown = driver.findElement(By.name("passCount"));
		Select select = new Select(passCountDropDown);
		
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByVisibleText("4");
		Thread.sleep(3000);
		
		WebElement departingCityDropDown = driver.findElement(By.name("fromPort"));
		Select select1 = new Select(departingCityDropDown);
		for(int i=0; i<=9; i++) {
			select1.selectByIndex(i);
			Thread.sleep(2000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingRadioButtonDropDownElements hrb = new HandlingRadioButtonDropDownElements();
		
//		hrb.handlingRadioButton(); // test method
		
		hrb.handlingDropDown();
		
		hrb.closeBrowser();
	}

}
