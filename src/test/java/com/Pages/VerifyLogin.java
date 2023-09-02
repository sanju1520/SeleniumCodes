package com.Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLogin {
	WebDriver driver=null;
  @Test
  public void testLog() throws AWTException, InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();         // creating web-driver instance
	  driver.get("https://www.saucedemo.com/"); 
	  driver.manage().window().maximize();
	  
	  LogPage lp=new LogPage(driver);
	  lp.typeLog("problem_user","secret_sauce");
	  
	  HomePage hp=new HomePage(driver);
	  hp.dropdownClick();
	  
	  AddToCart ac=new AddToCart(driver);
	  ac.productAdd();
	  
	  LogoutPage lop=new LogoutPage(driver);
	  lop.logout();
  }
}
