package com.testcorp.franzax;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FirefoxDriver  driver = new FirefoxDriver();
        driver.manage().window().maximize();

        InputForm.InsertElements(driver);

        //Login.successLogin(driver);
        //Login.wrongPasswordLogin(driver);
        //Login.caseSensitiveLogin(driver);
    }
}