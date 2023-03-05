package com.bridgelabz.testng.test;

import com.bridgelabz.tesng.main.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class JavaScriptExecutor extends BaseClass {

    @Test
    public void execute() throws InterruptedException, AWTException {
        driver.get("https://www.guru99.com/api-testing.html");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        System.out.println("Execute script: " + executor.executeScript("return window.length"));

        int noOfFrames = Integer.parseInt(executor.executeScript("return window.length").toString());
        System.out.println("No of Frames: " + noOfFrames);

//        for (int i=0; i<=noOfFrames; i++){
//            System.out.println("Frame Title: " + driver.switchTo().frame(i).getTitle());
//        }
        executor.executeScript("window.scrollBy(0,1000)");

    }
}


