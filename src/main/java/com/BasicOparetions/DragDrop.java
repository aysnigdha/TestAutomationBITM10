package com.BasicOparetions;


import com.base.BaseOfProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends BaseOfProject {
    public static void main(String[] args) {
        launchBrowser("chrome");
        open_URL("https://jqueryui.com/resources/demos/droppable/default.html");
        dragDropTest();
    }

    public static void open_URL(String url) {
        driver.get(url);
    }

    public static void dragDropTest() {
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        /*
        //Option 1
        act
                .clickAndHold(source)
                .moveToElement(target)
                .release()
                .build()
                .perform();
*/

        //Option 2
        act.dragAndDrop(source,target).build().perform();
    }
}
