package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
import org.testng.Assert;

public class DataProviderTest {
@Test(dataProvider="loginData")
  public void testLog(String user, String pwd)throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();         // creating web-driver instance
	   driver.get("https://www.saucedemo.com/"); 
	   driver.manage().window().maximize();
	   
	   System.out.println("thread Id: "+Thread.currentThread().getId());
	   driver.findElement(By.id("user-name")).sendKeys(user);
	   Thread.sleep(1000);
	   driver.findElement(By.id("password")).sendKeys(pwd);
	   Thread.sleep(1000);
	   driver.findElement(By.id("login-button")).click();
	   Thread.sleep(1000);
	   WebElement symbol=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
	   Assert.assertEquals(true,symbol.isDisplayed());
  }
  
  @DataProvider (parallel=true)
  public Object [][] loginData(){
	  Object [][] data=new Object[3][2];
	  
	  data[0][0]="standard_user";
	  data[0][1]="secret_sauce";
	  
	  data[1][0]="problem_user";
	  data[1][1]="secret_sauce";
	  
	  data[2][0]="performance_glitch_user";
	  data[2][1]="secret_sauce";
	  
	  return data;
  }
}
