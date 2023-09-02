package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
	By ellipse=By.cssSelector("#react-burger-menu-btn");
	By logout=By.id("logout_sidebar_link");
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(ellipse).click();
		
		driver.findElement(logout).click();
	}

}
