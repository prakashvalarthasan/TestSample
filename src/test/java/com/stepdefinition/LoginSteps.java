package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilities.GlobalLibrary;

import io.cucumber.java.en.*;

public class LoginSteps extends GlobalLibrary {
	
	@Given("As a user must be in redbus page")
	public void as_a_user_must_be_in_redbus_page() {
	   System.out.println("As a user must be in redbus page");
	}

	@When("user must login through mobile OTP")
	public void user_must_login_through_mobile_OTP() {
	   Assert.assertTrue(false);
	}

	@When("user must navigate booking page")
	public void user_must_navigate_booking_page() {
	   
	}

	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
	    System.out.println("\"User is on facebook page");
	}

	@When("User must enter credentials")
	public void user_must_enter_credentials() {
	   
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	   
	}

	@Then("User verify the success message")
	public void user_verify_the_success_message() {
	   
	}
	
	@Then("User verify the unsuccess message")
	public void user_verify_the_unsuccess_message() {
		Assert.assertTrue(false);
	}



}
