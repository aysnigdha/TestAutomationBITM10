package com.BasicOperations;


import com.base.BaseOfProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseOfProject {
    private static String[] args;

    public static void main(String[] args) throws InterruptedException {
        DropDown.args = args;
        launchBrowser("chrome");
        url_open("https://the-internet.herokuapp.com/dropdown");
        customWait(5000);
        selectCountry();
    }
    public static void selectCountry() throws InterruptedException {
        WebElement options=driver.findElement(By.id("dropdown"));
        Select obj=new Select(options);
        //  obj.selectByVisibleText("Option 1");
        obj.selectByValue("2");

    }

}