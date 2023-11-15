package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static String calculate(String firstValue, String secondValue) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("http://www.calculator.net/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();

        driver.findElement(By.id("cpar1")).sendKeys(firstValue);
        driver.findElement(By.id("cpar2")).sendKeys(secondValue);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/table/tbody/tr[2]/td/input[2]")).click();

        String result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[2]/font/b")).getText();

        driver.close();

        return result;
    }
}
