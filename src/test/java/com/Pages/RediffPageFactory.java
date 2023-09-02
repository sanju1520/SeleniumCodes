package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPageFactory {
	WebDriver driver;
	List<RediffPageFactory> rediffs = new ArrayList<>();
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")WebElement fullName;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")WebElement mailid;
	@FindBy(id="newpasswd")WebElement pwd;
	@FindBy(id="newpasswd1")WebElement re_password;
	@FindBy(xpath="//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")WebElement alternateId;
	@FindBy(xpath="//input[@id='mobno']")WebElement mobNo;
	@FindBy(xpath="//*[@id=\"Register\"]")WebElement createBtn;
	
	
	public RediffPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void createAccount(String full_name ,String mailId ,String password ,String repassword ,String alternateMailId ,String mobileNo) {
		fullName.sendKeys(full_name);
		mailid.sendKeys(mailId);
		pwd.sendKeys(password);
		re_password.sendKeys(repassword);
		alternateId.sendKeys(alternateMailId);
		mobNo.sendKeys(mobileNo);		
	}
	
	public void clickBtn() {
		createBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(id="srchquery_tbox")WebElement searchBox;
//	@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")WebElement searchIcon;
//	
//	public RediffPageFactory(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
//	}
//	
//	public void sText(String keyword) {
//		searchBox.sendKeys(keyword);
//	}
//	
//	public void sButton() {
//		searchIcon.click();
//	}
}
