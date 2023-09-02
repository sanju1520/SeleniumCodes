package com.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By filter=By.className("product_sort_container");
    By sel=By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[2]");
    By proclk=By.xpath("//*[@id=\"item_3_title_link\"]/div");
//    By add=By.xpath("//*[@id=\"item_4_title_link\"]/div");
//    By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void dropdownClick() throws AWTException, InterruptedException {
        driver.findElement(filter).click();
         Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
        driver.findElement(proclk).click();
        Thread.sleep(2000);
//        driver.findElement(add).click();
//        driver.findElement(cart).click();
//	
	
    }
}
