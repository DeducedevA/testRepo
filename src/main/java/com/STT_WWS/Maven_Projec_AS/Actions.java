package com.STT_WWS.Maven_Projec_AS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String paretID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		
//		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String emailID = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(paretID);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}

}
