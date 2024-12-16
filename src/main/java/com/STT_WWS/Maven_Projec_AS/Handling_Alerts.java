package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Accept the alert
		driver.findElement(By.id("name")).sendKeys("Alphy");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();

		// Reject the alert
		driver.findElement(By.id("name")).sendKeys("Alphy");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

		driver.close();

	}

}
