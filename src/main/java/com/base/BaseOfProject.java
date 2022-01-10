package com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseOfProject {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        chrome_close();
        opera_launch();
        opera_close();
        edge_launch();
        edge_close();
        url_open("https://google.com/");
    }
    public static WebDriver launchBrowser(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else{
            System.out.println("please enter valid browser");
        }
            return driver;
    }
    public WebDriver closeBrowser(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            if (driver != null) {
                driver.close();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else if(browser.equalsIgnoreCase("opera")) {
            if (driver != null) {
                driver.close();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else if(browser.equalsIgnoreCase("edge")) {
            if (driver != null) {
                driver.close();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else{
            System.out.println("please enter valid browser");
        }
        return driver;
    }
    public WebDriver quitBrowser(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            if (driver != null) {
                driver.quit();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else if(browser.equalsIgnoreCase("opera")) {
            if (driver != null) {
                driver.quit();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else if(browser.equalsIgnoreCase("edge")) {
            if (driver != null) {
                driver.quit();
            }
            else
            {
                System.out.println("Nothing to close!No Browser can found..");
            }
        }
        else{
            System.out.println("please enter valid browser");
        }
        return driver;
    }
    public static void chrome_launch() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void chrome_close() {
       driver.close();
    }
    public static void opera_launch() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/Drivers/operadriver.exe");
        driver = new OperaDriver();
    }
    public static void opera_close() {
            driver.close();
    }
    public static void edge_launch() {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/Drivers/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    public static void edge_close(){
        driver.close();
    }
    public static void url_open(String url) {
        if (url == null) {
            System.out.println("URL is null!!!");
        }
        if (url.indexOf("http") == -1) {
            System.out.println("HTTP is missing in URL......");
        }
        driver.get(url);
    }
    public static void Locator_ID(String ID){
        driver.findElement(By.id(ID));
    }
    public static void Locator_Name(String Name){
        driver.findElement(By.name(Name));
    }
    public static void Locator_XPath(String XPath){
        driver.findElement(By.xpath(XPath));
    }
    public static void Locator_CSS(String CSS){
        driver.findElement(By.cssSelector(CSS));
    }
    public static void ClickOnElementByLinkText(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }
    //Click on Element
    public static void clickOnElementBy_ID(String id){
        driver.findElement(By.id(id)).click();
    }
    public static void clickOnElementBy_Name(String Name){
        driver.findElement(By.name(Name)).click();
    }
    public static void clickOnElementBy_Xpath(String Xpath){
        driver.findElement(By.xpath(Xpath)).click();
    }
    public static void clickOnElementBy_Css(String Css){
        driver.findElement(By.cssSelector(Css)).click();
    }
    public static void clickOnElementByLinkText(String LinkText){
        driver.findElement(By.linkText(LinkText)).click();
    }
    //Wait
    public static void smallWait() throws InterruptedException {
        Thread.sleep(3000);
    }
    public static void midWait() throws InterruptedException {
        Thread.sleep(7000);
    }
    public static void longWait() throws InterruptedException {
        Thread.sleep(10000);
    }
    public static void customWait(int MileSeconds) throws InterruptedException {
        Thread.sleep(MileSeconds);
    }

}

