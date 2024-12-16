package com.STT_WWS.Maven_Projec_AS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.tools.javac.util.Assert;

public class Test_Automation implements TestInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Login page
		// overall wait time for the entire code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

//		//id
//		driver.findElement(By.id("inputUsername")).sendKeys("Alphyas");
//		
//		//Name
//		driver.findElement(By.name("inputPassword")).sendKeys("Test@123");
//		
//		//ClassName
//		driver.findElement(By.className("signInBtn")).click();
//		
//		//CSS selector
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// for-get password
		// Link Test
//		driver.findElement(By.linkText("Forgot your password?")).click();

//		//X-path
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alphy");
//		
//		//customized CSS Selector
//		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("alphyas@wws.com");
//		
//		//customized X-path Selector by index
//		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9791525274");
//		//customized CSS selector Selector by index
//		//driver.findElement(By.cssSelector("input[type='text]:nth-child|[4]")).sendKeys("9791525274");
//		//X-path selector with tag name and child tag name
//		//driver.findElement(By.xpath("//input/input[3]")).sendKeys("9791525274");
//		
//		//reset Login
//		driver.findElement(By.className("reset-pwd-btn")).click();
//		
//		//CSS selector 
//		System.out.println(driver.findElement(By.className("infoMsg")).getText());
//		
//		//xpath regular expression
//		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
//		
		Thread.sleep(1000);
//		
		// usernmae
		driver.findElement(By.id("inputUsername")).sendKeys("Alphyas");

		// password
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		// checkbox
		driver.findElement(By.name("chkboxOne")).click();

		// sign in
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String password_txt = driver.findElement(By.className("infoMsg")).getText();
		String[] split1 = password_txt.split("'");
		String password = split1[1].split("'")[0];
		return password;

	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yellowGetReady() {
		// TODO Auto-generated method stub
		
	}

	
	}

