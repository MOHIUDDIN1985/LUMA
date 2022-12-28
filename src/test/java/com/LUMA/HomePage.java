package com.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	HomePage(WebDriver driver){
		this.driver = driver;
	}
	By yoga = By.xpath("//span[text()='Shop New Yoga']");
	
	public void selectProduct() {
		driver.findElement(yoga).click();
	}
	}


