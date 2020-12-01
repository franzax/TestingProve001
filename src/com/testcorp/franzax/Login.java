package com.testcorp.franzax;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    static void successLogin(FirefoxDriver driver) throws InterruptedException {

        execute.Navigate(driver, loginUrl);
        execute.Type(driver, usernameInput, "tomsmith");
        execute.Type(driver, passwordInput, "SuperSecretPassword!");
        execute.Click(driver, loginButton);

        execute.Wait(1300);
    }

    static void wrongPasswordLogin(FirefoxDriver driver) throws InterruptedException{

        execute.Navigate(driver, loginUrl);
        execute.Type(driver, usernameInput, "tomsmith");
        execute.Type(driver, passwordInput, "WrongPassword!");
        execute.Click(driver, loginButton);

        execute.Wait(1300);
    }

    static void caseSensitiveLogin(FirefoxDriver driver) throws InterruptedException{

        execute.Navigate(driver, loginUrl);
        execute.Type(driver, usernameInput, "TOMSMITH");
        execute.Type(driver, passwordInput, "superSecretpassword!");
        execute.Click(driver, loginButton);

        execute.Wait(1300);
    }

    static String loginUrl = "http://the-internet.herokuapp.com/login";
    static String usernameInput = ".//input[@name = 'username']";
    static String passwordInput = ".//input[@name = 'password']";
    static String loginButton = ".//button[@type = 'submit']";

}
