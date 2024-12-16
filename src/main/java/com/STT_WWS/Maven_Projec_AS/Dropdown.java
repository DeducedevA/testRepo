package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdropdown);

		// Select by index number
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// select by visible text
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Select by value
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Clicking the drop-down
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(1000);

		// selecting the count of the adults using while loop
		int i = 1;

		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// selecting the count of the adults using for loop
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

		for (int i1 = 1; i1 < 5; i1++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.close();

	}

}
