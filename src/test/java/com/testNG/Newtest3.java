package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtest3 {
	WebDriver driver;
	
  @Test(priority=-1)
  public void login() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();         // creating web-driver instance
	  driver.get("https://www.saucedemo.com/"); 
	  driver.manage().window().maximize();
  }
  
  @Test(priority=1)
  @Parameters({"username","password"})
  public void test2(@Optional("problem_user")String username,@Optional("secret_user")String password) {
	    driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
  }
  
  @Test(priority=2)
  public void teardown() {
	  driver.close();
  }
  
}
