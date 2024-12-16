package com.STT_WWS.Maven_Projec_AS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//driver
		WebDriver driver = new ChromeDriver();
		//URL
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//User-name
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		//Password
		driver.findElement(By.id("password")).sendKeys("learning");
		//radio button
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
		
		List<WebElement> phones = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0; i<phones.size(); i++) {
			phones.get(i).click();
		}

		driver.findElement(By.partialLinkText("Checkout")).click();	
	}

}
