package com.sauce.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut_Test {

	public void logOut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
			
			
		    driver.get("https://www.saucedemo.com/");
		    
		    
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		 
		   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		
		   driver.findElement(By.xpath("//input[@id='login-button']")).click();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		   driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		   Thread.sleep(3000);
		   driver.close();
	}
}
