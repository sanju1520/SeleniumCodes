package com.Pages.BurgerKing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BurgerkingMain {
	WebDriver driver;
	BurgerLoginFactory log;
	BurgerKingAddtoCart add;
  @Test
  public void verifyBurgerKing() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();         // creating web-driver instance
	  driver.get("https://www.burgerking.in/"); 
	  driver.manage().window().maximize();
	  
	  log=new BurgerLoginFactory(driver);
	  log.burgerKingLogin();
	  
	  add=new BurgerKingAddtoCart(driver);
	  add.addtoCart();
  }
}
