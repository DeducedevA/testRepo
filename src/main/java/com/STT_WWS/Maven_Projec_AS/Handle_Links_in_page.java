package com.STT_WWS.Maven_Projec_AS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Links_in_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		//Find the count of all links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Find the count of links in footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Find the count of the links in the first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on all the links of the column
		for (int i=1; i<columndriver.findElements(By.tagName("a")).size();i++){
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(3000);
		}
			
		//save all the tab name
//		Set <String> abc = driver.getWindowHandles();
//		Iterator<String> it = abc.iterator();
		
//		while(it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}
		
		//save all the tab name in actual order
		  Set<String> handles = driver.getWindowHandles();
	      List<String> windowHandles = new ArrayList<>(handles);
		
		 Collections.reverse(windowHandles);
		 
		 for (String handle : windowHandles) {
	            driver.switchTo().window(handle);
	            System.out.println(driver.getTitle());
	            
		 }
		
//		
		

	}

}
