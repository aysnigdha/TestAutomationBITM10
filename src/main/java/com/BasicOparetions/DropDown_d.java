package com.BasicOparetions;

import com.base.BaseOfProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown_d extends BaseOfProject {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser("firefox");
        url_open("https://potential-commerce.netlify.app/");
        selectCountry();
        customWait(3000);
    }
    public static void selectCountry()
            throws InterruptedException {
        clickOnElementBy_Css("div.MuiGrid-root:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > svg:nth-child(1) > path:nth-child(1)");
        clickOnElementBy_Css(".MuiToolbar-root > div:nth-child(3) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1) > svg:nth-child(1) > path:nth-child(1)");

        customWait(5000);
        //Scroll
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)");


        clickOnElementBy_Css("a.MuiButtonBase-root:nth-child(2) > span:nth-child(1)");
        customWait(3000);

        //Scroll
        js.executeScript("scrollBy(0,500)");

        customWait(3000);
        WebElement countryList=driver.findElement(By.cssSelector("div.MuiGrid-root:nth-child(7) > div:nth-child(2) > div:nth-child(1)"));
        Select obj=new Select(countryList);
        obj.selectByVisibleText("ortugal");

    }

}
