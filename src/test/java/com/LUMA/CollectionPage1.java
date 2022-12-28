package com.LUMA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CollectionPage1 extends BasePage {

	CollectionPage1(WebDriver driver){
		this.driver = driver;
	}
	By EchoFit =By.xpath("//img[@alt='Echo Fit Compression Short']");
	
	public void echoPant() throws InterruptedException {
		driver.findElement(EchoFit).click();
		Thread.sleep(3000);
	}

}
