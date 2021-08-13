import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class TestPageElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Aug_12_Sel\\DRIVERS\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);// it will wait maximum of 30 seconds
		//WebElement ele=driver.findElement(By.linkText("This is a link"));
		//System.out.println(ele.getText());
		//ele.click();
		
		driver.findElement(By.linkText("This is a link")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("welcome");
		Thread.sleep(3000);
		driver.findElement(By.id("idOfButton")).click();
		
	driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
	Thread.sleep(3000);
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	//al.dismiss();
		
	WebElement sel=driver.findElement(By.xpath(""));
		Select sele = new Select(sel);
		
  
	}

}
