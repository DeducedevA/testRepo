package com.STT_WWS.Maven_Projec_AS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		//Handling Auto suggestive drop-down
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options){

		if(option.getText().equalsIgnoreCase("India")){

		option.click();
		break;

			}
		}
		//---------------------------------------------------------------------------------------------
		
		//Dynamic drop-down with parent child relationship
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='PNY']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		//-----------------------------------------------------------------------------------------------------
		
		// Calendar start date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        
        // Radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        
        // Return Date
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today")).click();
        
        
        //------------------------------------------------------------------------------------------------------------------
        
		//selecting the passengers the drop-down
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
		Thread.sleep(1000);
		
		//selecting the count of the adults using while loop
		int i=1;
				
		while(i<5) {
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
		}
				
		driver.findElement(By.id("btnclosepaxoption")).click();
				
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
		//selecting the count of the child using for loop
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
				
		for(int i1=1; i1<5; i1++) 
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
						
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//-------------------------------------------------------------------------------------------------------
		
		//Currency drop-down
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
				
		//select by visible text
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//check-box
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		
		
		//----------------------------------------------------------------------------------------------------------
		//Search
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		//-----------------------------------------------------------------------------------------------------
		
		//browser close
		driver.close();
		
		//===========================================================================================================
		
		
		
		

	}
}
