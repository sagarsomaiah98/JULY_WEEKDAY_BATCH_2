package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^launch the browser$")
	public void launch_the_browser()  {
	    System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
		
	}

	@And("^there user logs in through Login Window by using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String arg1, String arg2)  {
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   
	}

	@Then("^login must be successful\\.$")
	public void login_must_be_successful() {
		String title=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		assertEquals(title, "PRODUCTS");
		
		driver.close();
	   
	}


}
