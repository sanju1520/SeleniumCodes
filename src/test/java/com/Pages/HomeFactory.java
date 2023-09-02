package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFactory {
	WebDriver driver;
	
	@FindBy(className="product_sort_container") WebElement dropdown;
	@FindBy(xpath="//*[@id=\"inventory_filter_container\"]/select/option[2]") WebElement select;
	@FindBy(xpath="//*[@id=\"item_3_title_link\"]/div")WebElement item;
	
	public HomeFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchItem() throws AWTException, InterruptedException {
		dropdown.click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		item.click();
		
	}
	

}
