import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		//how to launch browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
		
		//Navigate to url
	    driver.get("https://www.saucedemo.com/");
	    
	    //wait for 7 seconds
	    
	    Thread.sleep(7000);
	    
	    //Maximize browser
	   driver.manage().window().maximize();
	  try { 
	   //find the username field and enter username
	   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	   Thread.sleep(7000);
	   //find password field and enter password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	   Thread.sleep(7000);
	   //find login button and click login button
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   Thread.sleep(7000);
	   driver.close();
	   System.out.println("Login successfully");
          		
	  }
	  catch(Exception e) {
		  driver.close();
		  
		  System.out.println("login failed");
	  }
		

	}

}
