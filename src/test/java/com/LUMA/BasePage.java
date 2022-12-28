package com.LUMA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {



	WebDriver driver;
	public HomePage Hm;
	public CollectionPage1 cl1;
	public echoFit ef;
	public CheckOutPage cout;
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");  	
		driver=new ChromeDriver(); 
		Hm = new HomePage(driver);
		cl1 = new CollectionPage1(driver);
		ef = new echoFit(driver);
		cout = new CheckOutPage(driver);
	}
	public void openBrowser() {
		    	driver.get("https://magento.softwaretestingboard.com/");
				driver.manage().window().maximize();
				((JavascriptExecutor) driver).executeScript("scroll(0,300)");

	}
	  public void scroll(){
	        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

	    }
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	

}
