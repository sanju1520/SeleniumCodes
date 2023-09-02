package com.Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPF {
	WebDriver driver;
	LogFactory log;
	HomeFactory home;
  @Test
  public void verifyswagLog() throws AWTException, InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();         // creating web-driver instance
	  driver.get("https://www.saucedemo.com/"); 
	  driver.manage().window().maximize();
	  
	  log=new LogFactory(driver);
	  //log.swagLog("standard_user","secret_sauce");
	  log.clickbtn();
	  
	  home=new HomeFactory(driver);
	  home.searchItem();
  }
}
