package com.selenium.SeleniumCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();         // creating web-driver instance
		driver.get("https://www.magicbricks.com/"); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		
		driver.findElement(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")).click();
		
		//Explicit wait				
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a"))).click();
		
		//fluent wait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(4));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.withMessage("fluent wait");
        wait.ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")));
		
	}

}
