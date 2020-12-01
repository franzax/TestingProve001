package com.testcorp.franzax;

import org.openqa.selenium.firefox.FirefoxDriver;

public class InputForm {

    static void InsertElements(FirefoxDriver driver) throws InterruptedException {

        execute.Navigate(driver, url);
        execute.Type(driver, firstName, "Tester Name" );
        execute.Type(driver, lastName, "Tester Surname");
        execute.Type(driver, eMail, "tester@email.com");
        execute.Type(driver, phoneNumber, "(039) 035-4791");
        execute.Type(driver, address, "9th Avenue, Chesalpeak");
        execute.Type(driver, cityName, "Alberta");
        execute.SelectDropdown(driver, state, "Delaware");
        execute.Type(driver, zipCode, "31905");
        execute.Type(driver, webSiteName, "www.testingsite.io");
        execute.SelectRadio(driver, hosting, "no");
        execute.Type(driver, projectDesc, "This is a project dummy description.");

        execute.Wait(7600);

        execute.Click(driver, sendButton);
    }

    static String url = "https://www.seleniumeasy.com/test/input-form-demo.html";
    static String firstName = ".//input[@name = 'first_name']";
    static String lastName = ".//input[@name = 'last_name']";
    static String eMail = ".//input[@name = 'email']";
    static String phoneNumber = ".//input[@name = 'phone']";
    static String address = ".//input[@name = 'address']";
    static String cityName = ".//input[@name = 'city']";
    static String state = ".//select[@name = 'state']";
    static String zipCode = ".//input[@name = 'zip']";
    static String webSiteName = ".//input[@name = 'website']";
    static String hosting = ".//input[@name = 'hosting' and @value = ";
    static String projectDesc = ".//textarea[@name = 'comment']";
    static String sendButton = ".//button[@type = 'submit']";
}
