package StepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrderStepDefinition extends LoginStepDefinition {
	@Given("^I click addtocart$")
	public void i_click_addtocart() throws Throwable {
		driver.findElement(By.xpath("")).click();
	  
	}

	@Given("^I click on cart$")
	public void i_click_on_cart() throws Throwable {
	  
	}

	@Given("^I enter the details$")
	public void i_enter_the_details() throws Throwable {
	   
	}

	@Given("^I place the order$")
	public void i_place_the_order() throws Throwable {
	    
	}

	@Then("^order is placed successfully$")
	public void order_is_placed_successfully() throws Throwable {
	  
	}


}
