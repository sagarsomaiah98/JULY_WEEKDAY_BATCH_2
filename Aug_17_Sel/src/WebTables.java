import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
	//	driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarseleniumstl@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("*****");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(3000);
		
		/*
		 * String name=driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
		 * String address=driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
		 * String
		 * category=driver.findElement(By.xpath("//tbody/tr[2]/td[4]")).getText();
		 * String status=driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText();
		 * String phone=driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText();
		 */
		 
		
//System.out.println(name+" "+address+" "+category+" "+status+" "+phone );	
		
		int j=2;
		String name1=null;
		//System.out.println(name1);
		 name1=driver.findElement(By.xpath("//tbody/tr[" +j+"]/td[2]")).getText();
		//System.out.println(name1);


for( int i=1;i<=5;i++) {
	String name=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
	  String address=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[3]")).getText();
	  String
	  category=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText();
	  String status=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[5]")).getText();
	  String phone=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]")).getText();
	System.out.println(name+" "+address+" "+category+" "+status+" "+phone );
	
}

	}

}
