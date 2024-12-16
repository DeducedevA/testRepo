package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RealTime_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//1
		driver.findElement(By.id("checkBoxOption1")).click();
		String options =driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
	    System.out.println(options);
	    
	    //2
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select a = new Select(dropdown);
		a.selectByVisibleText(options);

		//3
		driver.findElement(By.id("name")).sendKeys(options);
		
		//4
		driver.findElement(By.id("alertbtn")).click();
		String str = driver.switchTo().alert().getText();
		
		if(str.contains(options)) {
			System.out.println("Alert Message is shown");
			driver.switchTo().alert().accept();
		}
		driver.quit();
		
		

	}

}
