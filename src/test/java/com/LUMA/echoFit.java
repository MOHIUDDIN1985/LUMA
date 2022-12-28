package com.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class echoFit extends BasePage {
	echoFit(WebDriver driver){
		this.driver = driver;
	}
	By size29 = By.xpath("//div[@id='option-label-size-143-item-172']");
	By size28 = By.xpath("//div[@id='option-label-size-143-item-171']");
	By black = By.xpath("//div[@id='option-label-color-93-item-49']");
	By blue = By.xpath("//div[@id='option-label-color-93-item-50']");
	By pink = By.xpath("//div[@id='option-label-color-93-item-57']");
	By quantity = By.xpath("//input[@id='qty']");
	By cartAdd = By.xpath("//span[text()='Add to Cart']");
	By cart = By.xpath("//a[@class=\"action showcart\"]");
	By Proceed = By.xpath("//button[text()='Proceed to Checkout']");
	By editCart = By.xpath("//a[@class=\"action edit\"]");
	By deleteCart = By.xpath("//a[@class=\"action delete\"]");
	
	 
		
	public void selectSize(int size) throws InterruptedException {
		if( size == 28) {
			driver.findElement(size28).click();
			Thread.sleep(2000);
		}
		else {
			driver.findElement(size29).click();
			Thread.sleep(2000);

		}
	}
	public void selectColor(String color) throws InterruptedException {
		if(color == "black") {
			driver.findElement(black).click();
			Thread.sleep(2000);

		}
		else if(color == "blue") {
			driver.findElement(blue).click();
			Thread.sleep(2000);

		}
		else {
			driver.findElement(pink).click();
			Thread.sleep(2000);

		}
	}
	public void selectQuantity() throws InterruptedException {
	        driver.findElement(quantity).clear();
			Thread.sleep(2000);
			driver.findElement(quantity).sendKeys("2");
			Thread.sleep(2000);

			}
	public void addCart() throws InterruptedException {
		driver.findElement(cartAdd).click();
		Thread.sleep(2000);

	}
	public void clickOnCart() throws InterruptedException {
		driver.findElement(cart).click();
		Thread.sleep(2000);
	}
	public void proceedToChkOut() throws InterruptedException {
		driver.findElement(Proceed).click();
		Thread.sleep(2000);
	}
	public void editCart() throws InterruptedException {
		driver.findElement(editCart).click();
		Thread.sleep(2000);

	}
	public void deleteCart() throws InterruptedException {
		driver.findElement(deleteCart).click();
		Thread.sleep(2000);

	}

}
