package com.Pages.BurgerKing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerKingAddtoCart {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[2]/section[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/button/div/span[1]")
	WebElement item;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[4]/span")WebElement cart;
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[4]/div/div[2]/div/div[2]")WebElement addcart;
	
	
	public BurgerKingAddtoCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addtoCart() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(item).click().build().perform();
		Thread.sleep(1000);
		act.moveToElement(addcart).click().build().perform();
		Thread.sleep(2000);
		act.moveToElement(cart).click().build().perform();
	}
	

}
