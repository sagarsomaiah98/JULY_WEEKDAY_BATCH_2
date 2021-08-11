import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Different_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\chromedriver.exe");
		//	WebDriver driver= new ChromeDriver();
			
			
			//Firefox Browser
			System.setProperty("webdriver.gecko.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\geckodriver.exe");
		//	WebDriver driver1= new FirefoxDriver();
			
			//Edge Browser
			System.setProperty("webdriver.edge.driver", "D:\\JANBASK\\JULY_WEEKDAY_BATCH_2\\Sel_Aug_11\\DRIVERS\\msedgedriver.exe");
			WebDriver driver2= new EdgeDriver();

	}

}
