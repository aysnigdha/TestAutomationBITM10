package com.BasicOparetions;

import com.base.BaseOfProject;

public class MultipleWindow extends BaseOfProject {
    public static void main(String[] args) {
         launchBrowser("chrome");
         url_open("https://the-internet.herokuapp.com/windows");
         switchTab();
    }
    public static void switchTab(){
        ClickOnElementByLinkText("Click Here");
    }
}
