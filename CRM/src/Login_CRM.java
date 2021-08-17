import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_CRM {
	
public static String random_String() {
		
		String[] alp= {"a","b","c","d","w","q","p","v","z","u","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) {
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		System.out.println(value);
			return value;	
				
	}

public static String random_number() {
	
	String[] alp= {"4","1","3","5","8","9","10","2","3","6"};
		
	int num;
	
	String value = "";
	for( int i=0;i<9;i++) {
	num= (int) (Math.random()*10);
	//System.out.println(num);
	value=alp[num]+value;
	}
	System.out.println(value);
		return value;	
			
}

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
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("****");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[@href='/contacts/new']/button")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(random_String());
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(random_String());
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(random_String());
		driver.findElement(By.xpath("//div[@name='category' and @role='listbox']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Lead')]")).click();
		driver.findElement(By.xpath("//div[@name='status' and @role='listbox']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();
		driver.findElement(By.xpath("//input[@Placeholder='Number']")).sendKeys(random_number());
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();


	}

}
