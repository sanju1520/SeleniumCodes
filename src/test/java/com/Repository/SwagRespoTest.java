package com.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagRespoTest {
	WebDriver driver;
	@Test
	public void testobj() throws IOException, InterruptedException {
		File src=new File("C:\\Users\\satate\\eclipse_workspace_3\\SeleniumTraining\\SeleniumCodes\\src\\test\\java\\com\\Repository\\swagRepo.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();         // creating web-driver instance
		driver.get("https://www.saucedemo.com/"); 
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("swag.log.uname.xpath"))).sendKeys("standard_user");
		driver.findElement(By.xpath(pro.getProperty("swag.log.pwd.xpath"))).sendKeys("secret_sauce");
		driver.findElement(By.xpath(pro.getProperty("swag.log.logbtn.xpath"))).click();
				
	}

}
