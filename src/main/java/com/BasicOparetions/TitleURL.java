package com.BasicOparetions;

import com.base.BaseOfProject;

public class TitleURL extends BaseOfProject {

    public static void main(String[] args) {
        edge_launch();
        url_open("https://google.com/") ;
        Title_Verification("Your Store");
        Url_Verification("https://demo.opencart.com/");
        opera_close();
    }
      public static void Title_Verification(String ExpectedTitle){
        String ActualTitle= driver.getTitle();
          System.out.println(ActualTitle);
          if(ExpectedTitle.equals(ActualTitle)){
              System.out.println("Title_Verification is passed");
          }
          else
              System.out.println("Title_Verification is failed");
      }
    public static void Url_Verification(String ExpectedUrl){
        String ActualUrl= driver.getCurrentUrl();
        System.out.println(ActualUrl);
        if(ExpectedUrl.equals(ActualUrl)){
            System.out.println("URL_Verification is passed");
        }
        else
            System.out.println("URL_Verification is failed!!! "+"Actual Url is:" +" Actual Url");

    }

}
