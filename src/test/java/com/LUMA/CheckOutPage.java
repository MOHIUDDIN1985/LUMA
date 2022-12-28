package com.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage{
	CheckOutPage(WebDriver driver){
		this.driver =driver;
	}
	By email = By.xpath("//div[@class='control _with-tooltip']/input[@id='customer-email']");
	By FirstName = By.xpath("//input[@name='firstname']");
	By LastName = By.xpath("//input[@name='lastname']");
	By company = By.xpath("//input[@name='company']");
	By StAddress = By.xpath("//input[@name='street[0]']");
	By Ccity = By.xpath("//input[@name='city']");
	By provideCityNM = By.xpath("//select[@name='region_id']");
	By postalCode = By.xpath("//input[@name='postcode']");
	By phn = By.xpath("//input[@name='telephone']");
	By flatRate = By.xpath("//td[text()='Flat Rate']");
	By BestWay = By.xpath("//td[text()='Best Way']");
	By clickNxt = By.xpath("//span[text()='Next']");
	By placeOrdr = By.xpath("//span[text()='Place Order']");
	
	public void CheckOut(String emails,String FName,String LName,String Com,String adres,String city,String postcode, String phone ) throws InterruptedException {
		driver.findElement(email).sendKeys(emails);
		Thread.sleep(2000);
		driver.findElement(FirstName).sendKeys(FName);
		Thread.sleep(2000);
        driver.findElement(LastName).sendKeys(LName);
		Thread.sleep(2000);
        driver.findElement(company).sendKeys(Com);
		Thread.sleep(2000);
        driver.findElement(StAddress).sendKeys(adres);
		Thread.sleep(2000);
		driver.findElement(Ccity).sendKeys(city);
		Thread.sleep(2000);
        Select town = new Select(driver.findElement(provideCityNM));
        Thread.sleep(2000);
        town.selectByVisibleText("New York");
        Thread.sleep(2000);
        driver.findElement(postalCode).sendKeys(postcode);
        Thread.sleep(2000);
        driver.findElement(phn).sendKeys(phone);
        Thread.sleep(2000);
        driver.findElement(flatRate).click();
        Thread.sleep(4000);
        driver.findElement(clickNxt).click();
        Thread.sleep(2000);
        driver.findElement(placeOrdr).click();
        Thread.sleep(2000);
       // System.out.println(driver.findElement(By.xpath("//span[text()='Thank you for your purchase!']")).getText());
        
        
        
        

		
	}

}
