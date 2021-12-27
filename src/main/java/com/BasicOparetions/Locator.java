package com.BasicOparetions;

import com.base.Open_close_driverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Open_close_driverClass {
    public static void main(String[] args) {
             chrome_launch();
             url_open("https://demo.opencart.com/index.php?route=account/login");
             Locator_ID();
             Locator_Name();
             Locator_XPath();
             Locator_CSSPath();
    }
    public static void Locator_ID(){
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("xyz@mail.com");
    }
    public static void Locator_Name(){
        WebElement Email= driver.findElement(By.name("input-email"));
        Email.clear();
        Email.sendKeys("west@mail.com");
    }
    public static void Locator_XPath() {
        WebElement Email = driver.findElement(By.xpath("i//*[@id=\"input-email\"]"));
        Email.clear();
        Email.sendKeys("east@mail.com");
    }
    public static void Locator_CSSPath() {
        WebElement Email = driver.findElement(By.cssSelector("#input-email"));
        Email.clear();
        Email.sendKeys("qsa@mail.com");
    }
}

