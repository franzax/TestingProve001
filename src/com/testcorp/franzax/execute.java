package com.testcorp.franzax;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class execute {

    static void Click(FirefoxDriver driver, String element){
        driver.findElement(By.xpath(element)).click();
    }
    static void Type(FirefoxDriver driver, String element, String text){
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    static void SelectDropdown(FirefoxDriver driver, String element, String option){
        driver.findElement(By.xpath(element + "/option[contains(text(), '"+ option +"')]")).click();
    }

    static void SelectRadio(FirefoxDriver driver, String element, String option){
        driver.findElement(By.xpath(element + "'" + option + "']")).click();
    }

    static void Navigate(FirefoxDriver driver, String URL){
        driver.navigate().to(URL);
    }

    static void Wait(int Time) throws InterruptedException {
        Thread.sleep(Time);
    }
}
