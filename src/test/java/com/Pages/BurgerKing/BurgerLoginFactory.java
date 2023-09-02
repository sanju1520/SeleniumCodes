package com.Pages.BurgerKing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerLoginFactory {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[3]/span")WebElement login;
	@FindBy(xpath="//input[@id='mobileNumber']")WebElement mobileno;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/button/span")WebElement otp;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/button")WebElement verifyotp;
	
	public BurgerLoginFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void burgerKingLogin() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(login).click().build().perform();
		act.moveToElement(mobileno).sendKeys("9922402712").build().perform();
		otp.click();
		Thread.sleep(15000);
		verifyotp.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		
		
	}

}
