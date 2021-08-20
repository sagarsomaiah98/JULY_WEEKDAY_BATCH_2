
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
			
			
		    driver.get("https://www.saucedemo.com/");
		    
		    
		   driver.manage().window().maximize();
		
		 
		   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		
		   driver.findElement(By.xpath("//input[@id='login-button']")).click();
		   Thread.sleep(3000);
		   driver.quit();
		   
		
	}

}
