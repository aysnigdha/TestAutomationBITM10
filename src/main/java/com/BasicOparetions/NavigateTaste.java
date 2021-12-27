package com.BasicOparetions;

import com.base.Open_close_driverClass;

public class NavigateTaste extends Open_close_driverClass {
    public static void main(String[] args) {
        chrome_launch();
        url_open("https://google.com/");
        navigateTo();
        navigateBack();
        navigateForward();
    }
    public static void navigateTo(){
        driver.navigate().to("https://demo.opencart.com/");
        TitleURL.Title_Verification("Your Store");
    }
    public static void navigateBack(){
        driver.navigate().back();
        TitleURL.Title_Verification("Google");
    }
    public static void navigateForward(){
        driver.navigate().forward();
        TitleURL.Title_Verification("Your Store");
    }

}


