package com_Facebook_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com_facebook_runner.Testrunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionss {

	static WebDriver driver = Testrunner.driver;
	@Given("user Launch The Facebook Application Url")
	public void user_launch_the_facebook_application_url() {
	 
		driver.get("https://www.facebook.com/index.php/");
		
	}
	@When("user Going To Enter The Username In The Username Field")
	public void user_going_to_enter_the_username_in_the_username_field() {
	  driver.findElement(By.id("email")).sendKeys("vijay");
		
	}
	@When("user Going To Enter THe Password In The Password Field")
	public void user_going_to_enter_t_he_password_in_the_password_field() {
	
		driver.findElement(By.id("pass")).sendKeys("qwert");
		
	}
	@Then("user Click THe Log In Button And Navigate TO Next Page")
	public void user_click_t_he_log_in_button_and_navigate_to_next_page() {
	    
		driver.findElement(By.name("login")).click();
	
	}
	
	
}
