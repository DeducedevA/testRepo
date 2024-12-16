package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_example {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page Title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}