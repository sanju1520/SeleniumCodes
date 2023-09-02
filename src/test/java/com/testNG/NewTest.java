package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();         // creating web-driver instance
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		
		//hard Assert
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"Title Mismatched");
		
//		//soft assert
//		String expectedUrl="https://www.google.com/";
//		String actualUrl=driver.getCurrentUrl();
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(actualUrl, expectedUrl,"URL not same");
//		soft.assertAll();
  }
}
