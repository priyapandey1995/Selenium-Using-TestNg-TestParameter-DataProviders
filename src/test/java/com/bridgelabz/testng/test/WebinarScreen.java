package com.bridgelabz.testng.test;

import com.bridgelabz.tesng.main.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class WebinarScreen extends BaseClass {
        @Test(priority = 3)
        public void toLaunchWebinarPage() throws InterruptedException {
            driver.get("https://bldev.bridgelabz.com/webinar");

            boolean flag = driver.findElement(By.id("deftphnumber")).isDisplayed();
            if (flag){
                Thread.sleep(500);
                driver.findElement(By.id("deftphnumber")).sendKeys("8884327526");
                Thread.sleep(500);
            }
            Thread.sleep(500);
            driver.findElement(By.id("deftemail")).sendKeys("priyapandey8884.blr@gmail.com");
            Thread.sleep(500);

            driver.findElement(By.id("deftusername")).sendKeys("Priya");
            Thread.sleep(500);

            List<WebElement> elements = driver.findElements(By.xpath("//div"));
            System.out.println("No of elements: " +elements.size());
            for (int i=0; i<elements.size(); i++){
                System.out.println("Element text: "+elements.get(i).getAttribute("value"));
            }
            WebElement element = driver.findElement(By.id("deftyear"));
            Thread.sleep(500);
            element.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(500);
            element.click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//div[@value='2022']")).click();
            Thread.sleep(500);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("deftdegree")));
            element1.click();
            System.out.println("Text: " +element1.getText());
            driver.findElement(By.xpath("//*[@id=\"degreeStreamOptions\"]/div[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.id("deftsbtn")).click();
            Thread.sleep(500);
        }
}

