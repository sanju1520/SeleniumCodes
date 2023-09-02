package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void browserTest(String browser) {
		if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();  
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();  
		}
		driver.get("https://www.google.com");;
	}
	
	
  @Test
  public void imageClick() {
	  driver.findElement(By.linkText("Images")).click();
  }
  
  @AfterTest
  public void teardown() {
	  driver.close();
  }
  
}
