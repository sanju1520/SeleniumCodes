package com.Pages;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	WebDriver driver;
    By add=By.xpath("//*[@id=\"item_3_title_link\"]/div");
    By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path");

    public AddToCart(WebDriver driver) {
        this.driver=driver;
    }
    public void productAdd() throws AWTException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(add).click();
        driver.findElement(cart).click();
    }
}
