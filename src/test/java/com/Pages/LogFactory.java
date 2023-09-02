package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogFactory {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='user-name']")WebElement uname;
	@FindBy(id="password")WebElement pwd;
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")WebElement logbtn;
	
	
	public LogFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//	public void swagLog(String uid,String pass) {
//		uname.sendKeys(uid);
//		pwd.sendKeys(pass);
//	}
	
	public void swagLogin() {
		uname.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
	}
	public void swagLog() {
		uname.sendKeys("locked_out_user");
		pwd.sendKeys("secret_sauce");
	}
	
//	public void swagLabsLogInData(String username , String password)
//    {
//        uname.sendKeys("standard_user");
//        pwd.sendKeys("secret_sauce");
//    }

	public void clickbtn() {
		logbtn.click();
	}

}






////webElement has to satisfy all findBy conditions
//@FindBys({
//	@FindBy(),
//})WebElement password;
//
////WebElement satisfy at least one FindBy conditions
//@FindAll({
//	
//})WebElement pass;
