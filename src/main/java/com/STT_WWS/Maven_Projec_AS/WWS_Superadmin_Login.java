package com.STT_WWS.Maven_Projec_AS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WWS_Superadmin_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//login page
		driver.get("https://testing.mywwsbm.com/");
		
		//User name
		driver.findElement(By.id("basic_email")).sendKeys("superadmin@wonderws.com");
		
		//password
		driver.findElement(By.id("basic_password")).sendKeys("Wonderwsbm@24");
		
		//sign IN
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		
		Thread.sleep(3000);
		
		//settings
		driver.findElement(By.xpath("//span [text()='Settings']")).click();
		
		Thread.sleep(2000);
		
		//project
		driver.findElement(By.xpath("//a [text() ='Projects']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Temp");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a [text() ='Users']")).click();
		
		driver.close();
	
		
		
		

	}

}
