package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogPage {
	WebDriver driver;
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By logbtn=By.cssSelector("#login-button");
	
	public LogPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeLog(String uid,String pass) {
		driver.findElement(uname).sendKeys(uid);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(logbtn).click();
	}
	
	public void typeUser() {
		driver.findElement(uname).sendKeys("standard_user");
	}
	
	public void typePassword() {
		driver.findElement(pwd).sendKeys("secret_sauce");
	}
	
	public void typeButton() {
		driver.findElement(logbtn).click();;
	}

}
