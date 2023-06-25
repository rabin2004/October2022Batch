package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	
	WebDriver driver;
	
	// pre-requisite
	HandlingWebTable(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	// post-requisite
	void closeBrowser() {
		driver.quit();
	}
	
	String[][] specialOfferData() {
		String[][] offer = {	{"Atlanta to Las Vegas","$398"},
								{"Boston to San Francisco","$513"},
								{"Los Angeles to Chicago","$168"},
								{"New York to Chicago","$198"},
								{"Phoenix to San Francisco","$213"}};
		return offer;
	}
	
	void webTableHandling() {
		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
//		String offerDestination1 = offerTable.findElement(By.xpath("//tr[1]/td[1]/font")).getText();
//		System.out.println(offerDestination1);
//		String offerAmount1 = offerTable.findElement(By.xpath("//tr[1]/td[2]/div/font/b")).getText();
//		System.out.println(offerAmount1);
//		
//		String offerDestination2 = offerTable.findElement(By.xpath("//tr[2]/td[1]/font")).getText();
//		System.out.println(offerDestination2);
//		String offerAmount2 = offerTable.findElement(By.xpath("//tr[2]/td[2]/div/font/b")).getText();
//		System.out.println(offerAmount2);
		
		for(int i=1; i<=5; i++) {
			String stringI = Integer.toString(i);
			String offerDestination = offerTable.findElement(By.xpath("//tr["+stringI+"]/td[1]/font"))
					.getText();
			String offerAmount = offerTable.findElement(By.xpath("//tr["+stringI+"]/td[2]/div/font/b"))
					.getText();
//			System.out.println("Offer "+stringI+":"+offerDestination+" | "+offerAmount);
			if(offerDestination.equals(specialOfferData()[i-1][0]) &&
					offerAmount.equals(specialOfferData()[i-1][1])) {
				System.out.println("Offer "+stringI+": "+offerDestination+" | "+offerAmount+" - Passed");
			}else {
				System.err.println("Offer "+stringI+": "+offerDestination+" | "+offerAmount+" - Failed");
			}
		}
	}

	public static void main(String[] args) {
		HandlingWebTable hwt = new HandlingWebTable();
		hwt.webTableHandling();
		hwt.closeBrowser();

	}
	
	//Assignment: 1. Webtable and calendar handling 
				// 	2. Customization of xpath & css selector using all strategy at least for 10 elements

}
