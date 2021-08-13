package com.sauce.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart_Test {
	
	
	public void addToCart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
			
			
		    driver.get("https://www.saucedemo.com/");
		    
		    
		   driver.manage().window().maximize();
		
		 
		   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		
		   driver.findElement(By.xpath("//input[@id='login-button']")).click();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();//add to cart
		   driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();//click on cart
		   
		  String cart_item= driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		  String item_price=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
		  
		  System.out.println(cart_item);
		  System.out.println(item_price);
		  
		  Thread.sleep(3000);
		  driver.close();
		
		
	}

}
