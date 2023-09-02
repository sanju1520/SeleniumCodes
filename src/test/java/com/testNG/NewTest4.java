package com.testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest4 {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();         // creating web-driver instance
	  driver.get("https://www.saucedemo.com/"); 
	  driver.manage().window().maximize();
  }
  
  @Test(timeOut=1000,expectedExceptions= {NoSuchElementException.class})
  public void login() {
	  driver.findElement(By.id("username")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
