package com.hyrtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String arg[]) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();


        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='alertBox']"));
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        //Thread.sleep(3000);
         simpleAlert.accept();
        Thread.sleep(3000);
          driver.quit();
    }
}

