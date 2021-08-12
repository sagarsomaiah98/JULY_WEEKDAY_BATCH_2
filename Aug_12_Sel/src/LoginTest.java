import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	public void login(String uname, String pwd) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
		   ChromeDriver driver= new ChromeDriver();
			
	 
		    driver.get("https://www.saucedemo.com/");
		    
		    //wait for 7 seconds
		    
		
		    
		    //Maximize browser
		   driver.manage().window().maximize();
		  
		   //find the username field and enter username
		   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		 
		   //find password field and enter password
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		   //find login button and click login button
		   driver.findElement(By.xpath("//input[@id='login-button']")).click();
		   Thread.sleep(3000);
			/*
			 * String actual=
			 * driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText()
			 * ; if(actual.equals("Products")) System.out.println("Login passed"); else
			 * System.out.println("Login failed");
			 */
		   driver.close();
		   
	          		
	}

	public static void main(String[] args) throws InterruptedException {
		
		LoginTest l = new LoginTest();
		l.login("standard_user", "secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("problem_user", "secret_sauce");
		

	}

}
