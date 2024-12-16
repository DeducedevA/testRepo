package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		//Assignment check-box
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		//Check the first  Chec-kbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//
//		//How to get the Count of number of check boxes present in the page
//		System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());

		// Form Assignment
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// name
		driver.findElement(By.name("name")).sendKeys("Alphy");

		// E-mail
		driver.findElement(By.name("email")).sendKeys("alphy@wws.com");

		// password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");

		// check-box
		driver.findElement(By.id("exampleCheck1")).click();

		// drop-down
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);

		// radio button
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(3000);

		// D.O.B
		driver.findElement(By.name("bday")).sendKeys("16/02/1999");

		// submit
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);

		// Success message
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		driver.quit();

	}

}
