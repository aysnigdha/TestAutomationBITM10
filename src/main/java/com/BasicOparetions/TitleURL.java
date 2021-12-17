package com.BasicOparetions;

import com.base.Open_close_driverClass;

public class TitleURL extends Open_close_driverClass{

    public static void main(String[] args) {
        opera_launch();
        url_open("https://demo.opencart.com/") ;
        URL_Verification();
        Title_Verification();
        opera_close();
    }
      public static void Title_Verification(){
        String ExpectedTitle = "Your Store";
        String ActualTitle= driver.getTitle();
          System.out.println(ActualTitle);
          if(ExpectedTitle.equals(ActualTitle)){
              System.out.println("Title_Verification is passed");
          }
          else
              System.out.println("Title_Verification is failed");
      }
    public static void URL_Verification(){
        String ExpectedURL = "https://google.com/";
        String ActualURL= driver.getCurrentUrl();
        System.out.println(ActualURL);
        if(ExpectedURL.equals(ActualURL)){
            System.out.println("URL_Verification is passed");
        }
        else
            System.out.println("URL_Verification is failed");

    }

}
