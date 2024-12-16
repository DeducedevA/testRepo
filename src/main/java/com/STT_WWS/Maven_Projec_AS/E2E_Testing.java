package com.STT_WWS.Maven_Projec_AS;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_Testing {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the WebDriver executable
        

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Items to be added to the cart
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        // Open the target page
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000); // This is not recommended, use explicit wait instead

        // Add items to the cart
        addItems(driver, itemsNeeded);

        // Proceed to checkout
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        // Wait until the promo code input is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        // Enter the promo code and apply
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        // Wait until the promo information is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        // Print the promo information
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        // Close the browser
        driver.quit();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> itemsNeededList = Arrays.asList(itemsNeeded);

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            if (itemsNeededList.contains(formattedName)) {
                j++;
                // Click on Add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
