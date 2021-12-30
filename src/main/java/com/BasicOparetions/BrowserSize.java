package com.BasicOparetions;

import com.base.BaseOfProject;
import org.openqa.selenium.Dimension;

public class BrowserSize extends BaseOfProject {
    public static void main(String[] args) {
        chrome_launch();
        getMaximumWindowSize();
        setWindowSize();
        chrome_close();

    }
    public static void getMaximumWindowSize(){
        int MaxWidth= driver.manage().window().getSize().getWidth();
        int MaxHeight= driver.manage().window().getSize().getHeight();
        System.out.println("Maximum window size: Height= "+MaxHeight+" & Width= "+MaxWidth+"");
    }
    public static void setWindowSize(){
        driver.manage().window().setSize(new Dimension(900, 400));
    }
}
