import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class Screen_Shot {

	public static void screenshot() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Aug_17_Sel\\Screenshots\\homePageScreenshot.png");

		
FileUtils.copyFile(src, dest);
	}
		  
		public static void main(String[] args) throws IOException, InterruptedException {
			
			screenshot();
		}
		
		 

	}

